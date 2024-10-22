//Importergering af Arraylist
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//tilføjelse af arraylist
        ArrayList<Dancer> Dancers = new ArrayList<>();
        //Tilføjelse af Dansere ind i vores arraylist med navn (objekter)
        Dancers.add(new ElectricBoogieDancer("bob"));
        Dancers.add(new BreakDancer("Henning"));
        Dancers.add(new TangoDancer("olga"));
        Dancers.add(new Polkadancer("mikkel"));

        // løkke til at printe de forskellige dansere og deres danser.
        for (Dancer dancer : Dancers) {
            dancer.dance();
        }
    }
}