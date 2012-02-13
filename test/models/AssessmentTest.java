package models;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;
import play.test.UnitTest;

public class AssessmentTest extends UnitTest {

    @Test
    public void parsesTimeCorrectlyAsDouble() throws Exception {
        Assessment assessments = new Assessment();
        assessments.setTime("12.345");
        assertThat(assessments.getTime(), is(12.345));
    }
}
