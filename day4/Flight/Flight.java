package Flight;

public class Flight {
    int seats;
    int passengers;

    Flight(){
        seats = 10;
        passengers = 0;
    }

    //TODO validate if there are available seats left. If none, display "Full"
    public void addPassenger(){
        if (passengers < seats) {
            this.passengers++;
        } else {
            System.out.println("Full");
        }
        //System.out.println(passengers); to test
    }

    //TODO set new value of seats so addPassenger is allowed again
    public void setNumberOfSeats(int seats){
        this.seats = seats; //ctrl + click to see which yung mababago, like this.seats is referring to int seats mismo
        //pero if just seats, it's referring to the int seats inside setNumberOfSeats
    }
}
