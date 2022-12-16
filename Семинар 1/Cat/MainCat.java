public class MainCat {
    public static void main(String[] args) {
        Owner vasya = new Owner("Вася");
        Owner stepan = new Owner("Степан");
        Cat cat = new Cat("Мурзик", vasya);
        Cat cat1 = new Cat("Барсик", stepan);
//        cat.goOwner(vasya.speak());
        cat.goOwner(stepan.speak());
    }
}
