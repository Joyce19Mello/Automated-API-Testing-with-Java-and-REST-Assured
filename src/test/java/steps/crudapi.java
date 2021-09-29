package steps;
import components.components;
import io.cucumber.java.en.*;

public class crudapi {

    components component;

    @Given("que for acessado o endpoint {string}")
    public void que_for_acessado_o_endpoint(String url) {
        component = new components(url);
    }

    @When("seja efetuado o CREATED")
    public void seja_efetuado_o_created() {
        component.postEndpoint();
    }

    @When("seja efetuado o UPDATE")
    public void seja_efetuado_o_update() {
        component.updateEndpoint();
    }

    @Then("seja efetuado o DELETE")
    public void seja_efetuado_o_delete() {
        component.deleteEndpoint();
    }

}
