class tutor{
    public static void main(String args[]){
        double gallons,litres;
        int c;
        c = 0;
        for (gallons = 1; gallons <= 100; gallons++){
            litres = gallons * 3.7854;
            System.out.println(gallons + " gallons are " + litres + " litres");
            c ++;
            if (c == 10){
                System.out.println();
                c = 0;
            }
        }
    }
}