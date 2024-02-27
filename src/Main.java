import java.util.Scanner;

public class Main {

    public static boolean asalSayi(int sayi){
        boolean result = true;
        for(int i = 2; i < sayi; i++){
            if(sayi % i == 0){
                result = false;
                break;

            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi;
        System.out.println("Sayı Giriniz : ");
        sayi = inp.nextInt();
        if(asalSayi(sayi) == true){
            System.out.println("Sayı asaldır. ");
        }else{
            System.out.println("Sayı asal değildir. ");
        }

    }

}