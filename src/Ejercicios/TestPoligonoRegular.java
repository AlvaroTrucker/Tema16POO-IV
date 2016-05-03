package Ejercicios;

public class TestPoligonoRegular {

	public static void main(String[] args) {
		
		PoligonoRegular t1 = new TrianguloEquilatero(6.3);
		PoligonoRegular t2 = new TrianguloEquilatero(4.5);
		PoligonoRegular t3 = new TrianguloEquilatero(3.2);
		
		PoligonoRegular c1 = new Cuadrado(3.1);
		PoligonoRegular c2 = new Cuadrado(2.1);
		PoligonoRegular c3 = new Cuadrado(9.4);
		
		PoligonoRegular h1 = new Hexagono(19.5);
		PoligonoRegular h2 = new Hexagono(14.3);
		PoligonoRegular h3 = new Hexagono(11.5);
		
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
			System.out.printf("¿Es %s igual a %s?: %b\n", t1, poligono,  t1.equals(poligono));
		}
		
		for (PoligonoRegular poligono : lista.getLista()) {
			System.out.printf("¿Diferencia de lados entre %s y %s?: %d\n", t1, poligono, t1.compareTo(poligono));
		}
		
	}

}
