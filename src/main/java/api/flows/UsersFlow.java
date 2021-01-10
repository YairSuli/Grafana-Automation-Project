package api.flows;

import api.ApiActions;
import api.objects.User;

public class UsersFlow extends BaseFlows {

    public UsersFlow(ApiActions ApiActions) {
        super(ApiActions);
    }

    public User[] getAllUsers() {
        return apiActions.get("/users").as(User[].class);
    }

    public int createNewUser(User user) {
        int id;
        id = apiActions.post(user.asJsonObject(), "/admin/users").jsonPath().get("id");
        System.out.println("id is: " + id);
        return id;
    }

    public void updateUser(User user, int userId) {
        apiActions.put(user.asJsonObject(), "/users/" + userId);
    }

    public void deleteUser(int userId) {
        apiActions.delete("/admin/users/" + userId);
    }

    public User getUserById(int id) {
        return apiActions.get("/users/" + id).as(User.class);
    }

    public boolean isUserExist(int userId) {
        User[] users = getAllUsers();
        for (User user : users) {
            if (user.getId() == userId)
                return true;
        }
        return false;
    }
}
