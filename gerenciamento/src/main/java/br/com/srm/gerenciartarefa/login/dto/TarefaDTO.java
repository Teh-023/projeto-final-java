package br.com.srm.gerenciartarefa.login.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TarefaDTO {

    private long id;

    private String titulo;

    private String descricao;

    private String status;

    private String data_conclusao;

    
}