class Vehicle{
    int passengers;
    int fuelcap;
    int mpg;

    void range(){
        System.out.println("Minivan: " + passengers + " for range of " + fuelcap * mpg);
    }
}

public class Vehicles {
    public static void main(String args[]){
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        minivan.passengers = 8;
        minivan.fuelcap = 50;
        minivan.mpg = 19;

        sportscar.passengers = 2;
        sportscar.fuelcap = 20;
        sportscar.mpg = 8;

        minivan.range();
        sportscar.range();
    }
}
