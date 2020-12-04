public class t16 {
    public static void main(String args[]){
        double num,sroot,rerr;

        for (num = 1;num < 100;num ++){
            sroot = Math.sqrt(num);
            System.out.println("SQRoot of " + num +  " is " + sroot);
            rerr = num - (sroot * sroot);
            System.out.println("Error: " + rerr + '\n');
        }
    }
}
