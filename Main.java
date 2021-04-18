package Atividade_8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("================\nFORMAS\n================\n");

        Circunferencia c;
        Triangulo t;
        Retangulo r;

        while (true) {
            System.out.println("CIRCUNFERÊNCIA\n");

            System.out.print("Digite o raio: ");
            Float raio = input.nextFloat();
            c = new Circunferencia(raio);
            System.out.println("\nInformações da circunferência:\n");
            c.mostra();

            System.out.println("\nRETÂNGULO\n");

            System.out.print("Digite a base: ");
            float base = input.nextFloat();
            System.out.print("Digite a altura: ");
            float altura = input.nextFloat();
            r = new Retangulo(base, altura);
            System.out.println("\nInformações do retângulo:\n");
            r.mostra();

            System.out.print("\nDigite qualquer tecla para continuar ou 0 para finalizar:  ");
            char resposta = input.next().charAt(0);

            if (resposta == '0'){
                System.out.println("Obrigado por usar nossa ferramenta!");
                break;
            };
            
            System.out.println();
        }
    }
}
