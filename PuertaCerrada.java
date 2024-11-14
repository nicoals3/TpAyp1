import greenfoot.*;

/**
 * Una PuertaConLlave es un obstaculo que bloquea el camino de la Nave hasta que se abra con una llave
 */
public class PuertaCerrada extends ActorBase {
    
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
    
    /**
     * Abre la puerta
     * post: se elimina la puerta
     */
    public void puertaAbierta() {
        getWorld().removeObject(this);
    }

}
