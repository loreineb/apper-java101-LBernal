import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> cars = new HashMap<>();
        //a map is O(1) !! impt
        //be directly accessed kahit multiple data, as long as may access ka sa key
        //madaming iba iba na data struc, like linkedlist ganun, map is one of them
        cars.put("c1", "Innova");
        cars.put("c2", "Fj Cruiser");
        cars.put("c3", "Expander");
        //cars.put("c3", "Car"); //if you put another c3 dito, papalitan ni "Car" value si "Expander"
        //we look using keys and not the value kasi faster and mas appropriate
        cars.put("c4", "Vios");
        cars.put("c5", "Honda");
        cars.put("c6", "Tesla");

        System.out.println(cars.get("c4"));
        System.out.println(cars.size());
        System.out.println(cars.keySet());
        System.out.println(cars.containsKey("c7"));
        System.out.println(cars.containsValue("Fj Cruiser"));
    }
}

interface Animal {
    void drink();
    void eat();
    void sleep();
    void play();
}

class Tiger implements Animal {

    //you can also extend a class THEN implement multiple interfaces
    //from the net: extend when you want the new class to have all the same features of the original, and something more.
    // The child class may then either add new functionalities, or override some funcionalities of the parent class
    //interface is a template and contrata siya, like kunyari, you have Animal fish, di pwedeng maassociate with animals na may legs, gusto mo no legs
    //KEY WORDS: template and contract !! 
  
    @Override
    //Override so you don't have a compile time error
    public void eat() {
        System.out.println("Tiger goes nomnomnom");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger goes zzz");
    }

    @Override
    public void play() {
        System.out.println("Tiger plays");
    }

    public void drink(){
        System.out.println("Tiger goes glugluglug");
    }
}
