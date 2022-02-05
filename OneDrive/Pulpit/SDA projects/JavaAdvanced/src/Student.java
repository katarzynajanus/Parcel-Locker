public class Student extends Person {

    private int yearOfStudies;
    private int groupNumber;
    private String studyType;

    public Student(int id, String name, String lastName, String address, int yearOfStudies, int groupNumber, String studyType, String documentId) {
        super(id, name, lastName, address, documentId);
        this.yearOfStudies = yearOfStudies;
        this.groupNumber = groupNumber;
        this.studyType = studyType;
    }




}