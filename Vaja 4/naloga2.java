
import java.util.Scanner;

class naloga2{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();


        if (a<b){
           while(a<=b){
               System.out.println(a+"^2 = "+(a*a));
               a++;
           }
        }
        else{
            System.out.println("Wrong");
        }

       
    }
}