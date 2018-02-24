package com.github.slamdunk.javabase.designpattern.behavior.iterator;

import com.github.slamdunk.javabase.designpattern.interfaces.Collection;
import com.github.slamdunk.javabase.designpattern.interfaces.Iterator;

public class MyIterator<T> implements Iterator<T> {

	private Collection<T> collection;  
	private int pos = -1;  

	public MyIterator(Collection<T> collection){  
	    this.collection = collection;  
	}  

	public T previous() {  
	    if(pos > 0){  
	        pos--;  
	    }  
	    return collection.get(pos);  
	}  

	public T next() {  
	    if(pos<collection.size()-1){  
	        pos++;  
	    }  
	    return collection.get(pos);  
	}  

	public boolean hasNext() {  
	    if(pos<collection.size()-1){  
	        return true;  
	    }else{  
	        return false;  
	    }  
	}  

	public T first() {  
	    pos = 0;  
	    return collection.get(pos);  
	}  
}
