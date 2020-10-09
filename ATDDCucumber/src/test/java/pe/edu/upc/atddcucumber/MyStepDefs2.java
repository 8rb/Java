package pe.edu.upc.atddcucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStepDefs2 {

    private int actuales;
    private int registrarme;
    private int inscritos;

    @Given("Que el usuario se encuentra visualizando el detalle del curso previamente seleccionado")
    public void queElUsuarioSeEncuentraVisualizandoElDetalleDelCursoPreviamenteSeleccionado() {
    }

    @And("Y tenga {int} cursos inscritos")
    public void yTengaActualesCursosInscritos(int actuales) {
        this.actuales = actuales;
    }

    @When("El usuario le de click al boton {int}")
    public void elUsuarioLeDeClickAlBotonRegistrarmeEnCurso(int registrarme) {
        this.registrarme = registrarme;
        if(this.registrarme == 1){
            this.inscritos = this.actuales + 1;
        }
        else{
            this.inscritos = this.actuales;
        }
    }

    @Then("El usuario deberia tener {int} cursos inscritos")
    public void elUsuarioDeberiaTenerInscritosCursosInscritos(int inscritos) {
        assertEquals(this.inscritos, inscritos);
    }
}
