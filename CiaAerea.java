

public class CiaAerea {
	@Override
	public String toString() 
	{
		return " CiaAerea [Código = " + codigo + ", Nome = " + nome + "]";
	}

	private String codigo;
	private String nome;
	
	public CiaAerea(String codigo, String nome) 
	{
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public String getCodigo() 
	{
		return codigo;
	}
	
	public String getNome() 
	{
		return nome;
	}	
}
