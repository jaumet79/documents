package com.jrosselloj.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jrosselloj.model.DocumentosModel;

@Service
public class DocumentosServiceImpl implements IDocumentosService {
	
	@Override
	public DocumentosModel cuentaDocumentos(List<String> docsSisaad, List<String> docsDisdep) {
		
		DocumentosModel documentosModel = new DocumentosModel();
		
		documentosModel.setDocsSisaad(docsSisaad);
		documentosModel.setDocsDisdep(docsDisdep);
		
		List<String> docsCoincidentes = new ArrayList<String>();
		docsCoincidentes.addAll(docsSisaad);
		docsCoincidentes.retainAll(docsDisdep);
		documentosModel.setDocsCoincidents(docsCoincidentes);
		System.out.println("Lista comunes " + documentosModel.getDocsCoincidents());
		
		List<String> docsDifSisaad = new ArrayList<String>();
		docsDifSisaad.addAll(docsSisaad);
		docsDifSisaad.removeAll(docsDisdep);
		documentosModel.setDocsDifSisaad(docsDifSisaad);
		System.out.println("Lista docsDifSisaad " + documentosModel.getDocsDifSisaad());
		
		List<String> docsDifDisdep = new ArrayList<String>();
		docsDifDisdep.addAll(docsDisdep);
		docsDifDisdep.removeAll(docsSisaad);
		documentosModel.setDocsDifDisdep(docsDifDisdep);
		System.out.println("Lista docsDifDisdep " + documentosModel.getDocsDifDisdep());
		
		return documentosModel;
		
	}
	
}
