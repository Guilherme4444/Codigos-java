import java.util.Scanner;

public class LeituraDoTeclado {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome compelto:");
        String nomeCompleto = scan.nextLine();
        System.out.println("Se nome completo é: " + nomeCompleto); 

        System.out.println("Digite seu primeiro nome compelto:");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);

        System.out.println("Digite sua idade:");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade);

        System.out.println("Digite sua altura:");
        double altura = scan.nextDouble();
        System.out.println("Sua altura é : " +altura);

    }
}

    