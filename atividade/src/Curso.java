//Lucas Oosrio Baldoino (RA: 10434481)
// Arthur Silva Torres (RA: 10434401)
// Gabriel Barbosa Souza (RA: 10434547)
public class Curso {
    private String nomeCurso;
    private String coordenador;
    private Aluno[] alunos = new Aluno[10];

    // Métodos
    public boolean adicionarAluno(Aluno aluno) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null) {
                alunos[i] = aluno;
                return true;
            }
        }
        return false;
    }

    public boolean removerAluno(int matricula) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null && alunos[i].getMatricula() == matricula) {
                alunos[i] = null;
                return true;
            }
        }
        return false;
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                System.out.println("Nome: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula());
            }
        }
    }
}
