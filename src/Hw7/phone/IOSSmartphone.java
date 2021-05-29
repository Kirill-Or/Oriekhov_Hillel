package Hw7.phone;

public class IOSSmartphone extends Phone {
    private String iOsSystem;
    private String iOsChargingInterface;
    private String iOsStore;


    public String getIOsSystem() {
        return iOsSystem;
    }

    public void setIOsSystem(String iOsSystem) {
        this.iOsSystem = iOsSystem;
    }

    public String getIOsChargingInterface() {
        return iOsChargingInterface;
    }

    public void setIOsChargingInterface(String iOsChargingInterface) {
        this.iOsChargingInterface = iOsChargingInterface;
    }

    public String getIOsStore() {
        return iOsStore;
    }

    public void setIOsStore(String iOsStore) {
        this.iOsStore = iOsStore;
    }

    @Override
    void operatingSystem() {
        setIOsSystem( "IOS");
    }

    @Override
    void chargingInterface() {
        setIOsChargingInterface("lightning");
    }

    @Override
    void store() {
    setIOsStore("App store");
    }
}
