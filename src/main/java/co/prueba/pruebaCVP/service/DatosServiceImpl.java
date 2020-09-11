package co.prueba.pruebaCVP.service;

import co.prueba.pruebaCVP.entidades.Pais;
import co.prueba.pruebaCVP.entidades.TipoDocumento;
import co.prueba.pruebaCVP.repository.PaisRepository;
import co.prueba.pruebaCVP.repository.TipoDocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatosServiceImpl implements DatosService{

    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;

    @Autowired
    private PaisRepository paisRepository;

    /**
     * obtiene todos los paises de la bd.
     * @return
     */
    @Override
    public List<Pais> obtenerPaises() {
        return paisRepository.findAll();
    }

    /**
     * obtiene todos los tipo de documentos de ls bd.
     * @return
     */
    @Override
    public List<TipoDocumento> obtenerTiposDocumento() {
        return tipoDocumentoRepository.findAll();
    }
}
