package funcionariosTest;

import funcionarios.FuncionarioComissionado;
import funcionarios.FuncionarioComissionadoBaseSalario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioComissionadoBaseSalarioTest {

    @Test
    void getSalario() {
    }

    @Test
    void setSalario() {
    }

    @Test
    void getRendimentos() {
        FuncionarioComissionadoBaseSalario fb1 = new FuncionarioComissionadoBaseSalario("Jim Halpert", "54425", 10, 100, 30000);
        Assertions.assertEquals(30010, fb1.getRendimentos());
    }
}