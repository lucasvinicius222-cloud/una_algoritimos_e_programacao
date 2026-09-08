//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite o primeiro número inteiro: ");
    int numero1 = entrada.nextInt();

    System.out.print("Digite o segundo número inteiro: ");
    int numero2 = entrada.nextInt();

    System.out.print("Digite o terceiro número inteiro: ");
    int numero3 = entrada.nextInt();

    int soma = numero1 + numero2 + numero3;

    double media = soma / 3.0;

    System.out.println("A soma dos números é: " + soma);
    System.out.println("A média aritmética é: " + media);
}
