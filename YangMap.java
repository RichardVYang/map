package com.yang.warrior.com.yang.warrior.map;

import java.util.*;

/**
 * Created by richardyang on 4/15/17.
 *
 */
public class YangMap<K, V> {
    private int size;
    private int DEFAULT_CAPACITY = 16;
    private YangEntry<K, V> [] values = new YangEntry[DEFAULT_CAPACITY];


    public int size() {
        return size;
    }

    private void increaseCapacity() {
        if (size == values.length) {
            int newSize = values.length * 2;
            values = Arrays.copyOf(values, newSize);
        }
    }

    private void condenseArray(int start) {
        for (int i = start; i < size; i++)
            values[i] = values[i + 1];
    }

    public void put(K key, V value) {
        boolean isInserted = true;

        for (int i = 0; i < size; i++) {
            if (values[i].getKey().equals(key)) {
                values[i].setValue(value);
                isInserted = false;
            }
        }
        if (isInserted) {
            increaseCapacity();
            values[size++] = new YangEntry<K, V>(key, value);
        }
    }

    public V get(K key) {
        for (int i = 0; i < size; i++) {
            if (values[i] != null) {
                if (values[i].getKey().equals(key))
                    return values[i].getValue();
            }
        }

        return null;
    }

    public Set<K> getKey() {
        Set<K> set = new HashSet<K>();
        for (int i = 0; i < size; i++)
            set.add(values[i].getKey());

        return set;
    }

    public List<V> getValue() {
        List<V>  list = new ArrayList<>();

        for (int i = 0; i < size; i++)
            list.add(values[i].getValue());

        return list;
    }

    public void remove (K key) {
        for (int i = 0; i < size; i++) {
            if (values[i].getKey().equals(key)) {
                values[i] = null;
                size--;
                condenseArray(i);
            }
        }
    }


}
