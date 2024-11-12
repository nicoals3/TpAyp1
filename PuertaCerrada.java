import greenfoot.*;

/**
 * Una PuertaConLlave es...
 */
public class PuertaCerrada extends ActorBase {
    
    protected boolean abierta = false;
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
    
    public void puertaAbierta() {
        getWorld().removeObject(this);
    }

}
