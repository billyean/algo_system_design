package com.haibo.yan.algorithm.datastructure;

import java.util.HashMap;

/**
 *
 * see https://leetcode.com/problems/lru-cache
 *
 * Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following
 * operations: get and put.
 * get(key) - Get the val (will always be positive) of the key if the key exists in the cache, otherwise return -1.
 * put(key, val) - Set or insert the val if the key is not already present. When the cache reached its capacity,
 * it should invalidate the least recently used item before inserting a new item.
 * Follow up:
 * Could you do both operations in O(1) time complexity?
 * Example:
 * LRUCache cache = new LRUCache( 2 * capacity);
 * cache.put(1, 1);
 * cache.put(2, 2);
 * cache.get(1);       // returns 1
 * cache.put(3, 3);    // evicts key 2
 * cache.get(2);       // returns -1 (not found)
 * cache.put(4, 4);    // evicts key 1
 * cache.get(1);       // returns -1 (not found)
 * cache.get(3);       // returns 3
 * cache.get(4);       // returns 4
 *
 * @param <K>
 * @param <V>
 */
public class LRU<K, V> {

    private HashMap<K, DoubleLinkedListNode<K, V>> map = new HashMap<>();

    private DoubleLinkedList<K, V> list = new DoubleLinkedList<>();

    private final int capacity;

    public LRU(int capacity){
        this.capacity = capacity;
    }

    public V get(K key) {
        if (!map.containsKey(key)) {
            return null;
        }

        DoubleLinkedListNode<K, V> node = map.get(key);
        list.remove(node);
        list.append(node);
        return node.value;
    }

    public void set(K key, V value) {
        DoubleLinkedListNode<K, V> node = map.containsKey(key)
                ? map.get(key) : new DoubleLinkedListNode(key, value);

        if (map.containsKey(key)) {
            list.remove(node);
        } else if (map.keySet().size() == capacity) {
            K rKey = list.head.key;
            list.remove(list.head);
            map.remove(rKey);
        }
        list.append(node);

        map.put(key, node);
    }

    public int size() {
        return map.keySet().size();
    }

}
