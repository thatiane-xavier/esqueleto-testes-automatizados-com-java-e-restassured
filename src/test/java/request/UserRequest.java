package request;

import io.restassured.response.Response;
import model.UserModel;
import static io.restassured.RestAssured.given;

public class UserRequest {
    private static final String PATH = "https://site.com/auth/login";

    public static Response requestToken(UserModel user){
        return given()
                .contentType("application/json")
                .body(user)
                .when()
                .post(PATH);
    }
}
