//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int numero = entrada.nextInt();

    if (numero % 2 == 0) {

        int quadrado = numero * numero;
        System.out.println("O número " + numero + " é PAR.");
        System.out.println("O quadrado dele é: " + quadrado);
    } else {

        int cubo = numero * numero * numero;
        System.out.println("O número " + numero + " é ÍMPAR.");
        System.out.println("O cubo dele é: " + cubo);
    }
}
