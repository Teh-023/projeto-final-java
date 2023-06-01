package br.com.srm.gerenciartarefas.dto.tarefasdto;

import lombok.Data;

@Data
public class TarefasDto {

    private Long id;
    private String titulo;
    private String descricao;
    private String status;
    private int data_conclusao; 

    



    
    
}