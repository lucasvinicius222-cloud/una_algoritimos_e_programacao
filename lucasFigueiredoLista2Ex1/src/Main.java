//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite a idade do nadador: ");
    int idade = entrada.nextInt();

    if (idade <= 12) {
        System.out.println("Categoria: Infantil");
    } else if (idade <= 17) {
        System.out.println("Categoria: Juvenil");
    } else {
        System.out.println("Categoria: Adulto");
    }
}

