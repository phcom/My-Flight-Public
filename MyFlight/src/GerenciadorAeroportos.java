import java.util.ArrayList;

public class GerenciadorAeroportos 
{
	private ArrayList<Aeroporto> listaAerop;
	
	public GerenciadorAeroportos()
	{
		this.listaAerop = new ArrayList<>();
	}
	
	public void add(Aeroporto a) 
	{
		listaAerop.add(a);
	}
	
	public ArrayList<Aeroporto> listarTodos()
	{
	ArrayList<Aeroporto> aux = new ArrayList();
		for(Aeroporto a: listaAerop)
		{
			aux.add(a);	
		}
		return aux;
	}
}
	
