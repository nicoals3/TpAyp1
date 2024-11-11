import greenfoot.*;

/**
 * Define un MinaEspacial en la Batalla Espacial
 */
public class MinaExplosiva extends ActorBase {
    /**
     * {@value #COMBUSTIBLE_CONTENIDO}
     */
    private static final int COMBUSTIBLE_CONTENIDO = 100;
    
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
     * post: el MinaEspacial desaparece del mundo
     * 
     * @return la cantidad de combustible que el MinaEspacial proporciona
     */
    public int serRecogido() {
        getWorld().removeObject(this);
        Greenfoot.delay(20);
        return COMBUSTIBLE_CONTENIDO;
    }
}
