package co.prueba.pruebaCVP.service;

import co.prueba.pruebaCVP.entidades.Persona;
import co.prueba.pruebaCVP.excepcion.ManejadorExcepcion;
import co.prueba.pruebaCVP.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    /**
     * obtiene todas las personas de la bd.
     * @return
     */
    @Override
    public List<Persona> obtenerPersonas() {
        return personaRepository.findAll();
    }

    /**
     * registra un persona en la bd
     * @param persona
     * @return
     */
    @Override
    public Persona guardarPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    /**
     * elimina un persona de bd , valida si existe
     * @param idPersona
     * @throws ManejadorExcepcion
     */
    @Override
    public void eliminarPersona(Integer idPersona) throws ManejadorExcepcion{
        if(personaRepository.findById(idPersona).isPresent()){
            personaRepository.deleteById(idPersona);
        }
        throw new ManejadorExcepcion("la persona no existe");
    }

    /**
     * actuliza una persona en la bd
     * @param persona
     * @return
     * @throws ManejadorExcepcion
     */
    @Override
    public Persona actualizarPersona(Persona persona) throws ManejadorExcepcion{
        Optional<Persona> personaActualizar = personaRepository.findById(persona.getId());
        if(personaActualizar.isPresent()){
            personaActualizar.get().setApellidos(persona.getApellidos());
            personaActualizar.get().setEdad(persona.getEdad());
            personaActualizar.get().setGenero(persona.getGenero());
            personaActualizar.get().setIdPais(persona.getIdPais());
            personaActualizar.get().setIdTipoDocumento(persona.getIdTipoDocumento());
            personaActualizar.get().setNombres(persona.getNombres());
            personaActualizar.get().setNumeroDocumento(persona.getNumeroDocumento());
        }
        throw new ManejadorExcepcion("la persona no existe");
    }
}
