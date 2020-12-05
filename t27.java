public class t27 {
    public static void main(String args[])
        throws java.io.IOException{
            char ch,ignore, answer = 'S';

            do{
                System.out.println("Enter: ");
                ch = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                }   while(ignore != '\n');
                if (ch == answer) 
                    System.out.println("Correct!");
                else{
                    System.out.println("Incorrect!");
                    if (ch < answer)
                        System.out.println("Closer to Z");
                    else 
                        System.out.println("Closer to A");
                    System.out.println("Try again\n");
                }
            } while (answer != ch);

    }
}
