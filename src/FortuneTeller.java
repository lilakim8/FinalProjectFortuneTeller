import java.util.ArrayList;
import java.util.Random;

public class FortuneTeller {
    private ArrayList<String> fortunes;
    private Random rand;

    public FortuneTeller() {
        fortunes = new ArrayList<>();
        rand = new Random();
        fortunes.add("You will have a merry Christmas!");
        fortunes.add("You will have a scary Christmas...");
        fortunes.add("You will fall in love!");
        fortunes.add("You will grow a new tooth!");
        fortunes.add("You will lose a limb...");
        fortunes.add("You will grow another finger!");
        fortunes.add("You will be blessed with many fortunes!");
        fortunes.add("Someone you know has betrayed you...");
        fortunes.add("Float like a butterfly, sting like a bee...");
        fortunes.add("Float like a bee, sting like a butterfly...");
    }

    public String getRandomFortune() {
        if (fortunes.isEmpty()) {
            return "No fortunes available.";
        }
        return fortunes.get(rand.nextInt(fortunes.size()));
    }

    public void addFortune(String fortune) {
        fortunes.add(fortune);
    }

    public void removeFortune(String fortune) {
        fortunes.remove(fortune);
    }

    public ArrayList<String> getAllFortunes() {
        return fortunes;
    }
    //ADD FortuneTeller HANDLING
}
