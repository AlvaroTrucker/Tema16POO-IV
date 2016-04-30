package Ejercicios;

public class TestPoligonoRegular {

	public static void main(String[] args) {
		
		PoligonoRegular pT1 = new TrianguloEquilatero(6.3);
		PoligonoRegular pT2 = new TrianguloEquilatero(4.5);
		PoligonoRegular pT3 = new TrianguloEquilatero(3.2);
		
		PoligonoRegular pC1 = new Cuadrado(3.1);
		PoligonoRegular pC2 = new Cuadrado(2.1);
		PoligonoRegular pC3 = new Cuadrado(9.4);
		
		PoligonoRegular pH1 = new Hexagono(19.5);
		PoligonoRegular pH2 = new Hexagono(14.3);
		PoligonoRegular pH3 = new Hexagono(11.5);
		
		ListaPoligonoRegular lPR = new ListaPoligonoRegular();
		
		lPR.addLista(pH3);lPR.addLista(pH2);lPR.addLista(pH1);lPR.addLista(pC3);lPR.addLista(pC2);lPR.addLista(pC1);lPR.addLista(pT3);lPR.addLista(pT2);lPR.addLista(pT1);
		
		for (PoligonoRegular poligono : lPR.getLista()) {
			System.out.println(poligono + " perímetro: " + poligono.getPerimetro() + " área:" + poligono.getArea());
		}
		
		for (PoligonoRegular poligono : lPR.getLista()) {
			System.out.format("¿Es %s igual a %s?: %b\n", pT1, poligono,  pT1.equals(poligono));
		}
		
		for (PoligonoRegular poligono : lPR.getLista()) {
			System.out.format("¿Diferencia de lados entre %s y %s?: %d\n", pT1, poligono, pT1.compareTo(poligono));
		}
		
	}

}
