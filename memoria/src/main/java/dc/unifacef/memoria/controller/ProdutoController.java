package dc.unifacef.memoria.controller;

import dc.unifacef.memoria.model.Produto;
import dc.unifacef.memoria.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;

import java.net.URI;
import java.util.List;

@RestController //controlador de requisições REST
@RequestMapping("/produto") //mapeamento de requisição
public class ProdutoController {

    //injeção de dependências
    //chamar metodos de um objeto sem instacia-lo
    @Autowired
    ProdutoService service;

    //responseEntity é um tipo de dado de retorno do controller para o FE(Front End)
    @GetMapping
    public ResponseEntity<List<Produto>> consulta(){
        return ResponseEntity.ok(service.consulta());
    }

    @PostMapping
    public ResponseEntity<Produto> cria(@RequestBody Produto produto){
        Produto novo = service.cria(produto);
        //URI uniform resource identifier
        URI uri = URI.create("/produto/"+ novo.getId());
        return ResponseEntity.created(uri).body(novo);
    }
}
