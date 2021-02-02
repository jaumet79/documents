package com.jrosselloj.bean;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jrosselloj.model.DocumentosModel;
import com.jrosselloj.service.IDocumentosService;

@Component
@ManagedBean
@ViewScoped
public class DocumentosBean {
	
	@Autowired
	private IDocumentosService documentosService;
	
	private String sDocsSisaad;
	private String sDocsDisdep;
	private DocumentosModel documentosModel;
	
	@PostConstruct
	public void init() {
		
	}
	
	public void cuentaDocumentos() {
		
		List<String> docsSisaad = Arrays.asList(sDocsSisaad.split("\n"));
		List<String> docsDisdep = Arrays.asList(sDocsDisdep.split("\n"));
		
		documentosModel = documentosService.cuentaDocumentos(docsSisaad, docsDisdep);
	}
	
	public void cuentaReset() {
		sDocsSisaad = null;
		sDocsDisdep = null;
		documentosModel = null;
	}
	
	public String getsDocsSisaad() {
		return sDocsSisaad;
	}
	
	
	public void setsDocsSisaad(String sDocsSisaad) {
		this.sDocsSisaad = sDocsSisaad;
	}
	
	
	public String getsDocsDisdep() {
		return sDocsDisdep;
	}
	
	
	public void setsDocsDisdep(String sDocsDisdep) {
		this.sDocsDisdep = sDocsDisdep;
	}
	
	
	public DocumentosModel getDocumentosModel() {
		return documentosModel;
	}
	
	
	
}
