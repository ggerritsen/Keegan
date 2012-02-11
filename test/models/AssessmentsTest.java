package models;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;
import play.test.UnitTest;

public class AssessmentsTest extends UnitTest {

    @Test
    public void parsesTimeCorrectlyAsDouble() throws Exception {
        Assessments assessments = new Assessments();
        assessments.setTime("12.345");
        assertThat(assessments.getTime(), is(12.345));

        assessments = new Assessments("scale", 1, "12.345");
        assertThat(assessments.getTime(), is(12.345));
    }
}
