//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite sua idade em anos: ");
    int idadeAnos = entrada.nextInt();

    int idadeMeses = idadeAnos * 12;

    System.out.println("Sua idade em meses é: " + idadeMeses + " meses");
}
