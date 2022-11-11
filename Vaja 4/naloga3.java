import java.util.Scanner;

class naloga3{
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;
        while(a>1){
            a/= 10;
            System.out.println(a);
            i++;
        }
        System.out.println((i-1));


    }
}