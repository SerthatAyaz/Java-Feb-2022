/*----------------------------------------------------------------------
	FILE        : Time.java
	AUTHOR      : Java-Feb-2022 Group
	LAST UPDATE : 30.07.2022

	Time class that represents a local time

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: org.csystem.util.datetime paketi içerisindeki Time ve TimeUtil sınıflarını yazınız.
	Açıklamalar:
		- Sınıfın public bölümünü değiştirmeden diledğiniz kadar metot ya da veri ekleyebilirsiniz
		- Zaman geçerlilik kontrolü yapılacaktır. Geçersiz olması durumunda program uygun mesaj verip sonlandırılacaktır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.util.datetime;

import java.time.LocalTime;

public class Time {
    private int m_hour, m_minute, m_second, m_millisecond;

    public Time() //Bu ctor içerisinde yazılanların bilinmesi gerekmez. Sadece default ctor'un anlamına odaklanınız
    {
        LocalTime now = LocalTime.now();

        m_hour = now.getHour();
        m_minute = now.getMinute();
        m_second = now.getSecond();
    }

    public Time(int hour, int minute, int second, int millisecond)
    {
       //TODO:
    }

    public int getHour()
    {
        return m_hour;
    }

    public void setHour(int hour)
    {
        //TODO:
    }

    public int getMinute()
    {
        return m_minute;
    }

    public void setMinute(int minute)
    {
        //TODO:
    }

    public int getSecond()
    {
        return m_second;
    }

    public void setSecond(int second)
    {
        //TODO:
    }

    public int getMillisecond()
    {
        return m_millisecond;
    }

    public void setMillisecond(int millisecond)
    {
        //TODO:
    }

    public String toString()
    {
        //TODO:
        return "11:14:34";
    }

    public String toShortTimeString()
    {
        //TODO
        return "11:14";
    }

    public String toLongTimeString()
    {
        //TODO
        return "11:14:34.123";
    }
}
