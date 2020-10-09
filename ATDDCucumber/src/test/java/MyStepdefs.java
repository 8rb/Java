import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStepdefs {

    private int registrados;
    private int iniciar;
    private int documento;
    private int totales;

    @Given("La entidad tiene {int} documentos registrados")
    public void laEntidadTieneRegistradosDocumentosRegistrados(int registrados) {
        this.registrados = registrados;
    }

    @And("La entidad se encuentre en la vista para registrar un documento")
    public void laEntidadSeEncuentreEnLaVistaParaRegistrarUnDocumento() {
    }

    @When("La entidad presione el boton {int} para iniciar el procedimiento")
    public void laEntidadPresioneElBotonIniciarParaIniciarElProcedimiento(int iniciar) {
        this.iniciar = iniciar;
    }

    @And("La entidad agregue el documento {int}")
    public void laEntidadAgregueElDocumentoDocumento(int documento) {
        this.documento = documento;
        if(this.iniciar == 1 && this.documento != 0){
            this.totales = this.registrados + this.documento;
        }
        else{
            this.totales = this.registrados;
        }
    }

    @Then("La entidad deberia tener {int} documentos registrados")
    public void laEntidadDeberiaTenerTotalesDocumentosRegistrados(int totales) {
        assertEquals(this.totales, totales);
    }
}
