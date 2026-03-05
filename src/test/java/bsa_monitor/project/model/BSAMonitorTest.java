package bsa_monitor.project.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BSAMonitorTest {

    // --- Score: behaaldePunten berekening ---

    @Test
    void score_cijferGelijkAanCesuur_geeftVolledigePunten() {
        Vak vak = new Vak("OOP 1", 3, 5.5);
        Score score = new Score(vak, 5.5);
        assertEquals(3, score.getBehaaldePunten());
    }

    @Test
    void score_cijferBovenCesuur_geeftVolledigePunten() {
        Vak vak = new Vak("Programming", 3, 5.5);
        Score score = new Score(vak, 8.0);
        assertEquals(3, score.getBehaaldePunten());
    }

    @Test
    void score_cijferOnderCesuur_geeftNulPunten() {
        Vak vak = new Vak("Databases", 3, 5.5);
        Score score = new Score(vak, 5.4);
        assertEquals(0, score.getBehaaldePunten());
    }

    @Test
    void score_grossProjectMetHoogCijfer_geeft12Punten() {
        Vak vak = new Vak("Fasten Your Seatbelts", 12, 5.5);
        Score score = new Score(vak, 7.5);
        assertEquals(12, score.getBehaaldePunten());
    }

    // --- Vak: getters ---

    @Test
    void vak_geeftNaamTerug() {
        Vak vak = new Vak("OOP 1", 3, 5.5);
        assertEquals("OOP 1", vak.getNaam());
    }

    @Test
    void vak_geeftPuntenTerug() {
        Vak vak = new Vak("Fasten Your Seatbelts", 12, 5.5);
        assertEquals(12, vak.getPunten());
    }

    @Test
    void vak_geeftCesuurTerug() {
        Vak vak = new Vak("OOP 1", 3, 5.5);
        assertEquals(5.5, vak.getCesuur(), 0.001);
    }

    // --- Composed object: score.getVak() ---

    @Test
    void score_getVak_geeftNaamVanHetVak() {
        Vak vak = new Vak("OOP 1", 3, 5.5);
        Score score = new Score(vak, 7.0);
        assertEquals("OOP 1", score.getVak().getNaam());
    }

    @Test
    void score_getVak_geeftPuntenVanHetVak() {
        Vak vak = new Vak("Programming", 3, 5.5);
        Score score = new Score(vak, 6.0);
        assertEquals(3, score.getVak().getPunten());
    }
}
