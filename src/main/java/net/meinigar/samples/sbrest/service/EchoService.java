package net.meinigar.samples.sbrest.service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.meinigar.samples.sbrest.domain.GenericData;

@RestController
public class EchoService {
	
	@GetMapping("/echo/{echoid}")
	@ResponseBody
	public GenericData echoback(@RequestHeader HttpHeaders headers, @RequestParam MultiValueMap<String, String> multiMap) {
		GenericData gdH = new GenericData(headers.toSingleValueMap());
		gdH.setGdMap("QueryParamsList", multiMap);
		Map<String, String> cm = new HashMap<String, String>();
		cm.put("CurrentTimeStamp", LocalDateTime.now().toString());
		gdH.setGdMap("CustomAdds", cm);
		return gdH;
		
		
	}

}
