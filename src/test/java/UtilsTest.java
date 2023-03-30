import org.testng.Assert;
import org.testng.annotations.Test;

public class UtilsTest {

    private Utils utils = new Utils();

    private Manager[] managers = {
            new Manager ("Ted", 100, 1),
            new Manager ("Todd", 150, 10)
    };

    @Test
    public void testSuccessfullSearchByName(){
        Manager expectedManager = (Manager) utils.searchByName(managers,"Ted");

        Assert.assertEquals(managers[0], expectedManager);
    }

    @Test
    public void testNotFoundSearchByName(){
        Assert.assertNull( utils.searchByName(managers,"Tedd") );
    }

    @Test
    public void testSuccessfullSearchBySubName(){
        Manager expectedManager = (Manager) utils.searchBySubName(managers,"Te");

        Assert.assertEquals(managers[0], expectedManager);
    }

    @Test
    public void testNotFoundSearchBySubName(){
        Assert.assertNull( utils.searchBySubName(managers,"Mar") );
    }

    @Test
    public void testGetSalaryBudget(){
        Assert.assertEquals( 250, utils.getSalaryBudget(managers) );
    }

    @Test
    public void testGetMinSalary(){
        Assert.assertEquals( 100, utils.getMinSalary(managers) );
    }

    @Test
    public void testGetMaxSalary(){
        Assert.assertEquals( 150, utils.getMaxSalary(managers) );
    }

    @Test
    public void testGetMinNumOfSubordinates(){
        Assert.assertEquals( 1, utils.getMinNumOfSubordinates(managers) );
    }

    @Test
    public void testGetMaxNumOfSubordinates(){
        Assert.assertEquals( 10, utils.getMaxNumOfSubordinates(managers) );
    }

    @Test
    public void testGetMaxSalaryDifference(){
        Assert.assertEquals( -97, utils.getMaxSalaryDifference(managers) );
    }

    @Test
    public void testGetMinSalaryDifference(){
        Assert.assertEquals( -105, utils.getMinSalaryDifference(managers) );
    }

    @Test
    public void testToUpper(){
        Assert.assertEquals( "STR", Main.toUpper("str"));
    }
}
