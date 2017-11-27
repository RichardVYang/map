package com.yang.warrior.com.yang.warrior.map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by richardyang on 4/15/17.
 */
class YangMapTest {
    YangMap<String, Integer> map;
  //  YangMap<String, Integer> map = new YangMap<String, Integer>();
    /*
    @BeforeAll
    public void setup() {
        System.out.println("Entering YangMapTest::setUp() for BeforeAll..........");
        YangMap<String, Integer> map = new YangMap<String, Integer>();
        map.put("Yang", 3);
        map.put("Yang", 5);
        map.put("Vang", 2);
        map.put("vang", 4);
        map.put("Rwm", 6);
    }
*/
    @BeforeEach
    public void setUp() {
        System.out.println("Entering YangMapTest::setUp()");
        map = new YangMap<String, Integer>();
        map.put("Yang", 3);
        map.put("Yang", 5); // intentional duplicated key
        map.put("Vang", 2);
        map.put("vang", 4);
        map.put("Rwm", 6);

    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void size() {
        System.out.println("Entering YangMapTest::size()");
        System.out.println("Size: " + map.size());
    }

    @Test
    void getKey() {
        System.out.println("Entering YangMapTest::getKey()");
        Set<String> keys = map.getKey();
        System.out.println("keys: "+ keys);
    }

    @Test
    void getValue() {
        System.out.println("Entering YangMapTest::getValue()");
        List<Integer> values = map.getValue();
        System.out.println("values: " + values);
    }

    @Test
    void remove() {
        System.out.println("Entering YangMapTest::remove()");

    }

    @Test
    void get() {
        System.out.println("Entering YangMapTest::get()");
        System.out.println("map.get(\"Yang\"): " + map.get("Yang"));
    }

    @Test
    void put() {
        System.out.println("Entering YangMapTest::put()");
    }

}