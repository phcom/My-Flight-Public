import java.util.ArrayList;

public class GerenciadorVoos 
{
	private ArrayList<Voo> listaVoos;
	
	public GerenciadorVoos()
	{
		this.listaVoos = new ArrayList<>();
	}
	
	public void add(Voo a) 
	{
		listaVoos.add(a);
	}
	
	public ArrayList<Voo> listarTodos()
	{
	ArrayList<Voo> aux = new ArrayList();
		for(Voo a: listaVoos)
		{
			aux.add(a);	
		}
		return aux;
	}
}
	
