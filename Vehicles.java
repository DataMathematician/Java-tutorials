class Vehicle{
    int passengers;
    int fuelcap;
    int mpg;

    int range(){
        return fuelcap * mpg;
    }
}

public class Vehicles {
    public static void main(String args[]){
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1;
        int range2;

        minivan.passengers = 8;
        minivan.fuelcap = 50;
        minivan.mpg = 19;

        sportscar.passengers = 2;
        sportscar.fuelcap = 20;
        sportscar.mpg = 8;

        range1 = minivan.range();
        range2 = sportscar.range();

        System.out.println("Minivan: " + minivan.passengers + " for range of " + range1);
        System.out.println("Minivan: " + sportscar.passengers + " for range of " + range2);
    }
}
