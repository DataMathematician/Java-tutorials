public class t14 {
    public static void main(String args[])
        throws java.io.IOException {
            char ch,answer = 'X';
            System.out.print("Enter char: ");
            ch = (char) System.in.read();
            System.out.println(ch);
            if (ch == answer)
                System.out.println("You have guessed!");
            else
                {
                    System.out.println("No");
                    if (ch > answer){
                        System.out.println("The answer less the entered");
                        System.out.println("The answer less the entered");}
                    else
                        System.out.println("The answer more the entered");
                }

    }
}
