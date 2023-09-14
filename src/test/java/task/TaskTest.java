package task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskTest {
    @Test
    public void testSimpleTaskIfMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        boolean expected = true;
        boolean actual = simpleTask.matches("Позвонить");
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSimpleTaskIfNotMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        boolean actual = simpleTask.matches("Написать");
        Assertions.assertFalse(actual);
    }

}