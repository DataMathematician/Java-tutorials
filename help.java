public class help {
    public static void main(String args[])
        throws java.io.IOException{
            System.out.println("1. if");
            System.out.println("1. switch");
            System.out.println("Choose: ");
            char choice;
            choice = (char) System.in.read();

            switch(choice){
                case '1':
                    System.out.println("if:\n");
                    System.out.println("if (condition) operator;");
                    System.out.println("else operator;");
                    break;
                case '2':
                    System.out.println("switch:\n");
                    System.out.println("whitch (condition) {''}");
                    System.out.println("\tcase const:");
                    System.out.println("sequence of operators");
                    System.out.println("break;");
                    System.out.println("// ...");
                    System.out.println("}");
                    break;
                default:
                    System.out.println("can't find request");
            }

    }
}
