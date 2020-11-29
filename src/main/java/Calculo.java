import java.util.Scanner;
public class Calculo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao calculador,\n" + "Selecione a opção desejada:\n" +  "1 - calcular IMC \n" +  "2 - Calcular peso ideal.\n");
        int escolha;
        escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Informe seu peso: ");
            double kg;
            kg = scanner.nextDouble();
            System.out.println("Informe sua altura: ");
            double h;
            h = scanner.nextDouble();

            Calculo.calculaimc(kg,h);

        }
        else if(escolha == 2){

            System.out.println("Informe sua altura:");
            double h;
            h = scanner.nextDouble();
            char s;
            System.out.print("Digite H ou M para especificar o sexo: ");
            s = scanner.next().charAt(0);

            Calculo.calculapesoideal(s,h);

        }


    }
    public static Double calculaimc(double kg, double h) {


        double resultado = kg / (h * h);

        if (resultado < 18.5) {
            System.out.println( "Seu IMC é: " + resultado);
            System.out.println( "Você esta abaixo do peso");
            return resultado;
        } else if (resultado >= 18.5 && resultado < 25) {
            System.out.println( "Seu IMC é: " + resultado);
            System.out.println("Você está ótimo");
            return resultado;
        } else if (resultado >= 25 && resultado <30) {
            System.out.println( "Seu IMC é: " + resultado);
            System.out.println("Você está acima do peso");
            return resultado;
        } else if (resultado >= 30) {
            System.out.println( "Seu IMC é: " + resultado);
            System.out.println("Você está obeso");
            return resultado;}
          else {
            return 0.00;


    }
    }

    public static Double calculapesoideal(char s, double h) {

        if (s == 'H' || s == 'h'){
            double PesoIdeal = ( 72.7* h ) - 58;
            System.out.println( "Seu peso ideal e: " + PesoIdeal);
            return PesoIdeal;
        }
        else if (s == 'm' || s == 'M'){
            double PesoIdeal = ( 62.1 * h ) - 44.7;
            System.out.println( "Seu peso ideal e: " + PesoIdeal);
            return PesoIdeal;
        }
        else {
            return 0.00;
        }


    }


}

