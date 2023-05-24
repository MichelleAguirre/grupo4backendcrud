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

import proyectogrupo4.grupo4.entities.Actividad;
import proyectogrupo4.grupo4.services.ActividadService;


    
    @RestController
    @RequestMapping("api/actividad")
    @CrossOrigin("*")
    public class ActividadController {
    
        @Autowired
        private ActividadService actividadService;
    
        // crear
        // metod delimitador de acceso,tipo de dato que retorna,nombre del
        // metodo/funcion
        @PostMapping("/create")
        public Actividad save(@RequestBody Actividad entity) {
            return actividadService.save(entity);
        }
    
        // traer por id
        @GetMapping("/lista/{id}")
        public Actividad findById(@PathVariable long id) {
            return actividadService.findById(id);
        }
    
        // traer todo
        @GetMapping("/lista")
        public List<Actividad> findAll() {
            return actividadService.findAll();
        }
    
        // actualizar
        @PutMapping("/actualizar")
        public Actividad update(@RequestBody Actividad entity) {
            return actividadService.save(entity);
        }
    

        // eliminar
        @DeleteMapping("/eliminar/{id}")
        public void deleteById(@PathVariable long id) {
            actividadService.deleteById(id);
        }
    
    }
