package com.jrosselloj.model;

import java.util.List;

public class DocumentosModel {

	private List<String> docsSisaad;
	private List<String> docsDisdep;
	private List<String> docsCoincidents;
	private List<String> docsDifSisaad;
	private List<String> docsDifDisdep;

	public List<String> getDocsSisaad() {
		return docsSisaad;
	}

	public void setDocsSisaad(List<String> docsSisaad) {
		this.docsSisaad = docsSisaad;
	}

	public List<String> getDocsDisdep() {
		return docsDisdep;
	}

	public void setDocsDisdep(List<String> docsDisdep) {
		this.docsDisdep = docsDisdep;
	}

	public List<String> getDocsCoincidents() {
		return docsCoincidents;
	}

	public void setDocsCoincidents(List<String> docsCoincidents) {
		this.docsCoincidents = docsCoincidents;
	}

	public List<String> getDocsDifSisaad() {
		return docsDifSisaad;
	}

	public void setDocsDifSisaad(List<String> docsDifSisaad) {
		this.docsDifSisaad = docsDifSisaad;
	}

	public List<String> getDocsDifDisdep() {
		return docsDifDisdep;
	}

	public void setDocsDifDisdep(List<String> docsDifDisdep) {
		this.docsDifDisdep = docsDifDisdep;
	}

	public String getDocsCoincidentsString() {
		return getListaToString(docsCoincidents);
	}

	public String getDocsDifSisaadString() {
		return getListaToString(docsDifSisaad);
	}

	public String getDocsDifDisdepString() {
		return getListaToString(docsDifDisdep);
	}

	public int getNumDocsSisaad() {
		if (this.docsSisaad != null) {
			return this.docsSisaad.size();
		}
		return 0;
	}

	public int getNumDocsDisdep() {
		if (this.docsDisdep != null) {
			return this.docsDisdep.size();
		}
		return 0;
	}

	public int getNumDocsCoincidentes() {
		if (this.docsCoincidents != null) {
			return this.docsCoincidents.size();
		}
		return 0;
	}

	public int getNumDocsDifSisaad() {
		if (this.docsDifSisaad != null) {
			return this.docsDifSisaad.size();
		}
		return 0;
	}

	public int getNumDocsDifDisdep() {
		if (this.docsDifDisdep != null) {
			return this.docsDifDisdep.size();
		}
		return 0;
	}

	private String getListaToString(List<String> lista) {
		String listaString = "";

		if (lista != null) {
			for (String doc : lista) {
				listaString += doc + "\n";
			}
		}

		return listaString;
	}
}
