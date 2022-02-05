import java.util.Arrays;
import java.util.Random;

/*
Napisz klasę realizującą system lotto:
Klasa powinna zawierać pola takie jak:
- ostatnie losowanie (tablica liczb)
- liczba wygranych
- metodę do wykonania losowania (generowanie losowych 6 liczb z przedziału 1-49)
- metoda powinna przyjmować na wejściu zestaw 6
liczb i sprawdzać liczbę trafień, jeśli ktoś trafił 6 zwiększamy licznik wygranych
Zadbaj o odpowiedni dostęp do informacji o ostatnim losowaniu.
 */
public class Lotto {
    private int[] lastResults;
    private int win = 0;

    public void execute(int[] playerNumber) {
        int[] result = new int[6];
        Random random = new Random();
        for (int i=0;i<result.length;i++) {
            result[i] = random.nextInt(1, 50);
        }
        Arrays.sort(result);
        Arrays.sort(playerNumber);
        lastResults = result;
        //lastResults = {4 10 1 7 20 2}
        //playerNumber = {1 2 4 7 10 20}
        int counter = 0;
        for (int i=0;i<result.length;i++) {
            if(lastResults[i] == playerNumber[i]){
                counter++;
            }
        }
        if (counter == 6) {
            win++;
        }
    }

    public int[] getLastResults() {
        return lastResults;
    }

    public int getWin() {
        return win;
    }

    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        lotto.execute(new int[] {1, 9, 13, 17, 20, 34});
        System.out.println("Liczba 6: " + lotto.getWin());
        System.out.println("Aktualne wyniki: " + Arrays.toString(lotto.lastResults));
    }
}