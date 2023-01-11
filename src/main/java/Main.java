import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi, adet=0, toplam=0;
        double ortalama;
        System.out.print("Bir Sayi giriniz : ");
        sayi = input.nextInt();

        for (int i = 0;i <= sayi; i++){
            if (i % 12 == 0 ){
                
                toplam+=i;
                adet++;
            }

        }
        ortalama=toplam/adet;
        System.out.println("Ortalama : " +ortalama);

    }
}
