class Constructor{
    int x;
    Constructor(int i){
        x = i;
    }
}

public class Cons {
     public static void main(String args[]){
        Constructor t1 = new Constructor(10);
        Constructor t2 = new Constructor(20);

        System.out.println(t1.x + " " + t2.x);
    }    
}


