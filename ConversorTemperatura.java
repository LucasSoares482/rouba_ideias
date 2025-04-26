package rouba_ideias;
import java.util.Scanner;

public class ConversorTemperatura{
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) +32;
    }
    public static double fahrenheitParaCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Conversor de Temperatura");
        System.out.println("------------------------");

        System.out.println("Escolha a conversão:");
        System.out.println("1. Celsius para Fahrenheint");
        System.out.println("2. Fahrenheint para Celsius");

        System.out.print("Opção: ");
        int opcao = sc.nextInt();

        if (opcao == 1){
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = celsiusParaFahrenheit(celsius);

            System.out.printf("%.1f°C = %.1f°\n", celsius, fahrenheit);
        }else if (opcao == 2) {
            System.out.print("Digite a temperatura em Fahrenheint: ");
            double fahrenheit = sc.nextDouble();
            double celsius = fahrenheitParaCelsius(fahrenheit);

            System.out.print("f°F "+fahrenheit+" = C° "+celsius);
        }else{
            System.out.println("Opção inválida!");
        }

        sc.close();

    }

}