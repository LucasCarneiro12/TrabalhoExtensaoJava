package entities;


import java.time.LocalDate;

public class Evento {
    private String descricao;
    private LocalDate dataAdicionado;
    private String funcionario;

    public Evento(String descricao, LocalDate dataAdicionado, String funcionario) {
        this.descricao = descricao;
        this.dataAdicionado = dataAdicionado;
        this.funcionario = funcionario;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataAdicionado() {
        return dataAdicionado;
    }

    public String getFuncionario() {
        return funcionario;
    }
}
