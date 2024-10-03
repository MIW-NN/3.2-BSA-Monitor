package bsa_monitor.project.model;

import org.junit.Assert;
import org.junit.Test;

public class VakTest {

    @Test
    public void whenCreatingSubject_hasRightValues() {
        var subjectName = "subjectname";
        int points = 5;
        double passMark = 5.5;

        var subject = new Vak(subjectName,points,passMark);


        Assert.assertEquals(subjectName, subject.getNaam());
        Assert.assertEquals(points, subject.getPunten());
        Assert.assertEquals(passMark, subject.getCesuur(), 0.0);
    }
}