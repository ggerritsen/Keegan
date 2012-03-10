package models;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;
import play.test.UnitTest;

public class ResearchSubjectTest extends UnitTest {
    
    @Test
    public void setsM1AsDefaultVideoType() {
        ResearchSubject subject = new ResearchSubject();
        subject.setVideoType(null);
        assertThat(subject.getVideoType(), is("m1"));

        subject = new ResearchSubject();
        subject.setVideoType("");
        assertThat(subject.getVideoType(), is("m1"));
    }

    @Test
    public void setsVideoTypeIfProvided() {
        ResearchSubject subject = new ResearchSubject();
        subject.setVideoType("test");
        assertThat(subject.getVideoType(), is("test"));
    }
}
