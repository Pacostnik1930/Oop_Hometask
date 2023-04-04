import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class FamilyTree implements Serializable {
    private List<Human> humanList;

    public FamilyTree(List<Human> humanList) {
        this.humanList = humanList;
    }

    public FamilyTree() {
        this(new ArrayList<>());
    }

    public void addHuman(Human human) {
        if (!humanList.contains(human)) {
            humanList.add(human);
        }
        if (human.getFaher() != null) {
            human.getFaher().addChild(human);
        }
        if (human.getMother() != null) {
            human.getMother().addChild(human);
        }
    }

    public Human getByName(String name){
        for(Human human: humanList){
            if (human.getName().equals(name)){
                return human;
            }
        }
        return null;
    }

    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append(humanList.size());
        for(Human human: humanList){
            sb.append(human.getInfo());
            sb.append(" \n");
        }
        return sb.toString();
    }
}