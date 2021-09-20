package utils;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;
import static utils.TipoClaseConstante.CLASE_UTILIDAD;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class ElementFinder {
    private static final String ANDROID = "Android";
    private static final String PLATFORM_NAME = "platformName";

    private ElementFinder() {
        throw new IllegalStateException(CLASE_UTILIDAD);
    }

    public static String getPlatformCapability() {
        AppiumDriver driver = getProxiedDriver();
        return driver.getCapabilities().getCapability(PLATFORM_NAME).toString();
    }

    public static String dynamicElement(Locator baseLocator) {
        return (getPlatformCapability().equals(ANDROID))
                ? baseLocator.build().getAndroidLocatedBy()
                : baseLocator.build().getIosLocatedBy();
    }

    public static By theElementBy(Locator baseLocator) {
        return (getPlatformCapability().equals(ANDROID))
                ? baseLocator.build().getAndroid()
                : baseLocator.build().getIos();
    }
}
