import org.example.Hospital;
import org.example.Levantamento;
import org.example.Medico;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LevantamentoTest {
    @Test
    void deveContarMedicosAtivos() {
        Hospital hospital = new Hospital(
                new Medico("Teste", 123, true, "Cirurgiao"),
                new Medico("Tetse 2", 000, false, "Anestesista")
        );

        assertEquals(1, Levantamento.contarMedicosAtivos(hospital));
    }

    @Test
    void deveContarMedicos() {
        Hospital hospital = new Hospital(
                new Medico("Teste", 123, true, "Cirurgiao"),
                new Medico("Tetse 2", 000, false, "Anestesista")
        );

        assertEquals(2, Levantamento.contarMedicos(hospital));
    }
}
