import greenfoot.*;

/**
 * Define un Portal en la Batalla Espacial
 */
public class Portal extends ActorBase {

    private int destX;
    private int destY;
    
    private double ESCALA_X = 0.9;
    private double ESCALA_Y = 0.9;
    
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
    
    public int devolverDestX(){
        return destX;
    }
    
    public int devolverDestY(){
        return destY;
    }
}
