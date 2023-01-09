import java.util.Locale;
import java.util.Scanner;

public class altura {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serao digitadas:");

        int n;
        n = sc.nextInt();

        String nome[] = new String[n];
        int idade[] = new int[n];
        double altura[] = new double[n];
        double alturam = 0;

        for (i=0;i<n;i++){
            System.out.println("Dados da "+i+"a pessoa");
            System.out.print("Nome:");
            nome[i] = sc.nextString();
            idade[i] = sc.nextInt();
            altura[i] = sc.nextDouble();
        }

        for (i=0;i<n;i++){
            alturam = alturam + altura[i];
        }

        System.out.print("\n"+"Altura media:");
        alturam = alturam/n;

    }
}
