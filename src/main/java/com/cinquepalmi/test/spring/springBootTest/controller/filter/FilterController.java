package com.cinquepalmi.test.spring.springBootTest.controller.filter;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilterController {
	
	@GetMapping(value="/somebean")
	public List<SomeBean> getSomeBean() {
		return Arrays.asList(
				new SomeBean("value1", "value2", "value3"),
				new SomeBean("value1-1", "value1-2", "value1-3")
				);
	}
	
	@GetMapping(value="/filtersomebean")
	public MappingJacksonValue getFilteredSomeBean(){
		
		List<SomeBean> list = Arrays.asList(
				new SomeBean("value1", "value2", "value3"),
				new SomeBean("value1-1", "value1-2", "value1-3")
				);
		
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("value2");
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBean", filter);
		
		MappingJacksonValue mapping = new MappingJacksonValue(list);
		mapping.setFilters(filters);
		return mapping;
	}
	
}