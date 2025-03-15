package Challenges;

public class Challenge01 {
    public static void main(String[] args) {
        /*
        *   Crie um programa que represente três ninjas da Vila
        *   da Folha (Konoha) de "Naruto" e suas respectivas
        *   missões.
        *   Cada ninja tem um nome, uma idade e uma missão
        *   atribuída a ele, com o nome da missão, nível de
        *   dificuldade e status de conclusão
        *
        * */

        // Instanciando os ninjas
        String ninja1 = "Naruto";
        String missaoNinja1 = "Resgatar Sasuke";
        char levelMissaoNinja1 = 'C';
        boolean isConcluido = false;
        short idadeNinja1 = 16;

        String ninja2 = "Sasuke";
        String missaoNinja2 = "Matar Itachi";
        char levelMissaoNinja2 = 'S';
        boolean isConcluidoNinja2 = true;
        short idadeNinja2 = 16;

        String ninja3 = "Sakura";
        String missaoNinja3 = "Proteger Naruto";
        boolean isConcluidoNinja3 = true;
        char levelMissaoNinja3 = 'B';
        short idadeNinja3 = 16;

        System.out.println("Ninja 1: " + ninja1);
        System.out.println("Missão 1: " + missaoNinja1);
        System.out.println("Idade 1: " + idadeNinja1);
        System.out.println("Nível da missão: " + levelMissaoNinja1);
        System.out.println("Missão concluída: " + isConcluido + "\n");


        System.out.println("Ninja 2: " + ninja2);
        System.out.println("Missão 2: " + missaoNinja2);
        System.out.println("Idade 2: " + idadeNinja2);
        System.out.println("Nível da missão: " + levelMissaoNinja2);
        System.out.println("Missão concluída: " + isConcluidoNinja2 + "\n");

        System.out.println("Ninja 3: " + ninja3);
        System.out.println("Missão 3: " + missaoNinja3);
        System.out.println("Idade 3: " + idadeNinja3);
        System.out.println("Nível da missão: " + levelMissaoNinja3);
        System.out.println("Missão concluída: " + isConcluidoNinja3 + "\n");

        /*
        * Altere o status da missão para "concluída" ou "não concluída" de acordo com essa lógica
        * e imprima o resultado.
        * Ninjas menores de 15 anos só podem concluir missões de nível C ou D. Ninjas com 15 anos
        * ou mais podem concluir missões de qualquer nível.
        * */
        if (idadeNinja1 < 15 && (levelMissaoNinja1 == 'C' || levelMissaoNinja1 == 'D')) {
            isConcluido = true;
            System.out.println("Missão concluída do " + ninja1 + ": " + isConcluido);
        } else if (idadeNinja1 >= 15) {
            isConcluido = true;
            System.out.println("Missão concluída do " + ninja1 + ": " + isConcluido);
        } else {
            isConcluido = false;
            System.out.println("Missão concluída do " + ninja1 + ": " + isConcluido);
        }
    }
}
