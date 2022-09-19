package funcionarios;

public class FuncionarioComissionado extends Funcionario{
    private double taxaComissao;
    private double vendasBrutas;

    public FuncionarioComissionado(String nome, String CPF, double taxaComissao, double vendasBrutas) {
        super(nome, CPF);
        this.taxaComissao = taxaComissao;
        this.vendasBrutas = vendasBrutas;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    public double getVendasBrutas() {
        return vendasBrutas;
    }

    public void setVendasBrutas(double vendasBrutas) {
        this.vendasBrutas = vendasBrutas;
    }

    public double getRendimentos(){
        double comissao = taxaComissao/100;
        return comissao * vendasBrutas;
    }

    @Override
    public String toString() {
        return "FuncionarioComissionado{" +
                "taxaComissao=" + taxaComissao +
                ", vendasBrutas=" + vendasBrutas +
                "} " + super.toString();
    }
}
