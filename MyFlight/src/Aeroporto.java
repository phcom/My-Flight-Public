

public class Aeroporto 
{
	@Override
	public String toString() 
	{
		return "Aeroporto [Código = " + codigo + ", Nome = " + nome + ", Loc = " + loc + "]";
	}

	private String codigo;
	private String nome;
	private Geo loc;
	
	public Aeroporto(String codigo, String nome, Geo loc) 
	{
		this.codigo = codigo;
		this.nome = nome;
		this.loc = loc;
	}
	
	public String getCodigo() 
	{
		return codigo;
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	public Geo getLocal() 
	{
		return loc;
	}
}
