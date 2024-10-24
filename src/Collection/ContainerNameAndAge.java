package Collection;

import java.util.HashSet;
import java.util.Set;

public class ContainerNameAndAge {
    public static void main(String[] args) {
     // NameContainer information = new NameContainer("mirgisa",30);
      //information.toString();
       // System.out.println(information);
        Set<NameContainer> information = new HashSet<>();
        NameContainer person1 = new NameContainer("Wafi", 25);
        information.add(person1);
        System.out.println(person1);

    }
}

class NameContainer{
    //private String NameContainer;
    private String name;
    private int age;


   public  NameContainer(String name,int age){
       this.name=name;
       this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "NameContainer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
