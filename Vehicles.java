class Vehicle{
    int passengers;
    int fuelcap;
    int mpg;

    Vehicle(int p,int f, int m){
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    int range(){
        return fuelcap * mpg;
    }
    
    double fuelneeded(int miles){
        return (double) miles / mpg;
    }
}

public class Vehicles {
    public static void main(String args[]){
        Vehicle minivan = new Vehicle(8,50,19);
        Vehicle sportscar = new Vehicle(2,20,8);
        int dist = 212;
        double gallons;

        gallons = minivan.fuelneeded(dist);
        System.out.println("Minivan: " + minivan.passengers + " for range of " + minivan.range());
        System.out.println("gas in gallons "  + gallons + '\n');

        gallons = sportscar.fuelneeded(dist);
        System.out.println("Minivan: " + sportscar.passengers + " for range of " + sportscar.range());
        System.out.println("gas in gallons "  + gallons + '\n');
    }
}
