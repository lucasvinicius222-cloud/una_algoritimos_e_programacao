//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite a temperatura em graus Celsius: ");
    double celsius = entrada.nextDouble();

    System.out.println("Para qual unidade deseja converter?");
    System.out.println("1 - Fahrenheit");
    System.out.println("2 - Kelvin");
    System.out.print("Digite sua opção: ");
    int opcao = entrada.nextInt();

    if (opcao == 1) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + "°C equivale a " + fahrenheit + "°F");
    } else if (opcao == 2) {
        double kelvin = celsius + 273.15;
        System.out.println(celsius + "°C equivale a " + kelvin + "K");
    } else {
        System.out.println("Opção inválida!");
    }
}
