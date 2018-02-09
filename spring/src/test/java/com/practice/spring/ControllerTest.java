package com.practice.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.practice.spring.Controller.CotizacionController;

@RunWith(SpringRunner.class)
@WebMvcTest(value = CotizacionController.class, secure = false)
public class ControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private CotizacionController cotController;
	
	@Test
	public void retrieveCotizacionAllList() throws Exception {
			
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/cotizaciones/").accept(
				MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		
		System.out.println(result.getResponse());
	}
}
