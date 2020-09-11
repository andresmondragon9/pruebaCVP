package co.prueba.pruebaCVP.service;

import co.prueba.pruebaCVP.entidades.Pais;
import co.prueba.pruebaCVP.entidades.TipoDocumento;

import java.util.List;

public interface DatosService {

    List<Pais> obtenerPaises();

    List<TipoDocumento> obtenerTiposDocumento();
}
