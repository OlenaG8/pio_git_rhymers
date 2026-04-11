package edu.kis.vh.nursery.list;

import org.junit.Assert;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class IntLinkedListTest {

    @Test
    public void testPush() {
        IntLinkedList testList = new IntLinkedList();
        int testValue = 8;
        testList.push(testValue);
        int result = testList.pop();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testPopIfEmpty() {
        IntLinkedList testList = new IntLinkedList();
        int result = testList.pop();
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testIsEmpty() {
        IntLinkedList testList = new IntLinkedList();
        Assert.assertTrue(testList.isEmpty());

        testList.push(8);
        Assert.assertFalse(testList.isEmpty());

        testList.pop();
        Assert.assertTrue(testList.isEmpty());
    }

    @Test
    public void testIsFull() {
        IntLinkedList testList = new IntLinkedList();
        Assert.assertFalse(testList.isFull());
    }

    @Test
    public void testTop() {
        IntLinkedList testList = new IntLinkedList();
        Assert.assertEquals(-1, testList.top());

        testList.push(8);
        testList.push(7);
        Assert.assertEquals(7, testList.top());
    }

    @Test
    public void testPop() {
        IntLinkedList testList = new IntLinkedList();
        Assert.assertEquals(-1, testList.pop());

        testList.push(2);
        Assert.assertEquals(2, testList.pop());
    }
}