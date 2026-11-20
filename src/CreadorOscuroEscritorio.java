public class CreadorOscuroEscritorio extends CreadorComponente {
    public ComponenteUI crearComponente(String tipo) {
        if (tipo.equals("boton")) {
            return new BotonEscritorio();
        }
        if (tipo.equals("texto")) {
            return new CampoTextoEscritorio();
        }
        return null;
    }
}