public class Main {
    public static void main(String[] args) {
        CreadorComponente creadorEscritorio = new CreadorOscuroEscritorio();
        ComponenteUI botonEscritorio = creadorEscritorio.crearComponente("boton");
        ComponenteUI textoEscritorio = creadorEscritorio.crearComponente("texto");
        botonEscritorio.renderizar();
        botonEscritorio.interactuar("Clic");
        textoEscritorio.renderizar();
        textoEscritorio.interactuar("Buscar...");

        CreadorComponente creadorMovil = new CreadorMinimalistaMovil();
        ComponenteUI botonMovil = creadorMovil.crearComponente("boton");
        ComponenteUI textoMovil = creadorMovil.crearComponente("texto");
        botonMovil.renderizar();
        botonMovil.interactuar("Toque");
        textoMovil.renderizar();
        textoMovil.interactuar("Hola");
    }
}