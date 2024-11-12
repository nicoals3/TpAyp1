import greenfoot.*;

/**
 * Define un MinaEspacial en la Batalla Espacial
 */
public class MinaExplosiva extends ActorBase {
    /**
     * {@value #EXPLOSION_RESTA}
     */
    private static final int EXPLOSION_RESTA = -100;
    
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
     * @return la cantidad de combustible que la MinaEspacial resta
     */
    public int serRecogido() {
        //Explosion explosion = new Explosion();
        Explosion.en(getWorld(), this.getX(), this.getY());
        //explosion.en(getWorld(), super.getX(), super.getY());
        getWorld().removeObject(this);

        
        Greenfoot.delay(20);
        return EXPLOSION_RESTA;
    }
}
