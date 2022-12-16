import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }
    public void appendBrother(Person brother, Person sister) {
        tree.add(new Node(brother, Relationship.brother, sister));
        tree.add(new Node(sister, Relationship.sister, brother));
    }
    public void appendNode(Person p1, Relationship r, Person p2){
        if(r == Relationship.husband){
            tree.add(new Node(p1, Relationship.husband, p2));
            tree.add(new Node(p2, Relationship.wife, p1));
        }
    }
}
