package Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class ListaPoligonoRegular {

	private List<PoligonoRegular> lista = new ArrayList<PoligonoRegular>();
	
	public boolean addLista(PoligonoRegular poligono){
		return lista.add(poligono);
	}

	public List<PoligonoRegular> getLista() {
		return lista;
	}

	@Override
	public String toString() {
		return "ListaPoligonoRegular [lista=" + lista + "]";
	}
}
