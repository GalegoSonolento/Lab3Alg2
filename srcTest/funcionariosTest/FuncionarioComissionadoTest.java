package funcionariosTest;

import funcionarios.FuncionarioComissionado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FuncionarioComissionadoTest {

    @Test
    void getTaxaComissao() {
        FuncionarioComissionado fc1 = new FuncionarioComissionado("Michael Scott", "5642564256", 50, 50000);
        Assertions.assertEquals(25000, fc1.getRendimentos());
    }

    @Test
    void setTaxaComissao() {
        Assertions.assertEquals(10, 10);
    }

    @Test
    void getVendasBrutas() {
    }

    @Test
    void setVendasBrutas() {
        Assertions.assertEquals(100, 100);
    }

    @Test
    void getRendimentos() {
        Assertions.assertEquals(10, 10);
    }
}