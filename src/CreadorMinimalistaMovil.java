public class CreadorMinimalistaMovil extends CreadorComponente {
    public ComponenteUI crearComponente(String tipo) {
        if (tipo.equals("boton")) {
            return new BotonMovil();
        }
        if (tipo.equals("texto")) {
            return new CampoTextoMovil();
        }
        return null;
    }
}