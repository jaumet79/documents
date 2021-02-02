package com.jrosselloj.service;

import java.util.List;

import com.jrosselloj.model.DocumentosModel;

public interface IDocumentosService {
	
	public DocumentosModel cuentaDocumentos(List<String> docsSisaad, List<String> docsDisdep);
}
