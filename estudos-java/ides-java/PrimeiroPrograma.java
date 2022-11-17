import java.security.IdentityScope;
import java.util.Scanner;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira os números da soma: ");
        int a = scan.nextInt();
        int b = scan.nextInt();      
      System.out.println("A soma é: "+ (a+b));
      Gato gato = new Gato("Salsinha", "Cinza", 1);
      System.out.println("Nome: "+ gato.nome+ " " + "Cor: "+ gato.cor+ " " + "Idade: "+ gato.idade);
    }
}