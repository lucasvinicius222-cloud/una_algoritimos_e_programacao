//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite o salário atual: R$ ");
    double salarioAtual = entrada.nextDouble();

    System.out.print("Digite a porcentagem de aumento: ");
    double porcentagem = entrada.nextDouble();

    double valorAumento = salarioAtual * (porcentagem / 100);

    double novoSalario = salarioAtual + valorAumento;

    System.out.println("Valor do aumento: R$ " + valorAumento);
    System.out.println("Novo salário final: R$ " + novoSalario);
}
