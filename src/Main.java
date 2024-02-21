import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        int toplam = 0;

        // Sayının basamaklarını toplama
        while (sayi != 0) {
            // Sayının birler basamağını alarak toplama ekleme
            toplam += sayi % 10;
            // Sayının birler basamağını atarak bir basamak sağa kaydırma
            sayi /= 10;
        }
        System.out.println("Sayının basamaklarının toplamı: " + toplam);
    }
}
