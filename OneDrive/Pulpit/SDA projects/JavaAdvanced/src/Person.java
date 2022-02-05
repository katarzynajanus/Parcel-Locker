public class Person {
    private int id;
    private String name;
    private String lastName;
    private String address;
    private String documentId;

    public Person(int id, String name, String lastName, String address, String documentId) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.documentId = documentId;
    }

    public void showPersonInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("LastName: " + lastName);
        System.out.println("Address: " + address);
        System.out.println("Document ID: " + documentId);
    }
}
