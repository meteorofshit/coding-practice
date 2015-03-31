package com.practice;

import static org.junit.Assert.*;
import org.junit.*;

public class ArrayStringTest {

    @Test
    public void hasRepeatedLetters() {
        assertTrue(ArrayString.hasRepeatedLetters("Coconut"));
        assertFalse(ArrayString.hasRepeatedLetters("Gabriel"));
    }

    @Test
    public void isPelindromeTest() {
        assertFalse(ArrayString.isPelindrome("test"));
        assertTrue(ArrayString.isPelindrome("aba"));
    }

    @Test
    public void ReverseTest() {
        assertEquals("dbca", ArrayString.Reverse("acbd"));
        assertNotEquals("abcd", ArrayString.Reverse("abcd"));
    }

    @Test
    public void MergeArraysTest() {
        char[] a = new char[]{'a', 'f'};
        char[] b = new char[]{'c', 'e'};
        assertArrayEquals(new char[]{'a','c','e','f'},
                ArrayString.MergeArrays(a,b));
    }

}
