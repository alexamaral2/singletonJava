package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParametrosTest {

    @Test
    public void deveRetornarFormatoData() {
        Parametros.getInstance().setFormatoData("22/09/2023");
        assertEquals("22/09/2023", Parametros.getInstance().getFormatoData());
    }

    @Test
    public void deveRetornarFusoHorario() {
        Parametros.getInstance().setFusoHorario("America/Sao_Paulo");
        assertEquals("America/Sao_Paulo", Parametros.getInstance().getFusoHorario());
    }

}