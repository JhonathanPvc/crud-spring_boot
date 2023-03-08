package controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Pessoa;
import repository.PessoaRepository;

@RestController
public class PessoaController {
    private PessoaRepository repository;

    /**
     * @return
     */
    @GetMapping("/v1/pessoa/listarTodos")
    public ResponseEntity<List<Pessoa>> getListPessoas() {
        try {
            return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}