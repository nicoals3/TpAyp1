import greenfoot.Color;

public class Mundo02 extends MundoBase {

    public Mundo02() {
        super(14, 9, 80);
    }

    @Override
    protected void generarNaves() {
        NaveDeAtaque centinela = new NaveDeAtaque();
        int posicionEnX = 6;
        int posicionEnY = 8;
        // agrega la nave centinela en la posición 2, 6
        agregar(centinela, posicionEnX, posicionEnY);

        agregar(new PilotoDeEjemplo(), 0, 8);
        
        agregar(new NaveDeAtaqueEnemiga(Direccion.OESTE), 5, 4);
        agregar(new NaveDeAtaqueEnemiga(Direccion.OESTE), 9, 5);
        agregar(new NaveDeAtaqueEnemiga(Direccion.OESTE), 9, 6);
        agregar(new NaveDeAtaqueEnemiga(Direccion.OESTE), 9, 7);

    }

    @Override
    protected void generarPOIs() {
        super.generarPOIs();
        marcarCelda(6, 8, new Color(200, 0, 0, 150));
        marcarCelda(13, 2, new Color(0, 200, 0, 150));
    }

    @Override
    protected void generarItems() {
        Item primerItem = new Item();
        Item segundoItem = new Item();
        Item tercerItem = new Item();
        Item cuartoItem = new Item();

        agregar(primerItem, 2, 4);
        agregar(segundoItem, 8, 7);
        agregar(tercerItem, 8, 2);
        agregar(cuartoItem, 10, 7);
    }

    @Override
    protected void generarAsteroides() {
        boolean f = false, t = true;
        boolean[][] asteroides = {
                { f, f, f, f, f, f, f, f, f, f },
                { f, f, f, f, f, f, f, f, f, f },
                { f, f, f, f, f, f, f, f, f, f },
                { f, f, f, f, f, f, f, f, f, f },
                { f, f, f, t, f, f, f, f, f, f },
                { f, f, f, t, f, t, f, f, f, f },
                { f, f, f, f, f, t, f, f, f, f },
                { f, f, f, f, f, f, f, f, f, f },
            };
        poblarAsteroidesConMatriz(asteroides);
    }

    protected void generarParedes(){
        //Columnas Izquierda 
        agregar(new ParedIrrompible(), 1, 1);
        agregar(new ParedIrrompible(), 1, 2);
        agregar(new ParedIrrompible(), 1, 3);
        agregar(new ParedIrrompible(), 1, 4);
        agregar(new ParedIrrompible(), 1, 5);
        agregar(new ParedIrrompible(), 1, 6);
        agregar(new ParedIrrompible(), 1, 7);
        agregar(new ParedIrrompible(), 1, 8); 

        //Filas Superior
        agregar(new ParedIrrompible(), 2, 1);
        agregar(new ParedIrrompible(), 3, 1);
        agregar(new ParedIrrompible(), 4, 1);
        agregar(new ParedIrrompible(), 5, 1);
        agregar(new ParedIrrompible(), 6, 1);
        agregar(new ParedIrrompible(), 7, 1);
        agregar(new ParedIrrompible(), 8, 1);
        agregar(new ParedIrrompible(), 9, 1);
        agregar(new ParedIrrompible(), 10, 1);
        agregar(new ParedIrrompible(), 11, 1);
        agregar(new ParedIrrompible(), 12, 1);
        agregar(new ParedIrrompible(), 13, 1);

        //Columna Derecha
        agregar(new ParedIrrompible(), 13, 1);
        agregar(new ParedIrrompible(), 13, 3);
        agregar(new ParedIrrompible(), 13, 4);
        agregar(new ParedIrrompible(), 13, 5);
        agregar(new ParedIrrompible(), 13, 6);
        agregar(new ParedIrrompible(), 13, 7);

        //Filas Inferior
        agregar(new ParedIrrompible(), 12, 8);
        agregar(new ParedIrrompible(), 11, 8);
        agregar(new ParedIrrompible(), 10, 8);
        agregar(new ParedIrrompible(), 9, 8);
        agregar(new ParedIrrompible(), 8, 8);
        agregar(new ParedIrrompible(), 7, 8);
        agregar(new ParedIrrompible(), 7, 8);
        agregar(new ParedIrrompible(), 5, 8);
        agregar(new ParedIrrompible(), 4, 8);
        agregar(new ParedIrrompible(), 3, 8);
        agregar(new ParedIrrompible(), 2, 8);

        //Medio
        agregar(new ParedIrrompible(), 8, 4);
        agregar(new ParedIrrompible(), 7, 2);
        agregar(new ParedIrrompible(), 5, 2);
        agregar(new ParedIrrompible(), 3, 3);
        agregar(new ParedIrrompible(), 9, 3);
        agregar(new ParedIrrompible(), 4, 6);
        agregar(new ParedIrrompible(), 5, 6);
        agregar(new ParedIrrompible(), 6, 6);
        agregar(new ParedIrrompible(), 7, 6);
        agregar(new ParedIrrompible(), 7, 7);
        agregar(new ParedIrrompible(), 10, 5);
        agregar(new ParedIrrompible(), 11, 6);
        agregar(new ParedIrrompible(), 12, 6);

    }  

    protected void generarPuertas(){
        agregar(new PuertaCerrada(), 13, 2);
    }

    protected void generarLlaves(){
        agregar(new Llave(), 12, 7);
    }

    protected void generarPortales() {
        //Portal transporta a las cordenadas del tablero en G5
        agregar(new Portal(6,4), 4, 2); 

        //Portal transporta a las cordenadas del tablero en E5
        agregar(new Portal(4,4), 10, 6);
    }
    

    protected void generarMinasExplosivas(){
        agregar(new MinaExplosiva(), 9, 2);
        agregar(new MinaExplosiva(), 11, 3);
        agregar(new MinaExplosiva(), 5, 3);
        agregar(new MinaExplosiva(), 4, 5);
        agregar(new MinaExplosiva(), 3, 6);

    }
}
