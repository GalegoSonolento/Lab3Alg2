package funcionarios;

public class FuncionarioHorista extends Funcionario{
    private double horasTrabalhadasSemana;
    private double salarioPHora;

    public FuncionarioHorista(String nome, String CPF, double horasTrabalhadasSemana, double salarioPHora) {
        super(nome, CPF);
        this.horasTrabalhadasSemana = horasTrabalhadasSemana;
        this.salarioPHora = salarioPHora;
    }


    public double getHorasTrabalhadasSemana() {
        return horasTrabalhadasSemana;
    }

    public void setHorasTrabalhadasSemana(double horasTrabalhadasSemana) {
        this.horasTrabalhadasSemana = horasTrabalhadasSemana;
    }

    public double getSalarioPHora() {
        return salarioPHora;
    }

    public void setSalarioPHora(double salarioPHora) {
        this.salarioPHora = salarioPHora;
    }

    public double salaraioSemanal(){
        if (horasTrabalhadasSemana < 40) return salarioPHora * horasTrabalhadasSemana;
        return (40 * salarioPHora) + (horasTrabalhadasSemana - 40) * salarioPHora * 1.5;
    }

    @Override
    public String toString() {
        return "FuncionarioHorista{" +
                "horasTrabalhadasSemana=" + horasTrabalhadasSemana +
                ", salarioPHora=" + salarioPHora +
                "} " + super.toString();
    }
}
