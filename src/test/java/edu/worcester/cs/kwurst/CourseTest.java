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

public class CourseTest
{
	
	Course c1;
	/**
	 * sets up the c1 Course object
	 * for the upcoming tests
	 * @throws Exception
	 */
	@Before
	public void setup() throws Exception
	{
		c1 = new Course("CS", 443, "Software Quality Assurance and Testing", 3);
	}
	
	/**
	 * testDepartment checks to see if the
	 * correct department is returned after
	 * being assigned
	 */
	
	@Test
	public void testDepartment()
	{
		assertEquals(c1.getDepartment(), "CS");
		c1.setDepartment("MA");
		assertEquals(c1.getDepartment(), "MA");
	}
	
	/**
	 * testNumber validates if the
	 * correct number is returned
	 * after setting it
	 */
	
	@Test
	public void testNumber()
	{
		assertEquals(c1.getNumber(), 443);
		c1.setNumber(448);
		assertEquals(c1.getNumber(), 448);
	}
}