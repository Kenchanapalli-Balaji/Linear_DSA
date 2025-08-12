package Hashing;

import java.util.LinkedList;

public class MyHashMap2 
{
	
	    private static final int numBuckets = 10;

	    private static class Entry {
	        int key;
	        String value;
	        Entry next;

	        Entry(int key, String value) {
	            this.key = key;
	            this.value = value;
	        }
	        
	    }
	    
	    private LinkedList<Entry>[] buckets;

	    public MyHashMap2() {
	        buckets = new LinkedList[numBuckets];
	        for (int i = 0; i < numBuckets; i++) {
	            buckets[i] = new LinkedList<>();
	        }
	    }

	    public void put(int key, String value) {
	        int index = key % numBuckets;
	        LinkedList<Entry> bucket = buckets[index];

	        for (Entry entry : bucket) {
	            if (entry.key == key) {
	                entry.value = value;
	                return;
	            }
	        }

	        bucket.add(new Entry(key, value));
	    }

	    public String get(int key) {
	        int index = key % numBuckets;
	        LinkedList<Entry> bucket = buckets[index];

	        for (Entry entry : bucket) {
	            if (entry.key == key) {
	                return entry.value;
	            }
	        }

	        return "key does not exist";
	    }

	    public void remove(int key) {
	        int index = key % numBuckets;
	        LinkedList<Entry> bucket = buckets[index];

	        Entry toRemove = null;
	        for (Entry entry : bucket) {
	            if (entry.key == key) {
	                toRemove = entry;
	                break;
	            }
	        }

	        if (toRemove != null) {
	            bucket.remove(toRemove);
	        }
	    }
	    
	    public void display()
	    {
	    	for(int i=0;i<numBuckets;i++)
	    	{
	    		String st=i+"-->";
	    		for (int j = 0; j < buckets[i].size(); j++) 
	    		{
	    		    Entry entry = buckets[i].get(j);
	    			st=st+"["+entry.key+","+entry.value+"]";
	    			if(j<buckets[i].size())
	    				st=st+"->";
	    		}
	    		
	    		System.out.println(st);
	    	}
	    }
	    
	    public static void main(String[] args) {
	    	MyHashMap2 ht=new MyHashMap2();
			ht.put(101,"Balaji");
			ht.put(102,"Deekshith");
			ht.put(103,"Vishnu");
			ht.put(1,"Sushanth");
			ht.put(121,"Sravani");
			ht.put(202,"Pandu");
			ht.put(11,"Bhargav");
			System.out.println("Successfully created HashMap");
			ht.display();
			System.out.println(ht.get(10));
		}
}

