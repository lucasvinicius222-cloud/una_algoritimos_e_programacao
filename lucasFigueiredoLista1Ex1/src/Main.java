//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite um número real: ");
    double numero = entrada.nextDouble();
    double dobro = numero * 2;
    System.out.println("O dobro de " + numero + " é " + dobro);
}
