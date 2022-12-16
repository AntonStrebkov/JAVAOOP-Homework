import java.util.ArrayList;
import java.util.Collections;

public class Man {
    private String name;

    public Man(String name) {
        this.name = name;
    }

    public void openWardrobe(Wardrobe w) {
        w.setState();
        if (w.getState() == Wardrobe.Door.Close) {

            System.out.println(name + " открывает шкаф!");
        } else {
            System.out.println(name + " закрывает шкаф!");
        }
    }
    public void addItems(String items, Wardrobe w) {
        w.state = Wardrobe.Door.Open;
        w.items.addAll(Collections.singleton(items));
        w.state = Wardrobe.Door.Close;
    }
    public void takeItems(String item, Wardrobe w) {
        openWardrobe(w);
        if (w.getState() == Wardrobe.Door.Open) {
            System.out.println(name + " берет " + item);
            w.items.remove(w.items.indexOf(item));
            w.state = Wardrobe.Door.Close;
        }
    }
}

