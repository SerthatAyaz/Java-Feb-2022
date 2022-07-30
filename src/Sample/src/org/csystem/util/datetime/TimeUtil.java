/*----------------------------------------------------------------------
	FILE        : TimeUtil.java
	AUTHOR      : Java-Feb-2022 Group
	LAST UPDATE : 30.07.2022

	Utility class for Time operations

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.datetime;

import java.util.Random;

public class TimeUtil {
	private TimeUtil()
	{
	}

	public static Time randomTime(Random r)
	{
		//TODO:
		return new Time();
	}

	public static Time randomTime()
	{
		return randomTime(new Random());
	}
}