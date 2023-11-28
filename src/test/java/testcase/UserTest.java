package testcase;

import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import request.UserRequest;
import testdata.UserData;

import static org.hamcrest.Matchers.equalTo;

public class UserTest {

    @Test
    @DisplayName("Deve retornar token e username válidos quando as credenciais são válidas")
    public void deveRetornarTokenEUsernameQuandoCredenciaisValidas() {
        Response response = UserRequest.requestToken(UserData.validUser());
        String token = response.jsonPath().getString("token");
        response.then()
                .statusCode(HttpStatus.SC_OK)
                .body("username", equalTo(UserData.validUser().getUsername()));
    }

    /* Exemplos de validações com Rest Assured:

response.then().statusCode(200); // Verifica se o status é 200

response.then().body("chave", equalTo("valorEsperado")); // Verifica um valor específico

response.then().header("Content-Type", "application/json"); // Verifica o cabeçalho Content-Type

response.then().time(lessThan(5000L)); // Tempo de resposta deve ser menor que 5000ms

response.then().body("lista.size()", is(4)); // Verifica se a lista tem 4 elementos

response.then().body("lista", hasItem("valorEsperado")); // Verifica se a lista contém um valor específico

response.then().body("id", equalTo(10), "nome", equalTo("João")); // Verifica múltiplos valores

response.then().body("dados.usuario.nome", equalTo("Maria")); // Verifica um campo aninhado

response.then().body(containsString("parteDoTexto")); // Verifica se a resposta contém uma string específica

response.then().assertThat().body(matchesJsonSchemaInClasspath("esquema.json")); // Valida contra um esquema JSON

     */
}
