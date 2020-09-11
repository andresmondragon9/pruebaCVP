package co.prueba.pruebaCVP.excepcion;

public class ManejadorExcepcion extends Exception{

    private static final long serialVersionUID = 1L;

    public ManejadorExcepcion(String error){
        super(error);
    }
}
