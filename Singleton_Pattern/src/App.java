public class App {
    public static void main(String[] args) throws Exception {
        IPhoneSettings iPhoneSettings = IPhoneSettings.getInstance();
        iPhoneSettings.setBrightness(5);
        iPhoneSettings.setWifi(true);

        System.out.println(iPhoneSettings.getBrightness());
        System.out.println(iPhoneSettings.getWiFi());
    }
}
