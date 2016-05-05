package Ejercicios;

public class TestPoligonoRegular {

	public static void main(String[] args) {
		
		PoligonoRegular t1 = new TrianguloEquilatero(6.3);
		PoligonoRegular t2 = new TrianguloEquilatero(4.3);
		PoligonoRegular t3 = new TrianguloEquilatero(3.6);
		
		PoligonoRegular c1 = new Cuadrado(3.8);
		PoligonoRegular c2 = new Cuadrado(2.5);
		PoligonoRegular c3 = new Cuadrado(9.9);
		
		PoligonoRegular h1 = new Hexagono(19.0);
		PoligonoRegular h2 = new Hexagono(14.4);
		PoligonoRegular h3 = new Hexagono(11.7);
		
		ListaPoligonoRegular lista = new ListaPoligonoRegular();
		
		lista.addLista(t1);
		lista.addLista(t2);
		lista.addLista(t3);
		lista.addLista(c1);
		lista.addLista(c2);
		lista.addLista(c3);
		lista.addLista(h1);
		lista.addLista(h2);
		lista.addLista(h3);
		
		for (PoligonoRegular poligono : lista.getLista()) {
			System.out.println(poligono + " perimetro: " + poligono.getPerimetro() + " Area:" + poligono.getArea());
		}
		
		for (PoligonoRegular poligono : lista.getLista()) {
			System.out.printf("Es %s igual a %s?: %b\n", t1, poligono,  t1.equals(poligono));
		}
		
		for (PoligonoRegular poligono : lista.getLista()) {
			System.out.printf("Diferencia de lados entre %s y %s?: %d\n", t1, poligono, t1.compareTo(poligono));
		}
		
	}

}
