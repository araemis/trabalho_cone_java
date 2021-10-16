package cone;
public class Cone {
	// raio
	private double raio;
	// altura
	private double altura;
	// tipo de tinta
	private int nivel;
	public final double pi = 3.14;
	// preço total
	private double preco;
	public Cone (double raio,double altura,int nivel){
		setRaio(raio);
		setAltura(altura);
		setNivel(nivel);
	}
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		if (raio > 0)
			this.raio = raio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura > 0)
			this.altura = altura;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		if (nivel == 1) {
			this.preco = 238.90;
			this.nivel = nivel;
		} else if (nivel == 2) {
			this.preco = 467.98;
			this.nivel = nivel;
		} else if (nivel == 3) {
			this.preco = 758.34;
			this.nivel = nivel;
		}
	}

	public double getGeratriz() {
		return Math.sqrt(raio * raio + altura * altura);
	}

	public double areaFundo() {
		return pi * raio * raio;
	}

	public double areaLateral() {
		return pi * raio * getGeratriz();
	}

	public double areaTotal() {
		return pi * raio * (raio + getGeratriz());
	}

	public double litros() {
		return areaTotal() * 3.45;
	}

	public double latas() {
		return Math.ceil(litros() / 18);
	}

	public double getPreco() {
		return preco;
	}
	public double precoFinal() {
		return (preco * latas());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("-->Cone \nRaio:");
		builder.append(raio + "\n");
		builder.append("Altura:");
		builder.append(altura + "\n");
		builder.append("Nível:");
		builder.append(nivel + "\n");
		builder.append("-----------------------------\n");
		builder.append("Geratriz:");
		builder.append(getGeratriz() + "\n");
		builder.append("-----------------------------\n");
		builder.append("areaFundo:");
		builder.append(areaFundo() + "\n");
		builder.append("areaLateral:");
		builder.append(areaLateral() + "\n");
		builder.append("areaTotal:");
		builder.append(areaTotal() + "\n");
		builder.append("-----------------------------\n");
		builder.append("Litros:");
		builder.append(litros() + "\n");
		builder.append("Latas:");
		builder.append(latas() + "\n");
		builder.append("-----------------------------\n");
		builder.append("Preco Total:");
		builder.append(precoFinal() + "\n");
		return builder.toString();
	}
}
