public class IPhoneSettings {

    private IPhoneSettings() {

    }

    private static IPhoneSettings instance;
    private int brightness;
    private boolean wifi;

    public static IPhoneSettings getInstance() {
        if (instance == null) {
            instance = new IPhoneSettings();
        }
        return instance;
    }

    public String getBrightness() {

        return "Brightness level: " + brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public String getWiFi() {

        return "WiFi connection status: " + wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

}
