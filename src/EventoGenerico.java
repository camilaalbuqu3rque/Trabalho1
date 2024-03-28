import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventoGenerico {

	    protected String titulo;
	    protected String descricao;
	    protected Date dataInicio;
	    protected Date dataFim;
	    protected String localizacao;
	    protected List<String> participantes;

	    public EventoGenerico(String titulo, String descricao, Date dataInicio, Date dataFim, String localizacao) {
	        this.titulo = titulo;
	        this.descricao = descricao;
	        this.dataInicio = dataInicio;
	        this.dataFim = dataFim;
	        this.localizacao = localizacao;
	        this.participantes = new ArrayList<>();
	    }

	    public void adicionarParticipante(String participante) {
	        participantes.add(participante);
	    }

	    public void removerParticipante(String participante) {
	        participantes.remove(participante);
	    }

	    public void imprimirParticipantes() {
	        for (String participante : participantes) {
	            System.out.println(participante);
	        }
	    }
}