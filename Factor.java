class Fact{
    boolean isFactor(int a, int b){
        if ((b % a) == 0) 
            return true;
        else
            return false;
    }
}

public class Factor {
    public static void main(String args[]){
        Fact  x = new Fact();
        if (x.isFactor(2, 20)) 
            System.out.println("Yes");
        if (x.isFactor(3, 20)) 
            System.out.println("None");
    }
}
