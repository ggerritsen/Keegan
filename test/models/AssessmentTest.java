package models;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;
import play.test.UnitTest;

public class AssessmentTest extends UnitTest {

    @Test
    public void parsesTimeCorrectlyAsDouble() throws Exception {
        Assessment assessment = new Assessment();
        assessment.setTime("12.345");
        assertThat(assessment.getTime(), is(12.345));

        assessment = new Assessment("scale", 1, "12.345");
        assertThat(assessment.getTime(), is(12.345));
    }
}
