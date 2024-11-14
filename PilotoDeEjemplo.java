public class PilotoDeEjemplo extends PilotoBase {
    @Override
    public void subirse(NaveDeAtaque nave) {
        super.subirse(nave);
    }
    
    @Override
    public void bajarse() {
        super.bajarse();
    }

    void despegar() {
        navePilotada.encenderMotores();
    }

    void avanzarAlNortePor(int casilleros) {
        for (int pasos = 0; pasos < casilleros; pasos++) {
            navePilotada.avanzarHacia(Direccion.NORTE);
        }
    }
    
    void avanzarHaciaPor(Direccion direccion, int casilleros) {
        for (int pasos = 0; pasos < casilleros; pasos++) {
            navePilotada.avanzarHacia(direccion);
        }
    }

    int destruirAsteroideHacia(Direccion direccion) {
        int ataques = 0;
        while (navePilotada.hayAsteroideHacia(direccion)) {
            navePilotada.atacarHacia(direccion);
            ataques++;
        }
        return ataques;
    }

    void llegarALaBaseNorte() {
        avanzarAlNortePor(5);
        destruirAsteroideHacia(Direccion.NORTE);
        avanzarAlNortePor(3);
    }
    
    void misionMundo00(NaveDeAtaque nave){
        super.subirse(nave);
        despegar();
        avanzarHaciaPor(Direccion.NORTE, 1);
        avanzarHaciaPor(Direccion.SUR, 2);
        avanzarHaciaPor(Direccion.OESTE, 1);
        avanzarHaciaPor(Direccion.NORTE, 1);
        avanzarHaciaPor(Direccion.OESTE, 1);
        avanzarHaciaPor(Direccion.ESTE, 3);
        nave.abrirPuerta(Direccion.NORTE);
        avanzarHaciaPor(Direccion.NORTE, 2);
        nave.apagarMotores();
        bajarse();
    }
    
    void misionMundo01(){
        
    }
    
    void misionMundo02(){
        
    }
}
