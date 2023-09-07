public class Ensalamento {
    public static void main(String[] args) {
        // Criação de alunos
        Aluno[] alunos = {
            new Aluno("Alfredo", "TI"),
            new Aluno("Peterson", "ADM"),
            new Aluno("Wendel", "TI"),
            new Aluno("Ian", "ADM"),
            new Aluno("Debra", "TI"),
            new Aluno("Luana", "ADM"),
            new Aluno("Bruno", "TI"),
            new Aluno("Romeu", "ADM"),
            new Aluno("Julieta", "TI"),
            new Aluno("Maria", "ADM"),
            new Aluno("Capitú", "TI"),
            new Aluno("Bentinho", "ADM"),
            new Aluno("Amélia", "TI")
        };

        // Criação de professores
        Professor[] professores = {
            new Professor("Mia", "POO"),
            new Professor("Saulo", "Estrutura de Dados"),
            new Professor("Paula", "BI")
        };

        // Criação de cursos e associação de disciplinas
        Curso[] cursos = {
            new Curso("TI"),
            new Curso("ADM")
        };

        cursos[0].adicionarDisciplina(new Disciplina("POO do curso de TI"));
        cursos[0].adicionarDisciplina(new Disciplina("Estrutura de Dados do curso de TI"));
        cursos[1].adicionarDisciplina(new Disciplina("BI do curso de ADM"));

        // Alocação dos alunos nas turmas
        Turma[] turmas = new Turma[alunos.length];

        for (int i = 0; i < alunos.length; i++) {
            Curso cursoAluno = cursos[i % cursos.length];
            Disciplina disciplinaAluno = cursoAluno.getDisciplinas().get(i % cursoAluno.getDisciplinas().size());
            turmas[i] = new Turma(professores[i % professores.length], disciplinaAluno);
            turmas[i].adicionarAluno(alunos[i]);
        }

        // Exibição do ensalamento
        for (Turma turma : turmas) {
            System.out.println("Turma:");
            System.out.println("Professor: " + turma.getProfessor().getNome());
            System.out.println("Disciplina: " + turma.getDisciplina().getNome());
            System.out.println("Alunos:");

            for (Aluno aluno : turma.getAlunos()) {
                System.out.println(aluno.getNome() + " - " + aluno.getCurso());
            }

            System.out.println();
        }
    }
}
