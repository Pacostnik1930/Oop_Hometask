import javax.print.DocFlavor.STRING;
import javax.xml.crypto.Data;
import java.util.List;
import java.sql.Date;
import java.util.ArrayList;

public class Human {
    private String name;
    private Sex sex;
    private Data birthDate;
    private int age;
    private Human mother;
    private Human father;
    private List<Human> children;

    public Human(String name,Sex sex){
        this.name = name;
        this.sex = sex;
    }


    public Human(String name,Sex sex,Data birthDate,int age,Human mother,Human father){
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
        this.age = age;
        this.mother = mother;
        this.father = father;
        children = new ArrayList<>();
    }

    public boolean addChild(Human child){
        if(!children.contains(child)){
            children.add(child);
            return true;
            
        }
        return false;
    }

   public Human getMother(){
    return mother;
   }

   public Human getFaher(){
    return father;
   }

   public Sex getSex(){
    return sex;
   }
    
    public String getName(){
        return name;
    }
    
    public Data getBirthdate(){
        return birthDate;
    }

    public void setBirthDate(){
        this.birthDate = birthDate;
    }
    public int getAge(){
        return age;
    }
   public String getInfo(){
    StringBuilder sb = new StringBuilder();
    sb.append("Имя");
    sb.append(name);
    sb.append(", ");
    sb.append(getMotherInfo());
    sb.append(", ");
    sb.append(getFatherInfo());
    sb.append(", ");
    sb.append(getChildrenInfo());
    return sb.toString();

   }

   public String getMotherInfo(){
    String res = " Мать";
    if (mother != null){
        res += mother.getName();
    }
    else{
        res += "не найдена";
    }
    return res;
   }

   public String getFatherInfo(){
    String res = " Отец";
    if (mother != null){
        res += father.getName();
    }
    else{
        res += "не найден";
    }
    return res;
   }

   public String getChildrenInfo(){
    StringBuilder res = new StringBuilder();
    res.append("Дети");
    if(children.size() != 0){
        for (int i = 0;i<children.size(); i++){
            res.append(", ");
            res.append(children.get(i).getName());
        }
    }
        else{
            res.append("отсутсвует");
        }
    return res.toString();
    }
   
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Human)){
            return false;
        }
        Human human = (Human) obj;
        return human.getName().equals(getName());
    }

}