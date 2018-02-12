package com.kodilla.testing.collection;

import org.junit.*;
import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        ArrayList<Integer>list1 = new ArrayList<Integer>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> results = exterminator.exterminate(list1);
        System.out.println("Testing empty list: " + results);
        Assert.assertEquals(0, results.size());

    }

    @Test
    public void testOddNumbersExterminatorNormalList(){

        ArrayList<Integer>list2 = new ArrayList<Integer>();
        list2.add(12);
        list2.add(3);
        list2.add(0);
        list2.add(51);
        list2.add(66);
        list2.add(2);
        ArrayList<Integer>listExpected = new ArrayList<Integer>();
        listExpected.add(12);
        listExpected.add(0);
        listExpected.add(66);
        listExpected.add(2);

        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> results = exterminator.exterminate(list2);

        System.out.println("Testing: " + results);
        Assert.assertEquals(listExpected, results);

    }

}
