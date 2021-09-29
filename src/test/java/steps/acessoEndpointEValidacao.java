package steps;

import components.components;
import io.cucumber.java.en.*;

public class acessoEndpointEValidacao {

    components component;

    @Given("que seja acessado API {string}")
    public void que_seja_acessado_api(String url) {
        component = new components(url);
        component.endpointReturn();
    }

    @When ("for validado o valor do campo name que seja igual a {string}")
    public void for_validado_o_valor_do_campo_name_que_seja_igual_a(String value) {
        component.validationPath("data.first_name", value);
    }

    @Then("efetuado o teste de contrato ou schema")
    public void efetuado_o_teste_de_contrato_ou_schema() {
        component.validationSchema();
    }

}
