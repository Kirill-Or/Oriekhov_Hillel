package Hw7.phone;

public class SmartphoneTester {
    public static void main(String[] args) {
        IOSSmartphone iOSSmartphone = new IOSSmartphone();
        iOSSmartphone.operatingSystem();
        iOSSmartphone.chargingInterface();
        iOSSmartphone.store();
        iOSSmartphone.dialingANumber();
        System.out.println("Your operation system is : " + iOSSmartphone.getIOsSystem());
        System.out.println("Your  charging Interface is : " + iOSSmartphone.getIOsChargingInterface());
        System.out.println("Your store is : " + iOSSmartphone.getIOsStore());

        AndroidSmartphone androidSmartphone = new AndroidSmartphone();
        androidSmartphone.operatingSystem();
        androidSmartphone.chargingInterface();
        androidSmartphone.store();
        androidSmartphone.dialingANumber();
        System.out.println("Your operation system is : " + androidSmartphone.getAndroidOperatingSystem());
        System.out.println("Your  charging Interface is : " + androidSmartphone.getAndroidChargingInterface());
        System.out.println("Your store is : " + androidSmartphone.getAndroidStore());
    }
}