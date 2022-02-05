package MobileDevice;

public class MobilePhone extends MobileDevice{
    private boolean lteSupport;

    public MobilePhone(float screenSize, int ramMemory, String cpu, String operatingSystem, String type, boolean lteSupport) {
        super(screenSize, ramMemory, cpu, operatingSystem, "Mobile Phone");
        this.lteSupport = lteSupport;
    }

    @Override
    public void showMobileDeviceInfo() {
        super.showMobileDeviceInfo();
        System.out.println("LTE support: " + lteSupport);
    }
}
