package Zoo;

public class Managers {
    public String managerName;
    private int managerAge;
    public String title;

    public void getEmployeeSalary(){
        Employees obj = new Employees();
        //creating an instance of class Employees to use the public method getSalary for managers to retrieve the private employee salary
        double salary = obj.getSalary();
    }
}
