/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package CIserver;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test public void thisShouldFail() {
        int variable = 2;
        assertTrue(1 == variable);
    }
}
