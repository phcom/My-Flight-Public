import java.time.Duration;
import java.time.LocalDateTime;
  		  
  public class App 
  {
	  
  	public static void main(String[] args) 
  	{		  	
  		
 		System.out.println("Início");	
 		
 		GerenciadorAeronaves gerAeronaves = new GerenciadorAeronaves();
 		GerenciadorAeroportos gerAeroportos = new GerenciadorAeroportos();
 		GerenciadorCias gerCias = new GerenciadorCias();
 		GerenciadorRotas gerRotas = new GerenciadorRotas();
 		GerenciadorVoos gerVoos = new GerenciadorVoos();
 
 		Geo geo1 = new Geo(-29.9939,-51.1711);
 		Geo geo2 = new Geo(-23.4356,-46.4731);
 		Geo geo3 = new Geo(38.7742,-9.1342);
 		Geo geo4 = new Geo(25.7933,-80.2906);
 		
 		Aeronave aero1 = new Aeronave("733","Boeing 737-300",140);
 		Aeronave aero2 = new Aeronave("73G","Boeing 737-700",126);
 		Aeronave aero3 = new Aeronave("380","Airbus A380",644);
 		Aeronave aero4 = new Aeronave("764","Boeing 767-400",304);

 		Aeroporto aerop1 = new Aeroporto("POA","Salgado filho", geo1);
 		Aeroporto aerop2 = new Aeroporto("GRU","São Paulo Guarulhos Intl Apt", geo2);
 		Aeroporto aerop3 = new Aeroporto("LIS","Lisbon", geo3);
 		Aeroporto aerop4 = new Aeroporto("MIA","Miami International Apt", geo4);
 		
 		CiaAerea cia1 = new CiaAerea("JJ","LATAM Linhas Aéreas");
 		CiaAerea cia2 = new CiaAerea("G3","Gol Linhas Aéreas SA");
 		CiaAerea cia3 = new CiaAerea("TP","TAP Portugal");
 		CiaAerea cia4 = new CiaAerea("AD","Azul Linhas Aéreas");
 		
 		Rota rota1 = new Rota(cia1, aerop2, aerop1, aero2);
 		Rota rota2 = new Rota(cia2, aerop1, aerop2, aero2);
 		Rota rota3 = new Rota(cia3, aerop4, aerop3, aero3);
 		Rota rota4 = new Rota(cia1, aerop2, aerop1, aero1);
 		
 		Voo voo1 = new Voo(rota1, LocalDateTime.of(2018,8,26,12,30), Duration.ofMinutes(120));
 		Voo voo2 = new Voo(rota2, LocalDateTime.of(2018,4,22,15,30), Duration.ofMinutes(120));
 		Voo voo3 = new Voo(rota3, LocalDateTime.of(2018,9,10,17,00), Duration.ofMinutes(120));
 		Voo voo4 = new Voo(rota4, LocalDateTime.of(2018,11,9,10,00), Duration.ofMinutes(120));
 
 		gerAeronaves.add(aero1);
 		gerAeronaves.add(aero2);
 		gerAeronaves.add(aero3);
 		gerAeronaves.add(aero4);
 		
 		gerAeroportos.add(aerop1);
 		gerAeroportos.add(aerop2);
 		gerAeroportos.add(aerop3);
 		gerAeroportos.add(aerop4);
 		
 		gerCias.add(cia1);
 		gerCias.add(cia2);
 		gerCias.add(cia3);
 		gerCias.add(cia4);
 		
 		gerRotas.add(rota1);
 		gerRotas.add(rota2);
 		gerRotas.add(rota3);
 		gerRotas.add(rota4);
 		
 		gerVoos.add(voo1);
 		gerVoos.add(voo2);
 		gerVoos.add(voo3);
 		gerVoos.add(voo4);
 
 	
 		// Exercicio 1:
 		System.out.println("Exercicio 1:");
 		String codAero = "POA";
 				for(Voo v: gerVoos.listarTodos()) 
 				{
 					if(v.getRota().getOrigem().getCodigo().equals(codAero)||v.getRota().getDestino().getCodigo().equals(codAero))
 					{
 					System.out.println(v.toString());
 					}
 				}
 				
 
 		// Exercicio 2:
 		System.out.println("Exercicio 2:");
 		String codCia = "JJ";
 				for(Rota r:gerRotas.listarTodos())
 				{
 					if(r.getCia().getCodigo().equals(codCia)) 
 					{
 						System.out.println(" Destino Local: "+r.getDestino().getLocal()+ " \n Origem Local: "+ r.getOrigem().getLocal());
 					}
 				}
 		  
 		// Exercicio 3
 		System.out.println("Exercicio 3:");
 		String codAviao = "733";
 			for (Rota r : gerRotas.listarTodos()) 
 			{
				if(r.getAeronave().getCodigo().equals(codAviao))
				{
					System.out.println(r.getCia());
				}
			}
 			
 		System.out.println("Fim");	
  		}
  }

