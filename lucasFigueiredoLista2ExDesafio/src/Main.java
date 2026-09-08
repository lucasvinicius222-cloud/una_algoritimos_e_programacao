//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite o valor da renda mensal: R$ ");
    double renda = entrada.nextDouble();

    System.out.print("Digite o valor da prestação mensal desejada: R$ ");
    double prestacao = entrada.nextDouble();

    double limitePrestacao = renda * 0.30;

    if (prestacao > limitePrestacao) {

        System.out.println("Financiamento negado por alta prestação");
    } else if (prestacao > 3000.00 && renda < 10000.00) {

        System.out.println("Financiamento negado por baixa renda");
    } else {

        System.out.println("Financiamento aprovado");
    }
}
