import java.util.Scanner;

public class Owner {
    private String name;
    private String owner;

    public void setName(String name) {
        this.name = name;
    }

    public Owner(String name){
        this.name = name;
    }
    public String speak(){
        Scanner in = new Scanner(System.in);
        String command = in.next();
        in.close();
        return command;
    }
}
