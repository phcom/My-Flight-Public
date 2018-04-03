

public class Aeronave 
{
	@Override
	public String toString() 
	{
		return "Aeronave [Código = " + codigo + "]\n [Descrição = " + descricao + "]\n [Capacidade = " + capacidade + "]";
	}

	private String codigo;
	private String descricao;
	private int capacidade;
	
	public Aeronave(String codigo, String descricao, int capacidade) 
	{
		this.codigo = codigo;
		this.descricao = descricao;
		this.capacidade = capacidade;
	}
	
	public String getCodigo() 
	{
		return codigo;
	}
	
	public String getDescricao() 
	{
		return descricao;
	}
	
	public int getCapacidade() 
	{
		return capacidade;
	}
	
}
