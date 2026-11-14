import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int emprestimosAtivos;
        int limiteEmprestimos = 3;
        boolean livroDisponivel = true;

        int opcao = 10;
        System.out.println("***************************************");
        System.out.println("\nBem vindo ao Sistema de Gestão da Biblioteca");
        System.out.println("\n Escolha uma opção abaixo: ");

        while (opcao!=0){
            System.out.println("\n1 - Consultar Disponibilidade do Livro");
            System.out.println("2 - Realizar Emprestimo");
            System.out.println("0 - Sair do sistema");
            System.out.println("");
            opcao = scanner.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("oPÇão em desenvolvimento,escolha outra opção");
                    break;

                case 2:
                    System.out.println("opção em desenvolvimento, escolha outra opção:");
                    break;
                
                case 0:
                    System.out.println("Saindo do sistema.......");
                    break;
                default:
                    System.out.println("Essa opção ainda não existe,escolha outra opção");
                    break;
                    
            }



        }
    }
}