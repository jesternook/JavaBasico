package aula1;

public class AvaliaAluno {
    public static void main(String[] args) {
        String aluno = "Lucas Bascos";
        double nota1 = 8.6;
        double nota2 = 5.2;
        double nota3 = 7.1;
        double media = 0;
        double fator1 = 0.6;
        double fator2 = 0.2;
        boolean skl = false;

        if (skl != false) {
            media = (nota1 * fator1) + (nota2 * fator2) + (nota3 * fator2);
            System.out.println("A média do " + aluno + " é " + media);
            if (media >= 7) {
                System.out.println("Aluno com estágio está aprovado.");
            } else {
                System.out.println("Aluno com estágio está reprovado.");
            }
        } else {
            media = (nota1 * fator2) + (nota2 * fator2) + (nota3 * fator1);
            System.out.println("A média do " + aluno + " é " + media);
        }
        if (media >= 7) {
            System.out.println("Aluno sem estágio está aprovado");
        } else {
            System.out.println("Aluno sem estágio está reprovado");
        }
    }
}

