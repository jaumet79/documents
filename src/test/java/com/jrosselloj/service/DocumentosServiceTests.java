package com.jrosselloj.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jrosselloj.service.IDocumentosService;

@SpringBootTest
public class DocumentosServiceTests {
	
	@Autowired
	private IDocumentosService documentosService;
	
	@Test
	void contextLoads() {
		
		List<String> docsSisaad = new ArrayList(Arrays.asList("aa", "bb", "cc", "dd"));
		List<String> docsDisdep = new ArrayList(Arrays.asList("aaa", "bb", "ccc", "dd"));
		documentosService.cuentaDocumentos(docsSisaad, docsDisdep);
		
	}
	
}
