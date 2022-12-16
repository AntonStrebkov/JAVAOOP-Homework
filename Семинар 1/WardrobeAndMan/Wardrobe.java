import java.util.ArrayList;

public class Wardrobe {
    enum Door {
        Close,
        Open
    }

    public Door state;
    public ArrayList<String> items;

    public  Wardrobe(){
        this.items = new ArrayList<>();
        this.state = Door.Close;
    }

    public Door getState() {
        return state;
    }

    public void setState() {
        if (this.state == Door.Close) {
            this.state = Door.Open;
            return;
        } else {
            this.state = Door.Close;
            return;
        }
    }
}
