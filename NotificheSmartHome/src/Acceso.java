public class Acceso implements Stato{
    @Override
    public void cambiaStato(Samsung context) {
        context.changeState(new Spento());
    }
}
