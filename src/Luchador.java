public class Luchador {
    private int id;
    private String nombre;
    private String categoriaPeso;
    private int victorias;

    /**
     * Clase constructora
     * @param id numero de identificador del luchador
     * @param nombre nombre de luchador
     * @param categoriaPeso categoria de peso en la que pelea el luchador
     * @param victorias el numero de victorias del luchador
     */
    public Luchador(int id, String nombre, String categoriaPeso, int victorias){
        this.id = id;
        this.nombre = nombre;
        this.categoriaPeso = categoriaPeso;
        this.victorias = victorias;
    }

    /**
     * Devuelve el id del luchador
     * @return id del luchador
     */
    public int getId() {
        return id;
    }

    /**
     * Devuelve el nombre del Luchador
     * @return nombre del Luchador
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve la categoria de peso del luchador
     * @return categoria de peso del luchador
     */
    public String getCategoriaPeso() {
        return categoriaPeso;
    }

    /**
     * Devuelve las victorias del Luchador
     * @return victorias del luchador
     */
    public int getVictorias() {
        return victorias;
    }

    /**
     * Devuelve una representación textual del Luchador con todos sus atributos.
     *
     * @return cadena de texto con la información del Luchador.
     */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Luchador {");

        sb.append("Luchador{");
        sb.append("id=" + id);
        sb.append(", nombre=" + nombre);
        sb.append(", categoriaPeso=" + categoriaPeso);
        sb.append(", victorias=" + victorias);

        sb.append("}");

        return sb.toString();
    }

}


