package classGeneric;

import java.util.ArrayList;
import java.util.Collections;

public class ClassGeneric {

	public static void main(String[] args) {
		Carro car1 = new Carro("Suzuki", 1990);
		Carro car2 = new Carro("Honda", 2023);
		Carro car3 = new Carro("Wolkswager", 2020);
		Carro car4 = new Carro("Fiat", 2001);
		Carro car5 = new Carro("Chevrollet", 2022);
		
		ArrayList<Carro> lista = new ArrayList<Carro>();
		lista.add(car1);
		lista.add(car2);
		lista.add(car3);
		lista.add(car4);
		lista.add(car5);
		
		System.out.println("Ordenar por Ano\n");
		
		Collections.sort(lista, new OrdemAno());
		for(Carro car : lista) {
			System.out.println(car.getModelo()+ " " + car.getAno());
		}
		
		System.out.println("\n<--------------------------------------->\n");
		System.out.println("Ordenar por Modelo\n");
		
		Collections.sort(lista, new OrdemModelo());
		for(Carro car : lista) {
			System.out.println(car.getModelo()+" "+ car.getAno());
		}
	}

}
