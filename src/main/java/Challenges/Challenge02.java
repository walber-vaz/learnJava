package Challenges;

import java.util.Scanner;

public class Challenge02 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int NUMBER_MAX_ARRAY = 10;
    String[] nomes = new String[NUMBER_MAX_ARRAY];

    int registersNames = 0;
    int option = 0;

    while (option != 3) {
      System.out.println("\n===== Cadastres nome =====");
      System.out.println("1. Cadastrar nome");
      System.out.println("2. Listar nomes");
      System.out.println("3. Sair");
      System.out.print("Escolha uma opção: ");
      option = input.nextInt();
      input.nextLine();

      switch (option) {
        case 1:
          if (registersNames < NUMBER_MAX_ARRAY) {
            System.out.print("Digite um nome: ");
            String nome = input.nextLine();
            nomes[registersNames] = nome;
            registersNames++;
            System.out.println("Nome cadastrado com sucesso!");
          } else {
            System.out.println("Número máximo de cadastros atingido!");
          }
          break;
        case 2:
          if (registersNames == 0) {
            System.out.println("Nenhum nome cadastrado!");
          } else {
            System.out.println("===== Lista de nomes =====");
            for (int i = 0; i < registersNames; i++) {
              System.out.println((i + 1) + ". " + nomes[i]);
            }
          }
          break;
        case 3:
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção inválida!");
          break;
      }
    }

    input.close();
  }
}
