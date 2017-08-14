package Test;

import CLI.Operations;

import static junit.framework.TestCase.assertEquals;

public class Test
{
    @org.junit.Test
    public void testSum()
    {
        assertEquals("1 + 2 should be 3", 3, Operations.sum(1,2));
    }

    @org.junit.Test
    public void testSubstract()
    {
        assertEquals("1 - 2 should be -2", -1, Operations.substract(1,2));
    }

    @org.junit.Test
    public void testMulti()
    {
        assertEquals("1 * 2 should be 3", 2, Operations.multiplicate(1,2));
    }

    @org.junit.Test
    public void testDivide()
    {
        assertEquals("1 / 2 should be 0.5", 0.5, Operations.divide(1,2));
    }
}
