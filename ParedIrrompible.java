import greenfoot.*;

/**
 * Una ParedIrrompible es un obstáculo que no puede ser destruido.
 */
public class ParedIrrompible extends ActorBase {
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void actualizarImagen() {
        int tamCelda = getWorld().getCellSize();
        GreenfootImage image = getImage();
        image.scale(tamCelda, tamCelda);
        setImage(image);
    }

}
