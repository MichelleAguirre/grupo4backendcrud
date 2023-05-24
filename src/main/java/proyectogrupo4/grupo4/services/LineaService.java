package proyectogrupo4.grupo4.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyectogrupo4.grupo4.entities.Linea;
import proyectogrupo4.grupo4.repository.LineaRepository;



@Service
public class LineaService {
    //atributo delimitador de acceso,tipo de dato,nombre del atributo
    @Autowired
    private LineaRepository lineaRepository;

    //Crud
    //crear
    //metod delimitador de acceso,tipo de dato que retorna,nombre del metodo/funcion
    public Linea save( Linea entity){
        return lineaRepository.save(entity);
    }

    //read
    public Linea findById(long id){
        return lineaRepository.findById(id).orElse(null);
    }

    //delete
    public void deleteById(long id){
        lineaRepository.deleteById(id);
    }

    //traer todo
   public List<Linea> findAll(){
       return lineaRepository.findAll();
   }
} 