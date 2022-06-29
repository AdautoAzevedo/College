package regrasNegocio;

public enum Weapon {
	ESPADA("Espada"),
	MARTELO("Martelo"),
	LANCA("Lança"),
	ARCO("Arco"),
	ATIRADEIRA("Atiradeira"),
	BASTAO("Bastão"),
	CHACO("Chaco");
	
	private String nome;
	
	Weapon (String nome) {
		this.nome = nome;
	}
}
