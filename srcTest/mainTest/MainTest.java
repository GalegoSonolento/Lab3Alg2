package mainTest;

import funcionarios.FuncionarioAssalariado;
import funcionarios.FuncionarioComissionado;
import funcionarios.FuncionarioComissionadoBaseSalario;
import funcionarios.FuncionarioHorista;

import java.util.Optional;

public class MainTest {
    public static void main(String[] args){
        System.out.println("=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Criando um funcionário assalariado");
        FuncionarioAssalariado fa1 = new FuncionarioAssalariado("Dwight Schrute", "45646284654", 30000);
        System.out.println("Informações do Funcionário: \n"+fa1.toString());
        fa1.setSalarioSemanal(20000);
        System.out.println("Diminuição do salário: ");
        System.out.println(fa1.toString());

        System.out.println();
        System.out.println("=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Criando um funcionário comissionado: ");
        FuncionarioComissionado fc1 = new FuncionarioComissionado("Michael Scott", "5642564256", 50, 50000);
        System.out.println("Informações do funcionário comissionado: "+fc1.toString());
        System.out.println("Rendimentos totais: "+fc1.getRendimentos());
        fc1.setTaxaComissao(60);
        System.out.println("Aumento na taxa de comissão: "+fc1.getTaxaComissao());
        fc1.setVendasBrutas(564242345);
        System.out.println("Aumento na taxa de vendas: "+fc1.getVendasBrutas());
        System.out.println("Novos rendimentos totais: "+fc1.getRendimentos());

        System.out.println();
        System.out.println("=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Criando um funcionário comissionado com base de salário: ");
        FuncionarioComissionadoBaseSalario fcbs1 = new FuncionarioComissionadoBaseSalario("Jim Halpert", "54425", 10, 100, 30000);
        System.out.println("Informações do funcionário comissinado com base salarial: "+fcbs1.toString());
        System.out.println("Rendimentos totais: "+fcbs1.getRendimentos());
        fcbs1.setSalario(20000);
        System.out.println("Mudança de salário: "+fcbs1.getSalario());

        System.out.println();
        System.out.println("=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Criando um funcionário horista: ");
        FuncionarioHorista fh1 = new FuncionarioHorista("Pam Beesley", "4542684", 41, 200);
        System.out.println("Informações do funcionário horista: "+fh1.toString());
        System.out.println("Recebimento da semana: "+fh1.salaraioSemanal());
        fh1.setHorasTrabalhadasSemana(30);
        System.out.println("Semana com menos horas trabalhadas: "+fh1.getHorasTrabalhadasSemana());
        fh1.setSalarioPHora(100);
        System.out.println("Diminuição do salário por hora: "+fh1.getSalarioPHora());
        System.out.println("Novo rendimento da semana: "+fh1.salaraioSemanal());
    }
}
