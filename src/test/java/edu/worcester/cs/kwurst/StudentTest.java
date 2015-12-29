package edu.worcester.cs.kwurst;
import mockit.*;
import org.junit.*;
import static org.junit.Assert.*;
public class StudentTest
{
	@Mocked
	Transcript transcript;
	Student student;
	
	@Before
	public void setup() throws Exception
	{
	}
	
	/**
	 * testGpa is used to check if
	 * the correct GPA is returned if
	 * the grade for the student is an
	 * A with the assumption that 4.0
	 * is being returned
	 */
	
	@Test
	public void testGpa()
	{
		new Expectations()
		{
			{
				transcript = new Transcript();
				transcript.getGpa();
				returns(4.0);
			}
		};
		
		student = new Student("Sue", "Storm");
		assertEquals(4.0, student.getGpa(), 0.0);
	}
	
	/**
	 * testCurrentEarnedCr is used to check if
	 * the correct number of credits is returned
	 * with the assumption that the current earned
	 * credits would be 100 when called
	 */
	
	@Test
	public void testCurrentEarnedCr()
	{
		new Expectations()
		{
			{
				transcript = new Transcript();
				transcript.getCurrentEarnedCr();
				returns(100);
			}
		};
		
		student = new Student("Sue", "Storm");
		
		assertEquals(100, student.getCurrentEarnedCr());
	}
	
	/**
	 * testName is used to check if
	 * the correct first name is returned
	 * in this case it would since we are setting
	 * firstName to Johnny and Sue and immediately
	 * testing to compare the names 
	 */
	
	@Test
	public void testName()
	{
		new Expectations()
		{
			{
				transcript = new Transcript();
			}
		};
		
		student = new Student("Sue", "Storm");
		
		assertEquals("Sue", student.getFirstName());
		assertEquals("Storm", student.getLastName());
		student.setFirstName("Johnny");
		assertEquals("Johnny", student.getFirstName());
	}	
}