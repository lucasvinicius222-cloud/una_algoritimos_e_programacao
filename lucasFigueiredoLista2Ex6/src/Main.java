//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite o código do produto: ");
    int codigo = entrada.nextInt();

    System.out.print("Digite a quantidade comprada: ");
    int quantidade = entrada.nextInt();

    double precoUnitario;

    if (codigo >= 1 && codigo <= 10) {
        precoUnitario = 10.00;
    } else if (codigo >= 11 && codigo <= 20) {
        precoUnitario = 15.00;
    } else if (codigo >= 21 && codigo <= 30) {
        precoUnitario = 20.00;
    } else if (codigo >= 31 && codigo <= 40) {
        precoUnitario = 30.00;
    } else {
        precoUnitario = 0.0;
        System.out.println("Código de produto inválido!");
    }

    double precoTotal = precoUnitario * quantidade;

    double porcentagemDesconto;

    if (precoTotal <= 250.00) {
        porcentagemDesconto = 5;
    } else if (precoTotal <= 500.00) {
        porcentagemDesconto = 10;
    } else {
        porcentagemDesconto = 15;
    }

    double valorDesconto = precoTotal * (porcentagemDesconto / 100);
    double precoFinal = precoTotal - valorDesconto;

    System.out.println("\n----- NOTA FISCAL -----");
    System.out.println("Preço unitário: R$ " + precoUnitario);
    System.out.println("Preço total da nota: R$ " + precoTotal);
    System.out.println("Desconto aplicado: " + porcentagemDesconto + "%");
    System.out.println("Valor do desconto: R$ " + valorDesconto);
    System.out.println("Preço final da nota: R$ " + precoFinal);
}
