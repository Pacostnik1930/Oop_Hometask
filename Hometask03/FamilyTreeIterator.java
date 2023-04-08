import java.util.Iterator;
import java.util.List;

public class FamilyTreeIterator implements Iterator<Human> {
    private List<Human> allPeople;
    private int index;

    public FamilyTreeIterator(List<Human> allPeople) {
        this.allPeople = allPeople;
    }

    @Override
    public boolean hasNext() {
        return index < allPeople.size();
    }

    @Override
    public Human next() {
        return allPeople.get(index++);
    }
}