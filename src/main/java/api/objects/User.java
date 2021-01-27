package api.objects;

import com.google.gson.JsonObject;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Getter
@Setter
@ToString
public class User {
    public int id;
    public int orgId;

    public String name;
    public String login;
    public String email;
    public String password;
    public String avatarUrl;
    public String theme;
    public String lastSeenAt;
    public String lastSeenAtAge;
    public String updatedAt;

    public boolean isAdmin;
    public boolean isDisabled;
    public boolean isGrafanaAdmin;
    public boolean isExternal;

    public Object[] authLabels;

    public JsonObject asJsonObject() {
        JsonObject jsonObject = new JsonObject();

        jsonObject.addProperty("id", id);
        jsonObject.addProperty("orgId", orgId);
        jsonObject.addProperty("name", name);
        jsonObject.addProperty("login", login);
        jsonObject.addProperty("email", email);
        jsonObject.addProperty("password", password);
        jsonObject.addProperty("avatarUrl", avatarUrl);
        jsonObject.addProperty("lastSeenAt", lastSeenAt);
        jsonObject.addProperty("lastSeenAtAge", lastSeenAtAge);
        jsonObject.addProperty("updatedAt", updatedAt);
        jsonObject.addProperty("isAdmin", isAdmin);
        jsonObject.addProperty("isDisabled", isDisabled);
        jsonObject.addProperty("isGrafanaAdmin", isGrafanaAdmin);
        jsonObject.addProperty("isExternal", isExternal);
        jsonObject.addProperty("authLabels", Arrays.toString(authLabels));

        return jsonObject;
    }
}
