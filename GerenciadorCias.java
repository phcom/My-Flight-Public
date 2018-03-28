import java.util.ArrayList;

public class GerenciadorCias 
{
	private ArrayList<CiaAerea> listaCia;
	
	public GerenciadorCias()
	{
		this.listaCia = new ArrayList<>();
	}
	
	public void add(CiaAerea a) 
	{
		listaCia.add(a);
	}
	
	public ArrayList<CiaAerea> listarTodos()
	{
	ArrayList<CiaAerea> aux = new ArrayList();
		for(CiaAerea a: listaCia)
		{
			aux.add(a);	
		}
		return aux;
	}
}
	
