/*----------------------------------------------------------------------
	FILE        : CSDArrayList.java
	AUTHOR      : Java-Feb-2022 Group
	LAST UPDATE : 07.10.2022

	CSDArrayList class

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.collection;

public class CSDArrayList {
    private static final int DEFAULT_CAPACITY = 10;
    private Object [] m_elems;
    private int m_index;

    private static void doWorkForIllegalArgumentException(String message)
    {
        throw new IllegalArgumentException(message);
    }

    private static void doWorkForIndexOutOfBoundException(String message)
    {
        throw new IndexOutOfBoundsException(message);
    }

    private static void checkCapacity(int capacity)
    {
        if (capacity < 0)
            doWorkForIllegalArgumentException("Capacity value can not be negative:" + capacity);
    }

    private void checkIndex(int index)
    {
        if (index < 0 || index >= m_index)
            doWorkForIndexOutOfBoundException("Index out of range:" + index);
    }

    private void changeCapacity(int capacity)
    {
        Object [] temp = new Object[capacity];

        System.arraycopy(m_elems, 0, temp, 0, m_index);
        m_elems = temp;
    }

    private void enlargeCapacityIfNecessary()
    {
        if (m_elems.length == m_index)
            changeCapacity(m_elems.length == 0 ? 1 : m_elems.length * 2);
    }

    public CSDArrayList()
    {
        m_elems = new Object[DEFAULT_CAPACITY];
    }

    public CSDArrayList(int initialCapacity)
    {
        checkCapacity(initialCapacity);
        m_elems = new Object[initialCapacity];
    }

    public boolean add(Object elem)
    {
        enlargeCapacityIfNecessary();

        m_elems[m_index++] = elem;

        return true;
    }

    public void add(int index, Object elem)
    {
        enlargeCapacityIfNecessary();

        for (int i = m_index++; i > index; --i)
            m_elems[i] = m_elems[i - 1];

        m_elems[index] = elem;
    }

    public int capacity()
    {
        return m_elems.length;
    }

    public void clear()
    {
        for (int i = 0; i < m_index; ++i)
            m_elems[i] = null;

        m_index = 0;
    }

    public void ensureCapacity(int minCapacity)
    {
        if (minCapacity > m_elems.length)
            changeCapacity(Math.max(m_elems.length * 2, minCapacity));
    }

    public Object get(int index)
    {
        checkIndex(index);

        return m_elems[index];
    }

    public boolean isEmpty()
    {
        return m_index == 0;
    }

    public Object remove(int index)
    {
        checkIndex(index);
        Object oldElem = m_elems[index];

        for (int i = index; i < m_index - 1; ++i)
            m_elems[i] = m_elems[i + 1];

        m_elems[--m_index] = null;

        return oldElem;
    }

    public Object set(int index, Object elem)
    {
        checkIndex(index);
        Object oldElem = m_elems[index];

        m_elems[index] = elem;

        return oldElem;
    }

    public int size()
    {
        return m_index;
    }

    public void trimToSize()
    {
        if (m_index != m_elems.length)
            changeCapacity(m_index);
    }

    public String toString()
    {
        //TODO:
        return "[]";
    }

    //...
}
