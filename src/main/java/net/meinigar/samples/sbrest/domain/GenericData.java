package net.meinigar.samples.sbrest.domain;

import java.util.HashMap;
import java.util.Map;

public class GenericData {
private Map<String, Object> gdMap = new HashMap<String, Object>();

public GenericData() {
	
}
public GenericData(Map gd) {
	this.gdMap = gd; 
}

public void setGdMap(String key, Object value) {
	gdMap.put(key, value);
}

public void setGdMap(String mapName, Map<String, Object> rh) {
	gdMap.put(mapName, rh);
}

public Map<String, Object> getGdMap() {
	return this.gdMap;
}

public Object getGdMapValue(String key) {
	return this.gdMap.get(key);
}


}
