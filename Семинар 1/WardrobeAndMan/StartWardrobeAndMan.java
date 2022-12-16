import java.util.ArrayList;
import java.util.Random;

public class StartWardrobeAndMan {
    public static void main(String[] args) {
        Random r = new Random();
        Man vasya = new Man("Василий");
        Wardrobe wardrobe = new Wardrobe();

        ArrayList<String> items = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            items.add("item" + r.nextInt(7));
        }
        for (int i = 0; i < 13; i++) {
            vasya.addItems("item" + r.nextInt(8), wardrobe);
        }
        System.out.println(wardrobe.items.toString());
        vasya.takeItems("item1", wardrobe);
        System.out.println(wardrobe.items.toString());
    }
}
