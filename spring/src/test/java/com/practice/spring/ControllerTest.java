package com.practice.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import com.practice.spring.Controller.CotizacionController;

@RunWith(SpringRunner.class)
@WebMvcTest(value = CotizacionController.class, secure = false)
public class ControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void retrieveCotizacionAllList() throws Exception {
			
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/cotizaciones/").accept(
				MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		
		System.out.println(result.getResponse());
	}
}
