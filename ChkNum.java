public class ChkNum {
    boolean isEven(int x){
        if ((x % 2) == 0) 
            return true;
        else
            return false;
    }
}
class ParmDemo{
    public static void main(String args[]){
        ChkNum e = new ChkNum();

        if (e.isEven(10)) 
            System.out.println("Even");
        if (e.isEven(9))
            System.out.println("Odd");
        if (e.isEven(8))
            System.out.println("Even");
    }
}
