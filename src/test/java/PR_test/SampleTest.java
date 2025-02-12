package PR_test;



import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

public class SampleTest {

    // This will be run before the tests in this class
    @BeforeClass
    public void setUp() {
        System.out.println("Setting up the test environment...");
    }

    // Sample test case 1
    @Test
    public void testAddition() {
        int sum = 2 + 3;
        Assert.assertEquals(sum, 6, "Addition test failed");
        System.out.println("Addition test passed");
//hi
    }

    // Sample test case 2
    @Test
    public void testString() {
        String message = "Hello, World!";
        Assert.assertEquals(message, "Hello, World!", "String test failed");
        System.out.println("String test passed");
    }
    // new pr

    // This will be run after the tests in this class
    @AfterClass
    public void tearDown() {
        System.out.println("Tearing down the test environment...");
    }
}

