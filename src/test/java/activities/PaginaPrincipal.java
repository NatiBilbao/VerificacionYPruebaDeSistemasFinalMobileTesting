package activities;

import controls.Button;
import org.openqa.selenium.By;

public class PaginaPrincipal {
    public Button menuHamburquesa = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]\n"));
    public Button editarListaButton = new Button(By.xpath("//android.widget.CheckedTextView[@resource-id=\"com.vrproductiveapps.whendo:id/design_menu_item_text\" and @text=\"Edit Lists\"]\n"));
}
