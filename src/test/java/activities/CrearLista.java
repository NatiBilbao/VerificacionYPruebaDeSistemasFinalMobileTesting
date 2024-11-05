package activities;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class CrearLista {
    public Button creaListaButton = new Button(By.xpath("//android.widget.TextView[@content-desc=\"Add List\"]\n"));
    public TextBox anadirTituloLista = new TextBox(By.xpath("//android.widget.EditText[@resource-id=\"com.vrproductiveapps.whendo:id/categoryTitle\"]\n"));
    public Button guardarTareaButton = new Button(By.xpath("//android.widget.TextView[@content-desc=\"Save\"]\n"));

    public Button ItemLista(String tituloLista) {
        return new Button(By.xpath("//android.widget.TextView[@text='" + tituloLista + "']"));
    }
}
