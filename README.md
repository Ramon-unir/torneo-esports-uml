# Sistema de Gestión de Torneos de eSports
## Autor
Ramón Alarcón Fernandez
https://github.com/Ramon-unir
## Descripción del Proyecto
https://github.com/Ramon-unir/torneo-esports-uml
Este proyecto implementa un sistema de gestión de torneos de eSports
utilizando UML para el modelado y Java para la implementación.

Los actores que participan  son administradores jugador y sistema
y se estructura de manera en la que hay una parte para la Gestion de Equipos y jugadores en la que 
se pueden desde completar los perfiles de los jugadores y unirlos a equipos hasta expulsarlos de estos mismos.
en cuanto a los torneos son gestionados por los administradores y el sistema y en esta parte el torneo es quien gestiona desde 
la creacion hasta la creacion de los emparejamientos y partidas , la clasificacion de la competicion y por consiguiente la asignacion de premios.

En cuanto a los equipos  podran mostrar la lista de jugadores y los equipos por medio de listas y añadir/eliminar jugadores.
los jugadores pueden gestionar su perfil a traves de los getter y setters.

Para los torneos desde Crear un torneo hasta listar los equipos participantes
generar los emparejamientos actualizar la clasificacion y asignar premio al vencedor.

## Diagramas UML

### Diagrama de Casos de Uso
![Diagrama de casos de uso](diagrams/casos-uso.png)
Casos de uso de Gestion de Equipos y Jugadores por parte de los equipos
![imagen](https://github.com/user-attachments/assets/89986b7c-47b2-410a-b5fb-3ba54006d271)
Casos de uso de Gestion de Equipos y Jugadores por parte del Jugador
![imagen](https://github.com/user-attachments/assets/45eb5ba4-7cf3-443f-b379-0a68b713b702)
Caso de uso de Gestion de Torneos
![imagen](https://github.com/user-attachments/assets/83f3b4ab-7bdc-4693-9542-75c316349f00)
Caso de uso de GEstion de PArtidas y Resultados
![imagen](https://github.com/user-attachments/assets/4dc697fd-aa63-453c-8d5e-55d250aabd57)

### Diagrama de Clases

![Diagrama de clases](diagrams/clases.png)
Diagrama de clases de Equipo y Jugador
![imagen](https://github.com/user-attachments/assets/f8d59e1b-ad45-45b0-b6d1-79015a2a50b8)
Diagrama de clases de Torneo
![imagen](https://github.com/user-attachments/assets/2cfe4baf-159d-40df-9aa9-5d6e8e60a2d9)

## Estructura del Proyecto
torneo-esports-uml/ ├── src/
│ ├── es/empresa/torneo/
│ │ ├── modelo/
│ │ ├── control/
│ │ ├── vista/
│ │ ├── Main.java
├── diagrams/
│ ├── casos-uso.png
│ ├── clases.png
├── README.md
├── .gitignore
├── LICENSE (opcional)
## Instalación y Ejecución
1. Clonar el repositorio:
git clone git@github.com:Ramon-unir/torneo-esports-uml.git
2. Compilar y ejecutar el proyecto:
`cd src javac es/empresa/torneo/Main.java java es.empresa.torneo.Main`
## Justificación del diseño
Por qué se eligió esa estructura y cómo se organizan las clases.
La estructura la elegi en base a mi experiencia personal como jugador , ya que como jugador no te permite muchas mas acciones sino es mas bien a traves del equipo , el que registra y envia peticiones para unir participantes y se inscribe a los torneos ,
en cuanto a los torneos se crean y son estos los que generan el arbol de emparejamientos y tras este las partidas y la clasificacion dejando esta dependencia una linea muy directa a lo que es el premio
## Conclusiones
Sobre el aprendizaje obtenido.
Es un aprendizaje muy completo no solo te enseña como ver desde distintas perspectivas un mismo proyecto sino que tambien te ayuda a pulir su diseño , para mi es lo equivalente ha hacer un croquis y un esquema antes de empezar un proyecto
pocas palabras un dibujo muy concreto te ayudan a ver en todo momento los puntos de vista y requerimientos que pueden tener el proyecto.
