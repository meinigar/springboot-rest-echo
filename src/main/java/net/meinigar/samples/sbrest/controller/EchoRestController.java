package net.meinigar.samples.sbrest.controller;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class EchoRestController {
	@RequestMapping("/")
	@ResponseBody
	public String response() {
		return LocalDateTime.now().toString();
	}

}
