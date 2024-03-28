import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestaEvento {
    public static void main(String[] args) {
        // Testando adicionar/remover participantes e imprimir participantes
        testarAdicionarRemoverParticipantes();

        // Testando exceção de data inválida
        testarDataInvalidaException();
    }

    public static void testarAdicionarRemoverParticipantes() {
        // Criando um evento
        EventoUnico evento = new EventoUnico("Aniversário", "Festa de Aniversário", new Date(), new Date(), "Casa");

        // Adicionando participantes
        evento.adicionarParticipante("Camila");
        evento.adicionarParticipante("Catarina");
        evento.adicionarParticipante("Rodrigo");

        // Imprimindo lista de participantes
        System.out.println("Lista de Participantes após inclusão:");
        evento.imprimirParticipantes();

        // Removendo um participante
        evento.removerParticipante("Camila");

        // Imprimindo lista de participantes após remoção
        System.out.println("\nLista de Participantes após remoção:");
        evento.imprimirParticipantes();
    }

    public static void testarDataInvalidaException() {
        try {
            // Criando um evento com datas inválidas
            criarEventoComDatasInvalidas();
        } catch (DataInvalidaException e) {
            System.out.println("\nExceção de data inválida capturada: " + e.getMessage());
        }
    }

    public static void criarEventoComDatasInvalidas() throws DataInvalidaException {
        try {
            // Criando um formato de data
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            // Definindo datas inválidas
            String dataInicioStr = "31/02/2024"; // Fevereiro não têm 31 dias
            String dataFimStr = "35/02/2024";    // Data inválida

            // Parseando as datas
            dateFormat.setLenient(false); // Desativando o modo tolerante para lançar exceção em datas inválidas
            dateFormat.parse(dataInicioStr);
            dateFormat.parse(dataFimStr);

            // Se o parse for bem-sucedido, uma exceção não será lançada
            // Portanto, lançamos manualmente a exceção de data inválida
            throw new DataInvalidaException("Datas inválidas fornecidas.");
        } catch (ParseException e) {
            // Se uma ParseException for lançada, isso significa que uma ou ambas as datas são inválidas
            // Então, lançamos uma exceção de data inválida
            throw new DataInvalidaException("Datas inválidas fornecidas.");
        }
    }
}