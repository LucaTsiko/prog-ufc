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
    public int validarNumPeleadores(int cantidadMaxPeleadores) {
        int cantidadMaximaPeleadores = Main.pedirNumeroPeleadores(cantidadMaxPeleadores);

        if(cantidadMaxPeleadores < 0) {
            cantidadMaxPeleadores = 20;
        }

        return cantidadMaxPeleadores;
    }

    /**
     * Metodo que busca un peleador por su ID
     * @param id el identificador del luchador que quiere buscar
     * @return el luchador completo si lo encuentra, null en caso contrario
     */
    public Luchador buscarPeleador(int id){
        Luchador luchador = null;
        boolean seguirBuscando = true;

        for (int i = 0; i < NUM_MAX_PELEADORES && seguirBuscando ; i++) {
            if(peleadores[i].getId() == id){
                luchador = peleadores[i];
                seguirBuscando = false;
            }
        }
        return luchador;
    }

    /**
     * Metodo que busca la primera posición libre en el Array de peleadores
     * @return la posición libre si hay, en caso contrario -1
     */
    private int buscarPrimerHuecoLibre(){
        boolean seguirBuscando = true;
        int posicionLibre = -1;

        for (int i = 0; i < NUM_MAX_PELEADORES && seguirBuscando; i++) {
            if(peleadores[i] == null){
                posicionLibre = i;
                seguirBuscando = false;
            }
        }
        return posicionLibre;
    }

    /**
     * Metodo que registra a un peleador en el primer hueco libre del array
     * @param luchador el luchador que queremos registrar
     * @return true si el peleador ha sido registrado, false si no
     */
    public boolean registrarPeleador(Luchador luchador){
        int posicion = buscarPrimerHuecoLibre();
        boolean peleadorResgistrado = false;

        if(buscarPeleador(luchador.getId()) == null){
            if(posicion >= 0){
                peleadores[posicion] = luchador;
                peleadorResgistrado = true;
            }
        }
       return peleadorResgistrado;
    }

    /**
     * Metodo para mostrar a todos los peleadores que hay dentro del respectivo array
     * @return El stringBuilder con todos los peleadores del array
     */
    public String mostrarPeleadores(){
        StringBuilder sb = new StringBuilder("Peleadores: {");

        for (int i = 0; i < NUM_MAX_PELEADORES; i++) {
            if(peleadores[i] != null){
                sb.append(peleadores[i].toString());
            }

        }
        sb.append("}");
        return sb.toString();
    }

    /**
     * Metodo para contar el número de peleadores
     * @return El numero de peleadores que hay en el array.
     */
    public int contarPeleadores(){
        int contador = 0;
        for (int i = 0; i < NUM_MAX_PELEADORES; i++) {
            if(peleadores[i] != null){
                contador++;
            }
        }
        return contador;
    }

}
