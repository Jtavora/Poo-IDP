public class VerificarStatusAluno {

    public static void main(String[] args) {
        double mediaFinalAluno = 85.0;
        String status = verificarStatusAluno(mediaFinalAluno);
        System.out.println("O aluno está " + status + ".");
    }

    public static String verificarStatusAluno(double mediaFinal) {
        double notaAprovacao = 70.0;
        double notaRecuperacaoMin = 30.0;
        double notaRecuperacaoMax = 69.0;

        if (mediaFinal >= notaAprovacao) {
            return "Aprovado";
        } else if (mediaFinal >= notaRecuperacaoMin && mediaFinal <= notaRecuperacaoMax) {
            return "Em recuperação";
        } else {
            return "Reprovado";
        }
    }
}
