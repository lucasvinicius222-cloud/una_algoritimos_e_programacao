//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite o valor do produto: ");
    double valor = entrada.nextDouble();

    double desconto = valor * 0.10;

    double precoComDesconto = valor - desconto;

    System.out.println("Valor do desconto: " + desconto);
    System.out.println("Preço com 10% de desconto: " + precoComDesconto);
}
