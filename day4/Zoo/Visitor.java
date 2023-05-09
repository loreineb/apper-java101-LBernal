package Zoo;

public class Visitors {
    String nameOfVisitor;
    private int visitorAge; //age is a secret but can be retrieved

    //since visitorAge is private, we can make methods that are public to get it
    public int getAge(){
        return visitorAge;
    }
    public void setAge(int visitorAge){
        this.visitorAge = visitorAge;
    }
}
