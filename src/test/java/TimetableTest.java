import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TimetableTest {

    // TODO: Uncomment testcase to test newCourse method.
    /*@Test
    public void testNewCourse() {
        Timetable timetable = new Timetable();
        assertTrue(timetable.getCourses().isEmpty());

        String course1 = "Math";
        timetable.newCourse(course1);
        assertEquals(course1 + " -", timetable.getCourses());

        String course2 = "Programming";
        timetable.newCourse(course2);
        assertEquals(course1 + " -\r\n" + course2 + " -", timetable.getCourses());

        String course3 = "Math";
        timetable.newCourse(course3);
        assertEquals(course1 + " -\r\n" + course2 + " -", timetable.getCourses());
    }

    // TODO: Uncomment testcase to test removeCourse method.
    /*
    @Test
    public void testRemoveCourse() {
        Timetable timetable = new Timetable();
        assertTrue(timetable.getCourses().isEmpty());

        String course1 = "Math";

        timetable.removeCourse(course1);

        timetable.newCourse(course1);
        assertEquals(course1 + " -", timetable.getCourses());

        String course2 = "Programming";
        timetable.newCourse(course2);
        assertEquals(course1 + " -\r\n" + course2 + " -", timetable.getCourses());

        timetable.removeCourse(course1);

        assertEquals(course2 + " -", timetable.getCourses());

        timetable.removeCourse(course2);
        assertTrue(timetable.getCourses().isEmpty());
    }
    */

    // TODO: Uncomment testcase to test setTimestamp method.
    /*
    @Test
    public void testScheduler() {
        Scheduler scheduler = new Scheduler();
        String course1 = "Math";
        String course2 = "Programming";
        String timestamp1 = "12:00";
        String timestamp2 = "10:30";

        scheduler.newCourse(course1);
        scheduler.newCourse(course2);

        scheduler.setTimestamp(course1, timestamp1);
        assertEquals(course1 + " " + timestamp1 + "\r\n" + course2 + " -", scheduler.getCourses());

        scheduler.setTimestamp(course2, timestamp1);
        assertEquals(course1 + " " + timestamp1 + "\r\n" + course2 + " " + timestamp1, scheduler.getCourses());

        scheduler.setTimestamp(course2, timestamp2);
        assertEquals(course1 + " " + timestamp1 + "\r\n" + course2 + " " + timestamp2, scheduler.getCourses());

        scheduler.setTimestamp("not real", timestamp1);
        assertEquals(course1 + " " + timestamp1 + "\r\n" + course2 + " " + timestamp2, scheduler.getCourses());
    }
    */
}
