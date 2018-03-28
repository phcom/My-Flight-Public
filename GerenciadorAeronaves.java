import java.util.ArrayList;

public class GerenciadorAeronaves 
{
	private ArrayList<Aeronave> listaAero;
	
	public GerenciadorAeronaves()
	{
		this.listaAero = new ArrayList<>();
	}
	
	public void add(Aeronave a) 
	{
		listaAero.add(a);
	}
	
	public ArrayList<Aeronave> listarTodos()
	{
	ArrayList<Aeronave> aux = new ArrayList();
		for(Aeronave a: listaAero)
		{
			aux.add(a);	
		}
		return aux;
	}
}
	


