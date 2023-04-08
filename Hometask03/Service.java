import java.util.Collections;

public class Service {
    private FamilyTree familyTree;
    private static int id;

    public Service(FamilyTree familyTree) {
        this.familyTree = familyTree;

    }

    public void sortByName(FamilyTree familyTree) {
        Collections.sort(familyTree.getAllPeople());
    }

    public void sortByAge() {
        Collections.sort(familyTree.getAllPeople(), new HumanComporator());
    }
}