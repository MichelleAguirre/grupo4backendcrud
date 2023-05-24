package proyectogrupo4.grupo4.controllers;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyectogrupo4.grupo4.entities.DocumentoProyecto;
import proyectogrupo4.grupo4.services.DocumentoProyectoService;


@RestController
@RequestMapping("api/documentoproyecto")
@CrossOrigin("*")
public class DocumentoProyectoController {

    @Autowired
    private DocumentoProyectoService documentoproyectoService;

    // crear
    // metod delimitador de acceso,tipo de dato que retorna,nombre del
    // metodo/funcion
    @PostMapping("/create")
    public DocumentoProyecto save(@RequestBody DocumentoProyecto entity) {
        return documentoproyectoService.save(entity);
    }

    // traer por id
    @GetMapping("/lista/{id}")
    public DocumentoProyecto findById(@PathVariable long id) {
        return documentoproyectoService.findById(id);
    }

    // traer todo
    @GetMapping("/listas")
    public List<DocumentoProyecto> findAll() {
        return documentoproyectoService.findAll();
    }

    // actualizar
    @PutMapping("/actualizar")
    public DocumentoProyecto update(@RequestBody DocumentoProyecto entity) {
        return documentoproyectoService.save(entity);
    }

    
    // eliminar
    @DeleteMapping("/eliminar/{id}")
    public void deleteById(@PathVariable long id) {
        documentoproyectoService.deleteById(id);
    }

}