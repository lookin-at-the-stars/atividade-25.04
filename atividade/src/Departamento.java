import java.util.ArrayList;
//Lucas Oosrio Baldoino (RA: 10434481)
// Arthur Silva Torres (RA: 10434401)
// Gabriel Barbosa Souza (RA: 10434547)
public class Departamento {
    private String nome;
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    // Métodos
    public void adicionarFuncionario(Funcionario funcionario) {
        if (funcionarios.size() < 5) {
            funcionarios.add(funcionario);
        }
    }

    public void removerFuncionario(String nome) {
        funcionarios.removeIf(funcionario -> funcionario.getNome().equals(nome));
    }

    public double calcularMediaSalarial() {
        double soma = 0;
        for (Funcionario funcionario : funcionarios) {
            soma += funcionario.getSalario();
        }
        return funcionarios.isEmpty() ? 0 : soma / funcionarios.size();
    }

    public void listarFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome() + ", Salário: " + funcionario.getSalario());
        }
    }
}