package funcionarios;

public class FuncionarioAssalariado extends Funcionario{
    private double salario;

    public FuncionarioAssalariado(String nome, String CPF, double salario) {
        super(nome, CPF);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
