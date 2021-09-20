package tasks;

import com.ibm.icu.impl.UResource;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static userInterface.pages.BusquedaPages.*;

public class BusquedaRapida implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_BUSCAR),
                Enter.keyValues("Videos de risa").into(TXT_BUSCAR),
                Enter.keyValues(Keys.ENTER).into(TXT_BUSCAR)
        );
    }
    public static BusquedaRapida on(){
        return Instrumented.instanceOf(BusquedaRapida.class).withProperties();
    }
}
