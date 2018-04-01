package net.meinigar.samples.sbrest.domain;

import java.util.HashMap;
import java.util.Map;

public class GenericData {
private Map<String, Object> data = new HashMap<String, Object>();

public GenericData() {
	
}
public GenericData(Map gd) {
	this.data = gd; 
}

public void setGdMap(String key, Object value) {
	data.put(key, value);
}

public void setGdMap(String mapName, Map<String, Object> rh) {
	data.put(mapName, rh);
}

public Map<String, Object> getGdMap() {
	return this.data;
}

public Object getGdMapValue(String key) {
	return this.data.get(key);
}


}
