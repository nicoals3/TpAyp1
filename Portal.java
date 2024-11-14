import greenfoot.*;

/**
 * Define un Portal en la Batalla Espacial
 */
public class Portal extends ActorBase {
    /**
     * La coordenada X a la que se dirige la nave
     */
    private int destX;
    
    /**
     * La coordenada Y a la que se dirige la nave
     */
    private int destY;
    
    private double ESCALA_X = 0.9;
    private double ESCALA_Y = 0.9;
    
    /**
     * post: Inicializa un Portal, con las coordenadas destino indicadas
     * @param destX es la coordenada X a la que se dirige la nave
     * @param destY es la coordenada Y a la que se dirige la nave
     */
    public Portal(int destX, int destY) {
        this.destX = destX;
        this.destY = destY;
    }

    /**
     * Establece la imagen con la escala definida
     */
    @Override
    protected void actualizarImagen() {
        int tamCelda = getWorld().getCellSize();
        GreenfootImage image = getImage();
        image.scale((int) (tamCelda * ESCALA_X), (int) (tamCelda * ESCALA_Y));
        setImage(image);
    }
    /**
     * Se obtiene la coordenada X almacenada en el Portal
     * @return coordenada X destino
     */
    public int devolverDestX(){
        return destX;
    }
    /**
     * Se obtiene la coordenada Y almacenada en el Portal
     * @return coordenada Y destino
     */
    public int devolverDestY(){
        return destY;
    }
}
