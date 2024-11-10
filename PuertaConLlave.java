import greenfoot.*;

/**
 * Una PuertaConLlave es...
 */
public class PuertaConLlave extends ActorBase {

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
