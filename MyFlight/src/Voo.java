import java.time.LocalDateTime;
import java.time.Duration;

public class Voo 
{
	
	@Override
	public String toString() 
	{
		return "Voo \n [DataHora = " + datahora + "]\n [Duração = " + duracao.toHours() + "]\n [Rota = " + rota.getOrigem().getCodigo() + "-" + rota.getDestino().getCodigo() + "]\n [Status = " + status + "]";
	}

	public enum Status { CONFIRMADO, ATRASADO, CANCELADO };
	
	private LocalDateTime datahora;
	private Duration duracao;
	private Rota rota;
	private Status status;
	
	public Voo(Rota rota, LocalDateTime datahora, Duration duracao) 
	{
		this.rota = rota;
		this.datahora = datahora;
		this.duracao = duracao;
		this.status = Status.CONFIRMADO; // default é confirmado
	}
	
	public Rota getRota() 
	{
		return rota;
	}
	
	public LocalDateTime getDatahora() 
	{
		return datahora;
	}
	
	public Duration getDuracao() 
	{
		return duracao;
	}
	
	public Status getStatus() 
	{
		return status;
	}
	
	public void setStatus(Status novo) 
	{
		this.status = novo;
	}
}
