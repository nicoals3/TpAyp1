import greenfoot.Color;

public class Mundo02 extends MundoBase {

    public Mundo02() {
        super(14, 9, 80);
    }

    @Override
    protected void generarNaves() {
        NaveExploradora centinela = new NaveExploradora();
        int posicionEnX = 2;
        int posicionEnY = 6;
        // agrega la nave centinela en la posición 2, 6
        agregar(centinela, posicionEnX, posicionEnY);
    }

    @Override
    protected void generarPOIs() {
        super.generarPOIs();
        marcarCelda(2, 6, new Color(200, 0, 0, 150));
        marcarCelda(7, 1, new Color(0, 200, 0, 150));
    }

    @Override
    protected void generarItems() {
        Item primerItem = new Item();
        Item segundoItem = new Item();

        agregar(primerItem, 2, 1);
        agregar(segundoItem, 7, 6);
    }

    @Override
    protected void generarAsteroides() {
        boolean f = false, t = true;
        boolean[][] asteroides = {
                { f, f, f, f, f, f, f, f, f, f },
                { f, f, f, f, t, f, f, f, f, f },
                { f, f, f, f, f, f, f, f, f, t },
                { f, f, t, f, f, t, f, f, f, f },
                { f, t, f, t, f, f, f, f, t, f },
                { f, f, f, f, f, f, t, f, f, f },
                { f, f, f, f, f, t, f, f, f, f },
                { f, f, f, f, f, f, f, f, f, f },
        };
        poblarAsteroidesConMatriz(asteroides);
    }
    
    protected void generarParedes(){
        agregar(new ParedIrrompible(), 2, 3);
        agregar(new ParedIrrompible(), 2, 4);
        agregar(new ParedIrrompible(), 2, 5);
        agregar(new ParedIrrompible(), 3, 5);
        agregar(new ParedIrrompible(), 4, 5);
        agregar(new ParedIrrompible(), 4, 4);
        agregar(new ParedIrrompible(), 4, 3);
        agregar(new ParedIrrompible(), 3, 5);
        agregar(new ParedIrrompible(), 4, 5);
        agregar(new ParedIrrompible(), 4, 4);
        agregar(new ParedIrrompible(), 4, 3);
        
        agregar(new ParedIrrompible(), 2, 3);
        agregar(new ParedIrrompible(), 2, 4);
        agregar(new ParedIrrompible(), 2, 5);
        agregar(new ParedIrrompible(), 3, 5);
        agregar(new ParedIrrompible(), 4, 5);
        agregar(new ParedIrrompible(), 4, 4);
        agregar(new ParedIrrompible(), 4, 3);
        agregar(new ParedIrrompible(), 3, 5);
        agregar(new ParedIrrompible(), 4, 5);
        agregar(new ParedIrrompible(), 4, 4);
        agregar(new ParedIrrompible(), 4, 3);
        
        agregar(new ParedIrrompible(), 2, 3);
        agregar(new ParedIrrompible(), 2, 4);
        agregar(new ParedIrrompible(), 2, 5);
        agregar(new ParedIrrompible(), 3, 5);
        agregar(new ParedIrrompible(), 4, 5);
        agregar(new ParedIrrompible(), 4, 4);
        agregar(new ParedIrrompible(), 4, 3);
        agregar(new ParedIrrompible(), 3, 5);
        agregar(new ParedIrrompible(), 4, 5);
        agregar(new ParedIrrompible(), 4, 4);
        agregar(new ParedIrrompible(), 4, 3);
        
        agregar(new ParedIrrompible(), 2, 3);
        agregar(new ParedIrrompible(), 2, 4);
        agregar(new ParedIrrompible(), 2, 5);
        agregar(new ParedIrrompible(), 3, 5);
        agregar(new ParedIrrompible(), 4, 5);
        agregar(new ParedIrrompible(), 4, 4);
        agregar(new ParedIrrompible(), 4, 3);
        agregar(new ParedIrrompible(), 3, 5);
        agregar(new ParedIrrompible(), 4, 5);
        agregar(new ParedIrrompible(), 4, 4);
        agregar(new ParedIrrompible(), 4, 3);
    }
}