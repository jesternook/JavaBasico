package aula1;

public class ImprimeIdade {
    public static void main(String[] args) {
        int idade = 23;
        String nome = "Nico Rocha";
        double altura = 1.52;
        double peso = 55;

        double imc = (peso) / (altura * altura);

        System.out.println("Olá "+nome);
        if (idade >= 23) {
            if (imc < 22) {
                System.out.println("IMC: " + imc + " sua idade e " + idade + " risco de subnutrição.");
            } else if (imc <= 30) {
                System.out.println("IMC: " + imc + " sua idade e " + idade + " isso ai meu queride");
            } else if (imc <= 35) {
                System.out.println("IMC: " + imc + " sua idade e " + idade + " opa pode estar pesado, cuidado!");
            } else {
                System.out.println("IMC: " + imc + " sua idade e " + idade + " procure um médico e um nutricionista");
            }
        } else {
            System.out.println("Novo demais para medição");
        }
    }
}