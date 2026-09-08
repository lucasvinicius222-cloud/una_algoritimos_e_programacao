//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite o consumo em kWh: ");
    double consumo = entrada.nextDouble();

    double valorConta;

    if (consumo <= 100) {
        valorConta = consumo * 0.50;
    } else if (consumo <= 200) {
        valorConta = consumo * 0.70;
    } else {
        valorConta = consumo * 0.90;
    }

    System.out.println("Valor da conta de energia: R$ " + valorConta);
}
