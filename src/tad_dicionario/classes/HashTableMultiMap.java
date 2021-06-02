
package tad_dicionario.classes;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import tad_dicionario.interfaces.MultiMap;

public class HashTableMultiMap<K, V> implements MultiMap<K, V> {

	private Map<K, LinkedList<Map.Entry<K, V>>> map;

	private int size;

	public HashTableMultiMap() {
		map = new HashMap<K, LinkedList<Map.Entry<K, V>>>();
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public Map.Entry<K, V> get(K key) throws IllegalArgumentException {
		checkKey(key);
		LinkedList<Map.Entry<K, V>> list = map.get(key);

		if (list == null)
			return null;

		return list.peekFirst();
	}

	public Iterable<Map.Entry<K, V>> getAll(K key) throws IllegalArgumentException {
		checkKey(key);
		LinkedList<Map.Entry<K, V>> list = map.get(key);

		if (list == null)
			return null;

		return list;
	}

	public Map.Entry<K, V> put(K key, V value) throws IllegalArgumentException {
		checkKey(key);
		LinkedList<Map.Entry<K, V>> list = map.get(key);
		if (list == null) {
			list = new LinkedList<Map.Entry<K, V>>();
			map.put(key, list);
		}
		Map.Entry<K, V> newEntry = new AbstractMap.SimpleEntry<K, V>(key, value);
		list.add(newEntry);
		size++;

		return newEntry;
	}

	public Map.Entry<K, V> remove(Map.Entry<K, V> entry) throws IllegalArgumentException {
		if (entry == null)
			throw new IllegalArgumentException();

		K key = entry.getKey();
		LinkedList<Map.Entry<K, V>> list = map.get(key);

		if (list == null)
			throw new IllegalArgumentException();

		if (list.remove(entry)) {
			size--;

			if (list.isEmpty())
				map.remove(key);
			
			return entry;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public Iterable<Map.Entry<K, V>> entrySet() {
		LinkedList<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>();

		for (LinkedList<Map.Entry<K, V>> list_entries : map.values())
			list.addAll(list_entries);

		return list;
	}

	protected void checkKey(K key) throws IllegalArgumentException {
		if (key == null)
			throw new IllegalArgumentException();
	}
}
