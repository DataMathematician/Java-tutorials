class t28{
    int passengers;
    int fuelcap;
    int mpg;
}

class Demo{
    public static void main(String args[]){
        t28 minivan = new t28();
        int range;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Passangers: " + minivan.passengers + "\nRange: " + range);
    }
}