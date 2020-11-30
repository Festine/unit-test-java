import java.util.Scanner;
public class Calculo {

    public static double resultado;
    public static int escolha;
    public static char s;

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao calculador,\n" + "Selecione a opção desejada:\n" + "1 - calcular IMC \n" + "2 - Calcular peso ideal.\n");

        escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Informe seu peso: ");
            double kg;
            kg = scanner.nextDouble();
            System.out.println("Informe sua altura: ");
            double h;
            h = scanner.nextDouble();

            Calculo.calculaimc(kg, h);

        } else if (escolha == 2) {
            double h;
            System.out.println("Informe sua altura:");
            h = scanner.nextDouble();

            System.out.print("Digite H ou M para especificar o sexo: ");
            s = scanner.next().charAt(0);

            Calculo.calculapesoideal(s, h);

        }

    }

    public static void validaSexo(char h) throws Exception {

        if (s != 'h' && s != 'H' && s != 'm' && s != 'M') {
            System.out.println("Sexo indefinido");
            throw new Exception("Sexo indefinido");
        }
    }

    public static void validaOpcao(int escolha) throws Exception {
        if (escolha != 1 && escolha != 2) {
            System.out.println("Essa opção não está disponível\n");
            throw new Exception("Essa opção não está disponível\n");
        }
    }

    public static Double calculaimc(double kg, double h) throws Exception {

        if (kg <= 0) {
            System.out.println("Não e possivel calcular peso negativo");
            throw new Exception("Não e possivel calcular peso negativo");
        } else if (h <= 0) {
            System.out.println("Não e possivel calcular altura negativa");
            throw new Exception("Não e possivel calcular altura negativa");
        }

        resultado = kg / (h * h);

        if (resultado < 18.5) {
            System.out.println("Seu IMC é: " + resultado);
            System.out.println("Você esta abaixo do peso");
            return resultado;
        } else if (resultado >= 18.5 && resultado < 25) {
            System.out.println("Seu IMC é: " + resultado);
            System.out.println("Você está ótimo");
            return resultado;
        } else if (resultado >= 25 && resultado < 30) {
            System.out.println("Seu IMC é: " + resultado);
            System.out.println("Você está acima do peso");
            return resultado;
        } else if (resultado >= 30) {
            System.out.println("Seu IMC é: " + resultado);
            System.out.println("Você está obeso");
            return resultado;
        } else {
            return 0.00;

        }

    }

    public static Double calculapesoideal(char s, double h) {

        if (s == 'H' || s == 'h') {
            double PesoIdeal = (72.7 * h) - 58;
            System.out.println("Seu peso ideal e: " + PesoIdeal);
            return PesoIdeal;
        } else if (s == 'm' || s == 'M') {
            double PesoIdeal = (62.1 * h) - 44.7;
            System.out.println("Seu peso ideal e: " + PesoIdeal);
            return PesoIdeal;
        } else {
            return 0.00;
        }

    }

    public static double getResultado() {
        return resultado;
    }

}
