//Lucas Oosrio Baldoino (RA: 10434481)
// Arthur Silva Torres (RA: 10434401)
// Gabriel Barbosa Souza (RA: 10434547)
public class Principal {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Ana");
        aluno1.setMatricula(1);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Carlos");
        aluno2.setMatricula(2);

        Aluno aluno3 = new Aluno();
        aluno3.setNome("Maria");
        aluno3.setMatricula(3);

        curso.adicionarAluno(aluno1);
        curso.adicionarAluno(aluno2);
        curso.adicionarAluno(aluno3);

        System.out.println("Alunos matriculados:");
        curso.listarAlunos();

        Departamento dep1 = new Departamento();
        Departamento dep2 = new Departamento();

        Funcionario func1 = new Funcionario();
        func1.setNome("João");
        func1.setSalario(3000);

        Funcionario func2 = new Funcionario();
        func2.setNome("Maria");
        func2.setSalario(4000);

        Funcionario func3 = new Funcionario();
        func3.setNome("Carlos");
        func3.setSalario(3500);

        dep1.adicionarFuncionario(func1);
        dep1.adicionarFuncionario(func2);

        dep2.adicionarFuncionario(func3);

        System.out.println("Funcionários do Departamento 1:");
        dep1.listarFuncionarios();
        System.out.println("Média Salarial: " + dep1.calcularMediaSalarial());

        System.out.println("\nFuncionários do Departamento 2:");
        dep2.listarFuncionarios();
        System.out.println("Média Salarial: " + dep2.calcularMediaSalarial());
    }
}
