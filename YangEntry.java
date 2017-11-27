package com.yang.warrior.com.yang.warrior.map;

/**
 * Created by richardyang on 4/15/17.
 */
public class YangEntry<K, V> {
    private final K key;
    private V value;

    public YangEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

}
