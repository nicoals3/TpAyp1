import greenfoot.*;

public class Mundo00 extends MundoBase {

    public Mundo00() {
        super(5, 7, 100);
    }

    protected void generarNaves() {
        agregar(new NaveDeAtaque(), 2, 1);

        agregar(new NaveDeAtaqueEnemiga(Direccion.NORTE), 5, 1);

        agregar(new PilotoDeEjemplo(), 0, 4);
    }

    protected void generarPOIs() {
        marcarCelda(0, 0, new Color(0, 0, 200, 150));
    }

    protected void generarItems() {
        agregar(new Item(), 0, 1);
    }

    protected void generarAsteroides() {
        agregar(new Asteroide(), 0, 2);
    }
    
    protected void generarParedes(){
        agregar(new ParedIrrompible(), 2, 3);
        agregar(new ParedIrrompible(), 2, 4);
        agregar(new ParedIrrompible(), 2, 5);
        agregar(new ParedIrrompible(), 3, 5);
        agregar(new ParedIrrompible(), 4, 5);
        agregar(new ParedIrrompible(), 4, 4);
        agregar(new ParedIrrompible(), 4, 3);
    }
    
    protected void generarPuertas(){
        agregar(new PuertaCerrada(), 3, 3);
    }
    
    protected void generarLlaves(){
        agregar(new Llave(), 2, 2);
    }
    
    protected void generarMinasExplosivas(){
        agregar(new MinaExplosiva(), 2, 0);
    }
    
    protected void generarPortales() {
        agregar(new Portal(3,4), 3, 1);
    }
}
