package api.flows;

import api.ApiActions;
import api.objects.User;
import io.qameta.allure.Step;

public class UsersFlow extends BaseFlows {

    public UsersFlow(ApiActions ApiActions) {
        super(ApiActions);
    }

    @Step("Get all users.")
    public User[] getAllUsers() {
        return apiActions.get("/users").as(User[].class);
    }

    @Step("Create new user.")
    public int createNewUser(User user) {
        int id;
        id = apiActions.post(user.asJsonObject(), "/admin/users").jsonPath().get("id");
        System.out.println("id is: " + id);
        return id;
    }

    @Step("Update user.")
    public void updateUser(User user, int userId) {
        apiActions.put(user.asJsonObject(), "/users/" + userId);
    }

    @Step("Delete user.")
    public void deleteUser(int userId) {
        apiActions.delete("/admin/users/" + userId);
    }

    @Step("Get user by id.")
    public User getUserById(int id) {
        return apiActions.get("/users/" + id).as(User.class);
    }

    @Step("Check if user exist.")
    public boolean isUserExist(int userId) {
        User[] users = getAllUsers();
        for (User user : users) {
            if (user.getId() == userId)
                return true;
        }
        return false;
    }
}
