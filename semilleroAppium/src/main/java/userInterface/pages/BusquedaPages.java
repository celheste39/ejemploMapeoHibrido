package userInterface.pages;

import net.serenitybdd.screenplay.targets.Target;
import static userInterface.locators.BusquedaLocators.*;
import static utils.TipoClaseConstante.*;
import static utils.ElementFinder.*;

public class BusquedaPages {
    public static final Target BTN_BUSCAR =
            Target.the("Boton de busqueda")
                    .located(theElementBy(BTN_BUSCAR_LOC));

    public static final Target TXT_BUSCAR =
            Target.the("Barra de busqueda")
                    .located(theElementBy(TXT_BUSCAR_LOC));
}
