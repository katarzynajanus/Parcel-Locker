package MobileDevice;

public class MobileDevice {
    /*
Stwórz klasę MobileDevice, która będzie klasą bazową z polami:
- rozmiar wyświetlacza
- pamięć ram
- cpu
- system operacyjny
- typ urządzenia
Stwórz dodatkowo dwie klasy dziedziczące po klasie MobileDevice:
- MobilePhone z polami: LTE support
- Tablet -> pencil support
Stwórz metodę w klasie bazowej:
- showDeviceInfo, która wyświetli szczegóły urzadzenia
- metoda powinna zostać nadpisana w klasach pochodnych (wyświetlenie dodatkowych szczegółów)
 */

    protected float screenSize;
    protected int ramMemory;
    protected String cpu;
    protected String operatingSystem;
    protected String type;

    public MobileDevice(float screenSize, int ramMemory, String cpu, String operatingSystem, String type) {
        this.screenSize = screenSize;
        this.ramMemory = ramMemory;
        this.cpu = cpu;
        this.operatingSystem = operatingSystem;
        this.type = type;
    }

    public void showMobileDeviceInfo(){
        System.out.println("Screen size: " + screenSize);
        System.out.println("RAM memory: " + ramMemory);
        System.out.println("cpu: " + cpu);
        System.out.println("Operating system: " + operatingSystem);
        System.out.println("Mobile device type: " + type);
    }


}

