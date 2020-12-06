class Vehicle{
    int passengers;
    int fuelcap;
    int mpg;
}

public class Vehicles {
    public static void main(String args[]){
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1,range2;

        minivan.passengers = 8;
        minivan.fuelcap = 50;
        minivan.mpg = 19;

        sportscar.passengers = 2;
        sportscar.fuelcap = 20;
        sportscar.mpg = 8;

        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.println("Minivan: " + minivan.passengers + " for range of " + range1);
        System.out.println("Sportscar: " + sportscar.passengers + " for range of " + range2);
    }
}
