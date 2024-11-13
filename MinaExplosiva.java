import greenfoot.*;

/**
 * Define una MinaEspacial en la Batalla Espacial
 */
public class MinaExplosiva extends ActorBase {
    /**
     * {@value #EXPLOSION_RESTA}
     */
    private static final int EXPLOSION_RESTA = -100;
    
    private double ESCALA_X = 0.6;
    private double ESCALA_Y = 0.6;

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
     * post: se genera una Explosion en la ubicacion de la MinaEspacial
     * post: la MinaEspacial desaparece del mundo
     * 
     * @return la cantidad de combustible que la MinaEspacial resta
     */
    public int serRecogido() {
        Explosion.en(getWorld(), this.getX(), this.getY());
        getWorld().removeObject(this);

        Greenfoot.delay(20);
        return EXPLOSION_RESTA;
    }
}
