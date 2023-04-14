import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args){

        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args [2]);
        double altura = Double.valueOf(args [3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " " + "anos");
        System.out.println("Minha altura é " + altura + "cm");


        //criando objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String userNome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String userSobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int userIdade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double userAltura  = scanner.nextDouble();

        System.out.println("Ola, me chamo " + userNome + " " + userSobrenome);
        System.out.println("Tenho " + userIdade + " " + "anos");
        System.out.println("Minha altura é " + userAltura + "cm");



    }
}