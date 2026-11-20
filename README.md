Ejercicio 7 - Generador de Elementos de Interfaz Gráfica Adaptativa

Explicación del programa

En este ejercicio se implementó el patrón de diseño Factory Method para crear componentes de interfaz (Botón y Campo de Texto) adaptados a dos estilos visuales (Oscuro de Escritorio y Minimalista Móvil), sin utilizar librerías externas ni imports.
El programa cuenta con:
- Una interfaz ComponenteUI con los métodos renderizar() e interactuar(String accion).
- Cuatro clases concretas (BotonEscritorio, CampoTextoEscritorio, BotonMovil y CampoTextoMovil) que implementan ComponenteUI.
- Una clase abstracta CreadorComponente con el método de fábrica crearComponente(String tipo).
- Dos clases creadoras concretas (CreadorOscuroEscritorio y CreadorMinimalistaMovil) que generan componentes coherentes con su estilo visual.

Luego, dentro del método main, se utilizan ambos creadores para renderizar botones y campos de texto y simular interacciones.

Lógica utilizada

La lógica del programa consiste en:
- Definir una interfaz común ComponenteUI para el renderizado y la interacción de los componentes.
- Delegar en cada creador concreto la creación de componentes del mismo estilo visual.
- Mantener el código cliente desacoplado de las clases visuales concretas.

Resultado de la ejecución

La ejecución del programa muestra en la consola lo siguiente:
Renderizando Botón [Estilo Oscuro de Escritorio].
Botón Oscuro de Escritorio recibió: Clic
Renderizando Campo de Texto [Estilo Oscuro de Escritorio].
Campo de Texto Oscuro de Escritorio escribió: Buscar...
Renderizando Botón [Estilo Minimalista Móvil].
Botón Minimalista Móvil recibió: Toque
Renderizando Campo de Texto [Estilo Minimalista Móvil].
Campo de Texto Minimalista Móvil escribió: Hola

Captura de pantalla

<img width="717" height="365" alt="image" src="https://github.com/user-attachments/assets/1ce04714-eaa1-4191-9de3-b4e5e1fba0a5" />
