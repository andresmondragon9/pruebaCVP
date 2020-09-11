package co.prueba.pruebaCVP.controller;

import co.prueba.pruebaCVP.entidades.Pais;
import co.prueba.pruebaCVP.entidades.Persona;
import co.prueba.pruebaCVP.entidades.TipoDocumento;
import co.prueba.pruebaCVP.service.DatosService;
import co.prueba.pruebaCVP.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/crud")
public class Controlador {

    @Autowired
    private PersonaService personaService;

    @Autowired
    private DatosService datosService;

    @RequestMapping(value="/obtener/personas", method = RequestMethod.GET)
    public List<Persona> obtenerPersonas() throws Exception{
        return personaService.obtenerPersonas();
    }

    @RequestMapping(value="/obtener/tipodocumentos", method = RequestMethod.GET)
    public List<TipoDocumento> obtenerTipoDocumento() throws Exception{
        return datosService.obtenerTiposDocumento();
    }

    @RequestMapping(value="/obtener/paises", method = RequestMethod.GET)
    public List<Pais> obtenerPais() throws Exception{
        return datosService.obtenerPaises();
    }

    @RequestMapping(value = "/crear/persona", method = RequestMethod.PUT)
    public Persona actualizarPersona (@RequestBody Persona persona) throws Exception{
        return personaService.actualizarPersona(persona);
    }

    @RequestMapping(value = "/actualizar/persona", method = RequestMethod.POST)
    public Persona crearPersona (@RequestBody Persona persona) throws Exception{
        return personaService.guardarPersona(persona);
    }

    @RequestMapping(value = "/eliminar/persona/{idPersona}", method = RequestMethod.DELETE)
    public void eliminarPersona (@PathVariable Integer idPersona) throws Exception{
         personaService.eliminarPersona(idPersona);
    }

}
