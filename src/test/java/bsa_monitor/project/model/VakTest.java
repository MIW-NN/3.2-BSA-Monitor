package bsa_monitor.project.model;

import org.junit.Assert;
import org.junit.Test;

public class VakTest {

    @Test
    public void whenCreatingSubject_hasRightValues() {
        var vakNaam = "subjectname";
        int punten = 5;
        double cesuur = 5.5;

        var vak = new Vak(vakNaam, punten, cesuur);


        Assert.assertEquals(vakNaam, vak.getNaam());
        Assert.assertEquals(punten, vak.getPunten());
        Assert.assertEquals(cesuur, vak.getCesuur(), 0.0);
    }
}
