public class CampoTextoEscritorio implements ComponenteUI {
    public void renderizar() {
        System.out.println("Renderizando Campo de Texto [Estilo Oscuro de Escritorio].");
    }

    public void interactuar(String accion) {
        System.out.println("Campo de Texto Oscuro de Escritorio escribió: " + accion);
    }
}