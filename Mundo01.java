import greenfoot.Color;

public class Mundo01 extends MundoBase {

    public Mundo01() {
        super(12, 9, 80);
    }

    @Override
    protected void generarNaves() {
        NaveRecolectora centinela = new NaveRecolectora();
        int posicionEnX = 2;
        int posicionEnY = 8;
        // agrega la nave centinela en la posición 2, 6
        agregar(centinela, posicionEnX, posicionEnY);
        
        NaveDeAtaque nave = new NaveDeAtaque( Direccion.NORTE, 20);
        int posicionX = 5;
        int posicionY = 5;
        // agrega la nave en la posición 5, 5
        agregar(nave, posicionX, posicionY);
        

    }
    @Override
    protected void generarPOIs() {
        super.generarPOIs();
        marcarCelda(2, 8, new Color(200, 0, 0, 150));
        marcarCelda(6, 5, new Color(0, 200, 0, 150));
    }

    @Override
    protected void generarItems() {
        Item primerItem = new Item();
        Item segundoItem = new Item();

        agregar(primerItem, 2, 1);
        agregar(segundoItem, 2, 2);
    }

    protected void generarAsteroideDeMineral(){
        agregar(new AsteroideDeMineral(10), 8,2);
        agregar(new AsteroideDeMineral(10), 9,2);
        agregar(new AsteroideDeMineral(10), 9,3);
        agregar(new AsteroideDeMineral(100), 5,3);

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
        
        //Columnas derecha
        agregar(new ParedIrrompible(), 10, 1);
        agregar(new ParedIrrompible(), 10, 2);
        agregar(new ParedIrrompible(), 10, 3);
        agregar(new ParedIrrompible(), 10, 4);
        agregar(new ParedIrrompible(), 10, 5);
        agregar(new ParedIrrompible(), 10, 6);
        agregar(new ParedIrrompible(), 10, 7);
        agregar(new ParedIrrompible(), 10, 8);

        
        //Fila Superior
        agregar(new ParedIrrompible(), 2, 1);
        agregar(new ParedIrrompible(), 3, 1);
        agregar(new ParedIrrompible(), 4, 1);
        agregar(new ParedIrrompible(), 5, 1);
        agregar(new ParedIrrompible(), 6, 1);
        agregar(new ParedIrrompible(), 7, 1);
        agregar(new ParedIrrompible(), 8, 1);
        agregar(new ParedIrrompible(), 9, 1);
        agregar(new ParedIrrompible(), 10, 1);

        
        //Fila inferior
        agregar(new ParedIrrompible(), 9, 8);
        agregar(new ParedIrrompible(), 8, 8);
        agregar(new ParedIrrompible(), 7, 8);
        agregar(new ParedIrrompible(), 6, 8);
        agregar(new ParedIrrompible(), 5, 8);
        agregar(new ParedIrrompible(), 4, 8);
        agregar(new ParedIrrompible(), 3, 8);
        
        //Medio
        agregar(new ParedIrrompible(), 6,6);
        agregar(new ParedIrrompible(), 3, 5);
        agregar(new ParedIrrompible(), 4, 4);
        agregar(new ParedIrrompible(), 5, 4);
        agregar(new ParedIrrompible(), 6, 4);
        agregar(new ParedIrrompible(), 7, 4);
        agregar(new ParedIrrompible(), 9, 4);
        agregar(new ParedIrrompible(), 7, 3);
        agregar(new ParedIrrompible(), 7, 2);

    }

    protected void generarPuertas(){
        agregar(new PuertaCerrada(), 8, 4);
    }

    protected void generarLlaves(){
        agregar(new Llave(), 6, 2);
    }

    protected void generarPortales() {
        agregar(new Portal(9,7), 3, 2);
        agregar(new Portal(20,20),4,5);
    }
}

