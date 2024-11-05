package testSuite;

import activities.CrearLista;
import activities.PaginaPrincipal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CrearActualizarEmilinarLista {
    private PaginaPrincipal paginaPrincipal = new PaginaPrincipal();
    private CrearLista crearLista = new CrearLista();

    @Test
    public void verificarTodo(){

        //Crear Lista
        String tituloLista = "Examen final";
        paginaPrincipal.menuHamburquesa.click();
        paginaPrincipal.editarListaButton.click();
        crearLista.creaListaButton.click();
        crearLista.anadirTituloLista.setText(tituloLista);
        crearLista.guardarTareaButton.click();

        Assertions.assertTrue(crearLista.ItemLista(tituloLista).isControlDisplayed(), "Error la lista no fue creada");

        //Eliminar Lista

    }
}
