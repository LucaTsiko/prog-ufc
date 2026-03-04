public class UFC {
    private Luchador[] peleadores;
    private final int NUM_MAX_PELEADORES;

    /**
     * Metodo constructor de la Clase UFC
     * @param cantidadMaxPeleadores es la cantidad Máxima de peleadores
     */
    public UFC(int cantidadMaxPeleadores) {

        NUM_MAX_PELEADORES =  validarNumPeleadores(cantidadMaxPeleadores);
        peleadores = new Luchador[NUM_MAX_PELEADORES];

    }

    /**
     * Metodo para validar que el número de peleadores que recibo sea positivo
     * @param cantidadMaxPeleadores es la cantidad maxima de peleadores
     * @return numero entero que ha dado el usuario si es > 0, si es menor 20 por defecto.
     */
    public static int validarNumPeleadores(int cantidadMaxPeleadores) {
        int cantidadMaximaPeleadores = Main.pedirNumeroPeleadores(cantidadMaxPeleadores);

        if(cantidadMaxPeleadores < 0) {
            cantidadMaxPeleadores = 20;
        }

        return cantidadMaxPeleadores;
    }
}
