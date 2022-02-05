/*
Napisz klasę Circle, która będzie zawierać infomrację taką jak:
- promień
Ukryj dostęp do pola klasy. Upublicznij mechanizm obliczania:
- pola koła
- obwodu okręgu
 */
public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateField() {
        double field = Math.PI * radius * radius;


        return field;
    }

    public double calculateCircumference() {
        double circumference = 2 * Math.PI * radius;


        return circumference;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("Obwód: " + circle.calculateCircumference());
        System.out.println("Pole: " + circle.calculateField());
    }

    }



