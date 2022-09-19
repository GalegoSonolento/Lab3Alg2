package funcionarios;

public class FuncionarioComissionadoBaseSalario extends FuncionarioComissionado{
    private double salario;


    public FuncionarioComissionadoBaseSalario(String nome, String CPF, double taxaComissao, double vendasBrutas, double salario) {
        super(nome, CPF, taxaComissao, vendasBrutas);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double getRendimentos(){
        double comissao = super.getTaxaComissao()/100;
        return salario+super.getRendimentos();
    }

    @Override
    public String toString() {
        return "FuncionarioComissionadoBaseSalario{" +
                "salario=" + salario +
                "} " + super.toString();
    }
}
