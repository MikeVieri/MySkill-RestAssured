package AzureAPI.APIPayload;

import org.json.JSONObject;

public class PostUser {
    public static JSONObject CreateUser()
    {
        JSONObject datauser = new JSONObject();
        datauser.put("id", 20);
        datauser.put("title", "Activity 20");
        datauser.put("dueDate", "2025-08-14T21:34:16.1789313+00:00");
        datauser.put("completed", false);
        return datauser;
    }
}
