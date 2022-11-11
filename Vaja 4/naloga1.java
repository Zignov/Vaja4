import java.util.Scanner;


class naloga1{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a<b){

            for (;a<b;a++){
                if (a%4 == 0 && (a%100 != 0  || a%400 != 0)){
                    System.out.println(a + " je prestopno leto");
                }
                else{
                    System.out.println(a+ " ni prestopno leto");
                }

            }

        }
        else{
            System.out.println("Podatki niso vredu.");
        }
    }
}