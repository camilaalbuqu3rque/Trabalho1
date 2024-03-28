// Enum para representar os dias da semana em eventos periódicos
enum DiaSemana {
    DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO
}

// Exceção personalizada para lidar com datas inválidas
@SuppressWarnings("serial")
class DataInvalidaException extends Exception {
    public DataInvalidaException(String mensagem) {
        super(mensagem);
    }
}
