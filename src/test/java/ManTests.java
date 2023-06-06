import org.testng.Assert;
import org.testng.annotations.Test;

public class ManTests {
    @Test(groups = {"all", "getters_setters"})
    public void testGetAge() {
        Man man = new Man("John", "Doe", 40);
        int age = man.getAge();
        Assert.assertEquals(age, 40, "Incorrect age");
    }

    @Test(groups = {"all", "getters_setters"})
    public void testSetAge() {
        Man man = new Man("John", "Doe", 40);
        man.setAge(50);
        int age = man.getAge();
        Assert.assertEquals(age, 50, "Age not set correctly");
    }

    @Test(groups = "all")
    public void testIsRetired() {
        Man man1 = new Man("John", "Doe", 60);
        Man man2 = new Man("Jane", "Smith", 70);
        Assert.assertFalse(man1.isRetired(), "Incorrect retirement status");
        Assert.assertTrue(man2.isRetired(), "Incorrect retirement status");
    }
}
