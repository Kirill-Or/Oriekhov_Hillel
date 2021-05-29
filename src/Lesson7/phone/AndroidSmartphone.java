package Lesson7.phone;

public class AndroidSmartphone extends Phone {

    private String AndroidOperatingSystem;
    private String AndroidChargingInterface;
    private String AndroidStore;

    public String getAndroidOperatingSystem() {
        return AndroidOperatingSystem;
    }

    public void setAndroidOperatingSystem(String androidOperatingSystem) {
        AndroidOperatingSystem = androidOperatingSystem;
    }

    public String getAndroidChargingInterface() {
        return AndroidChargingInterface;
    }

    public void setAndroidChargingInterface(String androidChargingInterface) {
        AndroidChargingInterface = androidChargingInterface;
    }

    public String getAndroidStore() {
        return AndroidStore;
    }

    public void setAndroidStore(String androidStore) {
        AndroidStore = androidStore;
    }

    @Override
    void operatingSystem() {
        setAndroidOperatingSystem( "Android");
    }

    @Override
    void chargingInterface () {
        setAndroidChargingInterface("Type-C");

    }

    @Override
    void store() {
        setAndroidStore( "Play Market");
    }
}