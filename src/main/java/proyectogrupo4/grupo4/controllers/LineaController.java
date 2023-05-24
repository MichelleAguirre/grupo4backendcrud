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

import proyectogrupo4.grupo4.entities.Linea;
import proyectogrupo4.grupo4.services.LineaService;


@RestController
@RequestMapping("api/lineainves")
@CrossOrigin("*")
public class LineaController {

    @Autowired
    private LineaService lineaService;

    // crear
    // metod delimitador de acceso,tipo de dato que retorna,nombre del
    // metodo/funcion
    @PostMapping("/create")
    public Linea save(@RequestBody Linea entity) {
        return lineaService.save(entity);
    }

    // traer por id
    @GetMapping("/lista/{id}")
    public Linea findById(@PathVariable long id) {
        return lineaService.findById(id);
    }

    // traer todo
    @GetMapping("/lista")
    public List<Linea> findAll() {
        return lineaService.findAll();
    }

    // actualizar
    @PutMapping("/actualizar")
    public Linea update(@RequestBody Linea entity) {
        return lineaService.save(entity);
    }

    

    // eliminar
    @DeleteMapping("/eliminar/{id}")
    public void deleteById(@PathVariable long id) {
        lineaService.deleteById(id);
    }

}