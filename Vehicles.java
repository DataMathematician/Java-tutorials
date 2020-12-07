class Vehicle{
    int passengers;
    int fuelcap;
    int mpg;

    int range(){
        return fuelcap * mpg;
    }
    
    double fuelneeded(int miles){
        return (double) miles / mpg;
    }
}

public class Vehicles {
    public static void main(String args[]){
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        int dist = 212;
        double gallons;
        
        minivan.passengers = 8;
        minivan.fuelcap = 50;
        minivan.mpg = 19;

        sportscar.passengers = 2;
        sportscar.fuelcap = 20;
        sportscar.mpg = 8;

        gallons = minivan.fuelneeded(dist);
        System.out.println("Minivan: " + minivan.passengers + " for range of " + minivan.range());
        System.out.println("gas in gallons "  + gallons + '\n');

        gallons = sportscar.fuelneeded(dist);
        System.out.println("Minivan: " + sportscar.passengers + " for range of " + sportscar.range());
        System.out.println("gas in gallons "  + gallons + '\n');
    }
}
