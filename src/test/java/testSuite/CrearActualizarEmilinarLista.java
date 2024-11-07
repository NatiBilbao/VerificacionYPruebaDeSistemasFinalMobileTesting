package testSuite;

import activities.EditListScreen;
import activities.ListFormScreen;
import activities.MainScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

public class CrearActualizarEmilinarLista {
    MainScreen mainScreen = new MainScreen();
    ListFormScreen listFormScreen = new ListFormScreen();
    EditListScreen editListScreen = new EditListScreen();

    @Test
    public void listCRUDTest(){
        mainScreen.menuButton.click();
        mainScreen.editListButton.click();
        editListScreen.addListButton.click();
        listFormScreen.tittleTxtBx.setText("Examen1");
        listFormScreen.colorButton.click();
        listFormScreen.saveButton.click();
        editListScreen.newListButton.click();

        Assertions.assertEquals("Examen1",listFormScreen.tittleTxtBx.getText(),
                "ERROR no se creo la lista");

        listFormScreen.tittleTxtBx.clearSetText("Examen1Updated");
        listFormScreen.saveButton.click();
        editListScreen.newListButton.click();

        Assertions.assertEquals("Examen11Updated",listFormScreen.tittleTxtBx.getText(),
                "ERROR no se actualizo la lista");

        listFormScreen.deleteButton.click();
        listFormScreen.confirmDeleteButton.click();

        Assertions.assertFalse(editListScreen.newListButton.isControlDisplayed(),
                "ERROR no se eliminó la lista");

    }

    @AfterEach
    public void close(){
        Session.getInstance().closeApp();
    }
}
