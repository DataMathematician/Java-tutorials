public class t13 {
    public static void main(String args[])
        throws java.io.IOException {
            char ch, answer = 'S';
            System.out.print("Try to guess. Enter char:");
            ch = (char) System.in.read();
            if (ch == answer)
                System.out.println("You guessed!");
            else 
                System.out.println("You haven't guessed!");
    }
}
