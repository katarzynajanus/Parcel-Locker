import java.util.Scanner;

public class ParcelLockerPresenter {
    private ParcelLockerService parcelLockerService = new ParcelLockerService();

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Wybierz opcję: ");
            System.out.println("1. Wprowadź paczkomat");
            System.out.println("2. Wyświetl paczkomaty");
            System.out.println("3. Usuń paczkomat");
            int option = scanner.nextInt();
            switch (option) {
                case 1: insertParcelLocker(); break;
                case 2: showParcelLockers(); break;
                case 3: removeParcelLocker(); break;
            }
        } while (true);
    }

    public void insertParcelLocker() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj id (0-200):");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Podaj nazwe (2-10 znaków):");
        String name = scanner.nextLine();

        System.out.println("Podaj adres (ulica,miasto,kod-pocztowy): ");
        String address = scanner.nextLine();

        System.out.println("Podaj ładowność (0-100): ");
        int capacity = scanner.nextInt();

        boolean isValid = parcelLockerService.addParcelLocker(id, name, address, capacity);
        if (!isValid){
            System.out.println("Podane dane są nieprawidłowe! ");
            insertParcelLocker();
        }else {
            System.out.println("Dane zostały wprowadzone pomyślnie!");

        }
    }



    public void showParcelLockers() {
        System.out.println("Dostępne paczkomaty: ");
        for (ParcelLocker parcelLocker : parcelLockerService.getParcelLockers()) {
            if (parcelLocker != null) {
                System.out.printf("Paczkomat: %d, %s, %s, %d\n",
                        parcelLocker.getId(),
                        parcelLocker.getName(),
                        parcelLocker.getAddress(),
                        parcelLocker.getCapacity());
            }
        }
    }

    public void removeParcelLocker(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ID paczkomatu: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        parcelLockerService.removeParcelLocker(id);

    }
}


