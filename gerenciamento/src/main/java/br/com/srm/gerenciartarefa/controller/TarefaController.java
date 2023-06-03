package br.com.srm.gerenciartarefa.controller;

import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import br.com.srm.gerenciartarefa.entidades.Tarefa;
import br.com.srm.gerenciartarefa.repository.TarefaRepository;
import br.com.srm.gerenciartarefa.services.TarefaService;

import java.util.List;

@Controller
public class TarefaController {

    private static final Tarefa atualizarTarefa = null;
    @Autowired
    private TarefaRepository tarefaRepository;

    @GetMapping("/listar")
    public String index(Model model) {
        List<Tarefa> tarefas = tarefaRepository.findAll();
        model.addAttribute("tarefas", tarefas);
        return "tarefas";
    }

    @GetMapping("/tarefas/criar")
    public String createForm(Model model) {
        model.addAttribute("tarefa", new Tarefa());
        return "criar";
    }

    @PostMapping("/tarefas/criar")
    public String criarTarefa(@ModelAttribute Tarefa tarefa) {
        TarefaService.save(tarefa);
        return "criar";
    }

    @GetMapping("/tarefas/editar/{id}")
    public String editForm(@PathVariable("id") Long id, Model model) {
        Tarefa tarefa = tarefaRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("ID da tarefa inválido!"));
        model.addAttribute("tarefas", tarefa);
        return "editar";
    }

    @PostMapping("/tarefas/atualizar/{id}")
    public String atualizarTarefa(@PathVariable("id") Long id, @ModelAttribute Tarefa atualizTarefa) {
        Tarefa tarefa = TarefaService.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid task ID"));
        tarefa.setTitulo(atualizarTarefa.getTitulo());
        tarefa.setDescricao(atualizarTarefa.getDescricao());
        tarefa.setStatus(atualizarTarefa.getStatus());
        tarefa.setData_conclusao(atualizarTarefa.getData_conclusao());
        TarefaService.save(tarefa);
        return "atualizar";
    }

    @GetMapping("/tarefas/excluir/{id}")
    public String excluirTarefa(@PathVariable("id") Long id) {
        Tarefa tarefa = TarefaService.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid task ID"));
        TarefaService.excluir(tarefa);
        return "excluir";
    }
}
