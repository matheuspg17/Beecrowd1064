
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double numeros, total, media;
        int controle;
        controle = 0;
        total = 0.0;

        for (int i = 0; i < 6; i++) {
            numeros = leia.nextDouble();
            if (numeros > 0) {
                controle++;
                total = total + numeros;
            }
        }
        media = total / controle;
        System.out.println(controle + " valores positivos");
        System.out.printf("%.1f\n", media);
    }
}
