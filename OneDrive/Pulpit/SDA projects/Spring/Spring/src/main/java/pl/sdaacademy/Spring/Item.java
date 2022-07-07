package pl.sdaacademy.Spring;

//napisz metodę POST, która przyjmie jako ciało obiekt Item (pola id, description),
// gdzie w ramach metody zostanie wygenerowane id (wartość w przedziale 1 do 1000)
//zwróć obiekt item. Do metody przekaż obiekte Item z polem description

public class Item {
    private int id;
    private String description;

    public Item(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
