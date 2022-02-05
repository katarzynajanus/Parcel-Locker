public class University {

    public static void main(String[] args) {
        Student student = new Student(1,
                "Jan",
                "Kowalski",
                "Szczecin",
                1,
                2,
                "IT", "BC45");
        Teacher teacher = new Teacher(1,
                "Wacław",
                "Nowak",
                "Warszawa",
                "Java",
                20, "DCD2323");

        student.showPersonInfo();
        teacher.showPersonInfo();
    }
}

