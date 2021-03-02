package br.com.realizecfi.reciclagem.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReciclagemController implements ReciclagemApi {

    @Override
    @GetMapping("/{parametro}") // FIXME
    public ResponseEntity<HelloWorld> helloWorld(@PathVariable(required = true) String parametro) {
        HelloWorld helloWorld = new HelloWorld(parametro);

        return new ResponseEntity<>(helloWorld, HttpStatus.OK);
    }
}
