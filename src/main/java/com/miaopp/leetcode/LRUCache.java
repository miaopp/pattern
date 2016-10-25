package com.miaopp.leetcode;

import java.util.LinkedHashMap;

/**
 * Created by miaoping on 16/10/18.
 */
public class LRUCache {

    private LinkedHashMap<Integer, Integer> cache;

    public LRUCache(final int capacity) {
        cache = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
            public boolean remove(int key, int value) {
                return cache.size() > capacity;
            }
        };
    }

    public int get(int key) {
        if (!cache.containsKey(key) || null == cache || 0 == cache.size()) {
            return -1;
        }
        return cache.get(key);
    }

    public void set(int key, int value) {
        cache.put(key, value);
    }
}
