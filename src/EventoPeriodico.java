import java.util.Date;

// Classe para representar um evento periódico
	class EventoPeriodico extends EventoGenerico {
	    private DiaSemana diaSemana;

	    public EventoPeriodico(String titulo, String descricao, Date dataInicio, Date dataFim, String localizacao, DiaSemana diaSemana) {
	        super(titulo, descricao, dataInicio, dataFim, localizacao);
	        this.setDiaSemana(diaSemana);
	    }

		public DiaSemana getDiaSemana() {
			return diaSemana;
		}

		public void setDiaSemana(DiaSemana diaSemana) {
			this.diaSemana = diaSemana;
		}
	
}
