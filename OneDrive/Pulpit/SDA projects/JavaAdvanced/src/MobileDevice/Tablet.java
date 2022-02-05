package MobileDevice;

public class Tablet extends MobileDevice{
    private boolean pencilSupport;

    public Tablet(float screenSize, int ramMemory, String cpu, String operatingSystem, String type, boolean pencilSupport) {
        super(screenSize, ramMemory, cpu, operatingSystem, "Tablet");
        this.pencilSupport = pencilSupport;
    }

    @Override
    public void showMobileDeviceInfo() {
        super.showMobileDeviceInfo();
        System.out.println("Pencil support: " + pencilSupport);
    }
}
