package regrasNegocio;

public enum Weapon {
	ESPADA("Espada"),
	MARTELO("Martelo"),
	LANCA("Lan�a"),
	ARCO("Arco"),
	ATIRADEIRA("Atiradeira"),
	BASTAO("Bast�o"),
	CHACO("Chaco");
	
	private String nome;
	
	Weapon (String nome) {
		this.nome = nome;
	}
}
