package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<String> name = new HashSet<>();
        name.add("1");
        name.add("2");
        name.add("3");
        name.add("4");
        System.out.println(name);
        for(String number : name){
            System.out.println(number);
        }
//        for (int i =1; i<name.size();i++){
//            System.out.println(name);
//        }
    }
}
