package userInterface.locators;

import utils.Locator;

public class BusquedaLocators {
    public static final Locator BTN_BUSCAR_LOC =
            Locator.locator()
                    .withAndroid("xpath$//android.widget.ImageView[@content-desc='Buscar']");
    public static final Locator TXT_BUSCAR_LOC =
            Locator.locator()
                    .withAndroid("xpath$//*[contains(@text,'Buscar')]");
}
