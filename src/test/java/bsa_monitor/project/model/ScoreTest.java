package bsa_monitor.project.model;

import org.junit.Assert;
import org.junit.Test;

public class ScoreTest {

    @Test
    public void whenCreatingScoreWithFailingGrade_expectNoPoints() {
        var subject = new Vak("subjectname",5,5.5);

        var score = new Score(subject, 5);

        Assert.assertEquals(subject,score.getVak());
        Assert.assertEquals(0,score.getBehaaldePunten());
    }

    @Test
    public void whenCreatingScoreWithPassingGrade_expectAllPoints(){
        var subject = new Vak("subjectname",5,5.5);

        var score = new Score(subject, 6);

        Assert.assertEquals(5,score.getBehaaldePunten());
    }
}