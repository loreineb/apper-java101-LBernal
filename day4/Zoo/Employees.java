package Zoo;

public class Employees {
    public String employeeName;
    private double salary; //salary can have decimals

    //feeds an animal assigned to him and has salary visible to managers
    public void feedAnimal(){
        Animals obj = new Animals();
        String food = obj.foodOfAnimal;
        String name = obj.nameOfAnimal;
        //creating an instance of the Animals class so the employees know what food to feed which animal
        //no need for get and set methods since foodOfAnimal and nameOfAnimal is public
        //if statement would be used when running, e.g. if animal = this, feed this etc
    }

    //since salary is private, we can make methods that are public to get it
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
}
