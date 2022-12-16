public class Cat{
    private final String name;
    private String owner;

    public Cat (String name, Owner o){
        this.name = name;
    }

    public void goOwner(String command){
        if(command.equals("кис-кис")){
            System.out.println(name + " Идет к хозяину");
        } else {
            System.out.println(name + " Не идет к хозяину");
        }
    }
}

