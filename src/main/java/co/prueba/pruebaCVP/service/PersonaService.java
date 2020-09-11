package co.prueba.pruebaCVP.service;

import co.prueba.pruebaCVP.entidades.Persona;
import co.prueba.pruebaCVP.excepcion.ManejadorExcepcion;

import java.util.List;

public interface PersonaService {

    List<Persona> obtenerPersonas();

    Persona guardarPersona(Persona persona);

    void eliminarPersona(Integer idPersona) throws ManejadorExcepcion;

    Persona actualizarPersona(Persona persona) throws ManejadorExcepcion;

}
