package Modulo2.Set;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> ninjaSet = new HashSet<>();
        ninjaSet.add("Naruto Uzumaki");
        ninjaSet.add("Sasuke Uchiha");
        ninjaSet.add("Sakura Haruno");
        ninjaSet.add("Naruto Uzumaki");
        System.out.println("Ninjas Set: " + ninjaSet);
    }
}
