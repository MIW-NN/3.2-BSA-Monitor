package bsa_monitor.project.model;

import org.junit.Assert;
import org.junit.Test;

public class ScoreTest {

    @Test
    public void whenCreatingScoreWithFailingGrade_expectNoPoints() {
        var vak = new Vak("subjectname", 5, 5.5);

        var score = new Score(vak, 5);

        Assert.assertEquals(vak, score.getVak());
        Assert.assertEquals(0, score.getPunten());
    }

    @Test
    public void whenCreatingScoreWithPassingGrade_expectAllPoints(){
        var vak = new Vak("subjectname", 5, 5.5);

        var score = new Score(vak, 6);

        Assert.assertEquals(5, score.getPunten());
    }
}
