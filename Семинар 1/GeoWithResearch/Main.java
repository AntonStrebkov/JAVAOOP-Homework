public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", "женщина");
        Person vasya = new Person("Вася", "мужчина");
        Person masha = new Person("Маша", "женщина");
        Person jane = new Person("Женя", "женщина");
        Person ivan = new Person("Ваня", "мужчина");
        GeoTree gt = new GeoTree();
        gt.append(irina, vasya);
        gt.append(irina, masha);
        gt.append(vasya, jane);
        gt.append(vasya, ivan);

        gt.appendBrother(vasya, masha);
        gt.appendBrother(ivan, jane);

        GeoTree geo = new GeoTree();
        geo.appendNode(vasya, Relationship.husband, irina);
        System.out.println(new Reserch(geo).spend(irina,
                Relationship.wife));

        System.out.println(new Reserch(gt).spend(irina,
                Relationship.parent));
        System.out.println(new Reserch(gt).searchSibling(vasya,
                Relationship.brother));
        System.out.println(new Reserch(gt).searchSibling(masha,
                Relationship.sister));
    }

}
