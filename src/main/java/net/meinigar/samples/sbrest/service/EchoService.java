package net.meinigar.samples.sbrest.service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.util.MultiValueMap;

import net.meinigar.samples.sbrest.domain.GenericData;


public class EchoService {
	public EchoService() {
		
	}
	
	public GenericData echoHeaders(HttpHeaders headers, MultiValueMap<String, String> multiMap) {
		GenericData gdH = new GenericData(headers.toSingleValueMap());
		gdH.setGdMap("QueryParamsList", multiMap);
		Map<String, String> cm = new HashMap<String, String>();
		cm.put("CurrentTimeStamp", LocalDateTime.now().toString());
		gdH.setGdMap("CustomAdds", cm);
		return gdH;		
	}

}
