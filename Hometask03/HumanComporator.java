import java.util.Comparator;


public class HumanComporator implements Comparator<Human> {
    @Override
    public int compare(Human mother, Human father) {
        return Integer.compare(mother.getBirthdate(), father.getBirthdate());
    }
}
