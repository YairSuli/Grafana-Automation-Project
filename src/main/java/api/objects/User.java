package api.objects;

import com.google.gson.JsonObject;

import java.util.Arrays;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrgId() {
        return orgId;
    }

    public void setOrgId(int orgId) {
        this.orgId = orgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getLastSeenAt() {
        return lastSeenAt;
    }

    public void setLastSeenAt(String lastSeenAt) {
        this.lastSeenAt = lastSeenAt;
    }

    public String getLastSeenAtAge() {
        return lastSeenAtAge;
    }

    public void setLastSeenAtAge(String lastSeenAtAge) {
        this.lastSeenAtAge = lastSeenAtAge;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public boolean isDisabled() {
        return isDisabled;
    }

    public void setDisabled(boolean disabled) {
        isDisabled = disabled;
    }

    public boolean isGrafanaAdmin() {
        return isGrafanaAdmin;
    }

    public void setGrafanaAdmin(boolean grafanaAdmin) {
        isGrafanaAdmin = grafanaAdmin;
    }

    public boolean isExternal() {
        return isExternal;
    }

    public void setExternal(boolean external) {
        isExternal = external;
    }

    public Object[] getAuthLabels() {
        return authLabels;
    }

    public void setAuthLabels(Object[] authLabels) {
        this.authLabels = authLabels;
    }

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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", orgId=" + orgId +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", theme='" + theme + '\'' +
                ", lastSeenAt='" + lastSeenAt + '\'' +
                ", lastSeenAtAge='" + lastSeenAtAge + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", isAdmin=" + isAdmin +
                ", isDisabled=" + isDisabled +
                ", isGrafanaAdmin=" + isGrafanaAdmin +
                ", isExternal=" + isExternal +
                ", authLabels=" + Arrays.toString(authLabels) +
                '}';
    }
}
