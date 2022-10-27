import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, toplam = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Bir sayı giriniz : ");
            a = input.nextInt();
            if (a%4 == 0){
                toplam += a;
            }
        } while(a>0);

        System.out.print("Toplam : " + toplam);

    }
}