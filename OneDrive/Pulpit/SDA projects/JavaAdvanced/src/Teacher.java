public class Teacher extends Person {
    private String specialization;
    private int seniority;

    public Teacher(int id, String name, String lastName, String address, String specialization, int seniority, String documentId) {
        super(id, name, lastName, address, documentId);
        this.specialization = specialization;
        this.seniority = seniority;
    }
}

