package edu.worcester.cs.kwurst;

/*
 * Copyright (C) 2015 Karl R. Wurst
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301, USA
 */

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GradeTest
{
	
	Grade g1;
	Grade g2;
	Grade g3;
	/**
	 * sets up the grade objects
	 * g1, g2, g3 before running 
	 * the tests
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception
	{
		g1 = new Grade("A");
		g2 = new Grade("A");
		g3 = new Grade("A-");
	}
	
	/**
	 * testGetLetterGrade is used to make sure
	 * that the correct grade is being returned
	 * in this case would be true for the first
	 * statement since g1 is an A but false for
	 * the second since g1 is not an A-
	 */
	
	@Test
	public void testGetLetterGrade()
	{
		assertEquals(g1.getLetterGrade(), "A");
		assertNotEquals(g1.getLetterGrade(), "A-");
	}
	
	/**
	 * testGetNumericGrade is used to check if the
	 * correct GPA representation of the letter
	 * grade is returned. For the first statement
	 * it would return true since an A is a 4.0 and
	 * the second one would be false since an A- is
	 * not a 4.0
	 */
	
	@Test
	public void testGetNumericGrade()
	{
		assertEquals(g1.getNumericGrade(), 4.0, 0.0);
		assertNotEquals(g3.getNumericGrade(), 4.0, 0.0);
	}
	
	/**
	 * testEquals method is used to determine
	 * whether or not the grade objects are equal
	 * Here g1 and g2 are equal since they both have
	 * the same letter grade but g1 and g3 are not
	 * since they are different
	 */
	
	@Test
	public void testEquals()
	{
		assertEquals(g1, g2);
		assertNotEquals(g1, g3);
	}
}
