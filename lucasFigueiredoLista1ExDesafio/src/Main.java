//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite o valor de A: ");
    int a = entrada.nextInt();

    System.out.print("Digite o valor de B: ");
    int b = entrada.nextInt();

    System.out.println("\nAntes da troca: A = " + a + ", B = " + b);

    int aux = a;
    a = b;
    b = aux;

    System.out.println("Depois da troca: A = " + a + ", B = " + b);
}
