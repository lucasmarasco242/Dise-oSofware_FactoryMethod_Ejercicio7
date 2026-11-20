public class BotonEscritorio implements ComponenteUI {
    public void renderizar() {
        System.out.println("Renderizando Botón [Estilo Oscuro de Escritorio].");
    }

    public void interactuar(String accion) {
        System.out.println("Botón Oscuro de Escritorio recibió: " + accion);
    }
}