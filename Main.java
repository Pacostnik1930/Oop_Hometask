

public class Main {
    public static void main(String[] args) {
        FamilyTree tree = new FamilyTree();

        tree.addHuman(new Human("Александр", Sex.Male));
        tree.addHuman(new Human("Ирина", Sex.Female));
        Human human = new Human("Петр",Sex.Male,null, 0, tree.getByName("Александр"),tree.getByName("Ирина"));
        tree.addHuman(human);
        tree.addHuman(new Human("Илья",Sex.Male,null, 0, tree.getByName("Александр"),tree.getByName("Ирина")));
        System.out.println(tree.getInfo());
    }
}