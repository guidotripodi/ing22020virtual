package dataflow.abs;

import java.util.HashMap;

public class ZeroAbstractSet {

	private final HashMap<String, ZeroAbstractValue> map;


	public ZeroAbstractSet(){
		this.map = new HashMap<String, ZeroAbstractValue>();
	}

	public Boolean hasValue(String variable){
		return this.map.containsKey(variable);
	}


	public ZeroAbstractValue getValue(String variable){
		return this.map.get(variable);
	}

	public void setValue(String variable, ZeroAbstractValue value){
		this.map.put(variable, value);
	}

	public ZeroAbstractSet union(ZeroAbstractSet another){

		//esteeee
	    throw new UnsupportedOperationException();

	}

	public void clear(){
		this.map.clear();
	}

	public void putAll(ZeroAbstractSet another){
		this.map.putAll(another.map);
	}

}
