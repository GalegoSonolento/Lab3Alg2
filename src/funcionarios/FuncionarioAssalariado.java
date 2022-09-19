package funcionarios;

public class FuncionarioAssalariado extends Funcionario{
    private double salarioSemanal;

    public FuncionarioAssalariado(String nome, String CPF, double salario) {
        super(nome, CPF);
        this.salarioSemanal = salario;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public String toString() {
        return "FuncionarioAssalariado{" +
                "salarioSemanal=" + salarioSemanal +
                "} " + super.toString();
    }
}
