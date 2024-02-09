package bsa_monitor.project.model;

import org.junit.Assert;
import org.junit.Test;

public class SubjectTest {

    @Test
    public void whenCreatingSubject_hasRightValues() {
        var subjectName = "subjectname";
        int points = 5;
        double passMark = 5.5;

        var subject = new Subject(subjectName,points,passMark);


        Assert.assertEquals(subjectName, subject.getName());
        Assert.assertEquals(points, subject.getPoints());
        Assert.assertEquals(passMark, subject.getPassMark(), 0.0);
    }
}