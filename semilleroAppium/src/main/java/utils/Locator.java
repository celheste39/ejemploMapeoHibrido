package utils;

import javafx.util.Builder;

public class Locator implements Builder<BaseLocator> {
    private String android;
    private String ios;

    public Locator() {
        this.android = "";
        this.ios = "";
    }

    public static Locator locator() {
        return new Locator();
    }

    public Locator withAndroid(String android) {
        this.android = android;
        return this;
    }

    public Locator withIos(String ios) {
        this.ios = ios;
        return this;
    }

    public String getAndroid() {
        return android;
    }

    public String getIos() {
        return ios;
    }

    @Override
    public BaseLocator build() {
        return new BaseLocator(this);
    }
}
