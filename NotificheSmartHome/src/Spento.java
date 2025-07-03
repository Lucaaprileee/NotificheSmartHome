public class Spento {
    @Override
    public void cambiaStato(Samsung context) {
        context.changeState(new Acceso());
    }
}
