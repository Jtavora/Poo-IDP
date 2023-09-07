import java.util.ArrayList;
import java.util.List;

public class Turma {
    private Professor professor;
    private Disciplina disciplina;
    private List<Aluno> alunos;

    public Turma(Professor professor, Disciplina disciplina) {
        this.professor = professor;
        this.disciplina = disciplina;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public Professor getProfessor() {
        return professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}
