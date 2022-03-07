package com.rightmove.property;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
public class PropertyController {

	@PostMapping("/test")
	public PropertyResult getProperties() {
		return new PropertyResult(Collections.emptyList());
	}
}
