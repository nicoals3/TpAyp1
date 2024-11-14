import greenfoot.*;

/**
 * Define un Llave en la Batalla Espacial
 */
public class Llave extends ActorBase {

    
    private double ESCALA_X = 0.9;
    private double ESCALA_Y = 0.9;

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
     * post: la Llave desaparece del mundo
     * 
     * @return si la Llave fue recogida
     */
    public boolean serRecogido() {
        getWorld().removeObject(this);
        Greenfoot.delay(20);
        return true;
    }
}
