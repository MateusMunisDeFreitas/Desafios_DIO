package classGeneric;

import java.util.Comparator;

public class Carro implements Comparable<Carro> {
	private String modelo;
	private Integer ano;
	
	public Carro(String modelo, Integer ano) {
		this.modelo = modelo;
		this.ano = ano;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public int compareTo(Carro o) {
		return this.ano.compareTo(o.getAno());
	}	
}

class OrdemModelo implements Comparator<Carro>{

	@Override
	public int compare(Carro o1, Carro o2) {
		return o1.getModelo().compareTo(o2.getModelo());
	}
	
}	

class OrdemAno implements Comparator<Carro>{

	@Override
	public int compare(Carro o1, Carro o2) {
		return o1.getAno().compareTo(o2.getAno());
	}
	
}
