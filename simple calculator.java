import java.util.Scanner;
class scanner{
    public static void main(String args[]){
        Scanner input   = new Scanner (System.in);

        double fnum,snum,result;

        fnum = input.nextDouble();
        snum = input.nextDouble();
        result = fnum+snum;
        System.out.println("your result is : " + result);
    }
}


    

