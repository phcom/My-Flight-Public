import java.util.ArrayList;

public class GerenciadorRotas 
{
	private ArrayList<Rota> listaRota;
	
	public GerenciadorRotas()
	{
		this.listaRota = new ArrayList<>();
	}
	
	public void add(Rota a) 
	{
		listaRota.add(a);
	}
	
	public ArrayList<Rota> listarTodos()
	{
	ArrayList<Rota> aux = new ArrayList();
		for(Rota a: listaRota)
		{
			aux.add(a);	
		}
		return aux;
	}
}
	
