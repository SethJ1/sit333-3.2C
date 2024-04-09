package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "221270936";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Seth";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	//added tests for equivalence classes
	 @Test
	    public void testRandomDayInMarch() {
	        int randDay = 1 + new Random().nextInt(31);
	        DateUtil date = new DateUtil(randDay, 3, 2024);
	        System.out.println("testRandomDayInMarch > Initial Date: " + date);
	        date.increment();
	        System.out.println("After increment: " + date);
	        Assert.assertTrue(date.getDay() >= 1 && date.getDay() <= 31);
	        Assert.assertEquals(3, date.getMonth());
	        Assert.assertEquals(2024, date.getYear());
	    }

	    @Test
	    public void testLeapYearFebruary29ToMarch1() {
	        DateUtil date = new DateUtil(29, 2, 2024);
	        System.out.println("testLeapYearFebruary29ToMarch1 > Initial Date: " + date);
	        date.increment();
	        System.out.println("After increment: " + date);
	        Assert.assertEquals(1, date.getDay());
	        Assert.assertEquals(3, date.getMonth());
	        Assert.assertEquals(2024, date.getYear());
	    }

	    @Test
	    public void testNonLeapYearFebruary28ToMarch1() {
	        DateUtil date = new DateUtil(28, 2, 2023);
	        System.out.println("testNonLeapYearFebruary28ToMarch1 > Initial Date: " + date);
	        date.increment();
	        System.out.println("After increment: " + date);
	        Assert.assertEquals(1, date.getDay());
	        Assert.assertEquals(3, date.getMonth());
	        Assert.assertEquals(2023, date.getYear());
	    }
}
