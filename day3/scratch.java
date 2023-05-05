public class Datatypes {
    static int age; //valid yan, kunyari mamaya ko pa gusto lagyan
    //pag nasa labas yung variable, it's global
    //zero or default value ng int is 0
    static double salary;
    static boolean isHappy;
    //pwede ka nang ijudge na hindi ka happy, pagkadeclare palang
    //like bakit wala ka pang dinedeclare, may verdict na siya
    //can control the flow of the program from the get-go kasi may hawak na siya na value
    static char favoriteLetter;
    static float weight;
    static long distance;
    //better na wag mo hayaan na gamitin yung default, lagay mo nalang mismo, like distance = 4000
    //lazy initialization daw if ganun
    //point ni Java is like ayaw niya na in the middle of execute, makikita niya walang laman
    //null pointer exception: every time we access a value dapat may laman, doesn't make sense if magpopoint sa kawalan ganun

    static Integer wrapperAge;
    public static void main(String[] args) {
        //zero value: anong value niya pag inaccess ko and wala pang nakaset
        //sout to see default values
//        System.out.println(age);
//        System.out.println(salary);
//        System.out.println(isHappy);
//        System.out.println(favoriteLetter);
//        System.out.println(distance);
        //System.out.println(age + " " + wrapperAge);
        //wrapper class: to wrap primitive data types
        //age = 0 and wrapperAge = null -> 0 is still a value, it represents something, so null is more appropriate
        // 0 != null, same applies, false != null
        // null + 10 di pwede, pero 0 + 10 pwede
        //pwedeng same variable name, pero it's referring to two different data stores dahil sa pass by value and pass by reference
        //all wrappers are pass by value
        //pass by reference, forget mo na primitive and wrappers

        //methods have no concept of what's happening sa main branch, make sure lang na the data type it's receiving is the same

        //Java introduced the difference between class and objects, NOTE: SA JAVA, MGA OBJECTS LANG PWEDE MAGKA

        //pwede pala one line lang magdeclare ng variables e.g
        int a = 9, b = 10, c = 78;
//        System.out.println(a + b * c); //this follows MDAS so b*c muna then add si a
//        System.out.println((a+b)*c); //put parentheses
        //modulo (%) has the same precedence as multiplication and division

        //testing prefix and post fix
        int x1 = 5;
        int y1 = x1++;
        System.out.println(x1 + " and " + y1);
        //this gives 6 and 5; y1 is equal to 5 here kasi nassign muna yung initial value ni x1 which is 5 kay y1, tsaka palang mag iincrement
        //tignan mo nalang order so like y1 = x1++, visually, nauna muna si (y1 = x1) kesa kay ++

        int x2 =5;
        int y2 = ++x2;
        System.out.println(x2 + " and " + y2); //this gives 6 and 6; y1 is equal to 6 here kasi bago pa yung operation, nag increment na

    }

}


//notes
//named data storage
//has a type
//  primitive type: built in, foundation of all types; mga lolo sila
//  non primitive
//camel case

//trivia: may ascii na daw emojis

public class SwitchStatements{
    public static void main(String[] args) {
        //String animal = "goat";

//        if (animal.equals("dog")){
//            System.out.println("arf arf");
//        } else if (animal.equals("cat")){
//            System.out.println("meow meow");
//        } else if (animal.equals("goat")){
//            System.out.println("meeh meeh");
//        } else if (animal.equals("cow")) {
//            System.out.println("moo moo");
//        }
        //you can do a lot of if statements rather than else if pero ang tagal nun, inefficient
        //else if kasi, once na hindi na satisfied, stop na, pero if statements lahat, edi kahit hindi na pasok, they'll still go through it

        //switch statements: better
        Animal animal = Animal.DOG;
        switch(animal) {
            case DOG : System.out.println("arf arf"); break; //break is to stop executing the switch
            case CAT : System.out.println("meow meow"); break;
            case GOAT : System.out.println("meeh meeh"); break;
            case COW: System.out.println("moo moo"); break;
            //default: System.out.println("Yehey!"); //doesn't need to be at the end, pero para lang if else
            //Pag may enum ka na, you don't need to have default na kasi FIXED na yung pwede lang icheck for cases
        }
        //minsan possible na multiple cases, you want the same output, kunyari weekdays ganun
    }

    public enum Animal { //public enum and public class are usually separate files
        DOG, CAT, COW, GOAT; //eto lang yung within the scope ng class

        //the statements below shows just how powerful enum is
        //NOTE NA LAHAT SA JAVA IS CASE SENSITIVE

//        private String description;
//        Animal(String description) {
//            this.description = description;
//        }
    }

}

public class Person{ //PUBLIC class means other classes can access it
    //each object have different characters or functions, you'll make them interact with one another
    //main goal is to mimic real life
    //object encapsulate data, operations, and user semantics
    //allow storage and manipulation details to be hidden
    //separates what is to be done from how it is done

    //packages is like a group of classes, a folder

    //a Class is a template for creating objects
    //

    //is the field for computation? int, long, double if ever
    //does it need to be accurate
    //so if di need to compute and is accurate: string

    //ANYTHING ASIDE FROM VOID METHOD, DAPAT MAY IREREUTRN
    // E.G. pag public String, dapat may irereturn na String

    //make public the variables or fields para accessible or kita sa iba
    //tho dapat di daw ginagawa na public dapat may specific classes and packages lang that can access it
    
    //analogy: kunyari class Cake with fields/attributes, egg, flour, sugar tapos you create methods with those attributes like checkIfEggIsFresh ganun
