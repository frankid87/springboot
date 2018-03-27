package com.cinquepalmi.test.spring.springBootTest.controller.versionig;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinquepalmi.test.spring.springBootTest.controller.versionig.PersonV2.Name;

@RestController("person")
public class PersonController {

	@GetMapping("/v1")
	public PersonV1 getV1() {
		return new PersonV1("Marco Antonio");
	}

	@GetMapping("/v2")
	public PersonV2 getV2() {
		return new PersonV2(new Name("Marco", "Antonio"));
	}
	
	@GetMapping(params="version=v1")
	public PersonV1 getRequestParamV1() {
		return new PersonV1("Marco Antonio");
	}

	@GetMapping(params="version=v2")
	public PersonV2 getRequestParamV2() {
		return new PersonV2(new Name("Marco", "Antonio"));
	}
	
	@GetMapping(headers="X-API-VESRION=v1")
	public PersonV1 getHeaderParamV1() {
		return new PersonV1("Marco Antonio");
	}

	@GetMapping(headers="X-API-VESRION=v2")
	public PersonV2 getHeaderParamV2() {
		return new PersonV2(new Name("Marco", "Antonio"));
	}
}
