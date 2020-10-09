import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDef3 {

    private int actuales;
    private int registrarme;
    private int inscritos;

    @Given("Que el usuario se encuentra viendo la lista de cursos disponibles")
    public void queElUsuarioSeEncuentraViendoLaListaDeCursosDisponibles() {
    }

    @And("Y posea {int} cursos")
    public void yPoseaActualesCursos(int actuales) {
        this.actuales = actuales;
    }

    @When("El usuario presione el boton {int}")
    public void elUsuarioPresioneElBotonInscribirseEnCurso(int registrarme) {
        this.registrarme = registrarme;
        if(this.registrarme == 1){
            this.inscritos = this.actuales + 1;
        }
        else{
            this.inscritos = this.actuales;
        }
    }

    @Then("Su cantidad de cursos inscritos seria {int}")
    public void suCantidadDeCursosInscritosSeriaNueva(int inscritos) {
        assertEquals(this.inscritos, inscritos);
    }
}
