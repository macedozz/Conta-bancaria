import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String name = sc.nextLine();

        System.out.println("Qual o tipo da sua conta?");
        String tipoDaConta = sc.nextLine();

        System.out.println("Informe o seu saldo:");
        double saldo = sc.nextDouble();


        System.out.println("*********************************");
        System.out.println();
        System.out.println("Nome:            " + name);
        System.out.println("Tipo conta:      " + tipoDaConta);
        System.out.println("Saldo da conta:  " + saldo);
        System.out.println("*********************************");

        System.out.println();
        System.out.println();
        System.out.println();

        int opcao = 0;
        while (opcao != 4){
            System.out.println();
            System.out.println("Operações:");
            System.out.println();
            System.out.println("1 - Consultar saldo:");
            System.out.println("2 - Receber valor:");
            System.out.println("3 - Transferir valor:");
            System.out.println("4 -  Sair:");

            System.out.println();
            System.out.println("Digite a opção desejada:");
            opcao = sc.nextInt();

            System.out.println();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo atual: R$ " + saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber:");
                    double deposito = sc.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo atualizado: R$ " + saldo);
                    break;
                case 3:
                    System.out.println("informe o valor que você deseja transferir:");
                    double debito = sc.nextDouble();
                    if (debito > saldo){
                        System.out.println("Não há saldo suficiente para fazer essa transferência.");
                    }else{
                        saldo -= debito;
                        System.out.println("Saldo atualizado: R$ " + saldo);
                    }
                    break;
            }
        }
    }
}
