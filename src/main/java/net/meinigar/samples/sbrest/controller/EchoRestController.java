package net.meinigar.samples.sbrest.controller;
import java.time.LocalDateTime;

import org.springframework.http.HttpHeaders;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.meinigar.samples.sbrest.domain.GenericData;
import net.meinigar.samples.sbrest.service.EchoService;

@RestController
public class EchoRestController {
	@GetMapping("/rest")
	@ResponseBody
	public GenericData response() {
		
		GenericData gd_root = new GenericData();
		gd_root.setGdMap("Server", "Welcome to Springboot rest echo apis.");
		gd_root.setGdMap("TimeStamp", LocalDateTime.now().toString());
		return gd_root;
	}
	
	@GetMapping(value = {"/rest/echo", "/rest/echo/**"})
	@ResponseBody
	public GenericData echoback(@RequestHeader HttpHeaders headers, @RequestParam MultiValueMap<String, String> multiMap) {
		EchoService es = new EchoService();
		return (es.echoHeaders(headers, multiMap));		
	}
	

}
