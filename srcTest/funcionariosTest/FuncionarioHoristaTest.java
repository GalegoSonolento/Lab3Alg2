package funcionariosTest;

import funcionarios.FuncionarioHorista;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioHoristaTest {

    @Test
    void getHorasTrabalhadasSemana() {
    }

    @Test
    void setHorasTrabalhadasSemana() {
    }

    @Test
    void getSalarioPHora() {
    }

    @Test
    void setSalarioPHora() {
    }

    @Test
    void salaraioSemanal() {
        FuncionarioHorista fh1 = new FuncionarioHorista("Pam Beesley", "4542684", 41, 200);
        Assertions.assertEquals(8300, fh1.salaraioSemanal());
        FuncionarioHorista fh2 = new FuncionarioHorista("Pam Beesley", "4542684", 30, 200);
        Assertions.assertEquals(6000, fh2.salaraioSemanal());
    }
}