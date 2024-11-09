import greenfoot.*;

/**
 * Un ParedIrrompible es un obstáculo que puede ser destruido por una
 * {@link NaveDeAtaque}. Esto llevará una cierta cantidad de ataques
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
