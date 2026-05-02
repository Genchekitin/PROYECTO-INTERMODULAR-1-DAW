#  Bit-Love - Portal Web de Videojuegos Retro


## ¿Qué es este proyecto?

**Bit-Love** es un portal web corporativo para una tienda ficticia de videojuegos retro ubicada en Salamanca. El proyecto simula un escenario profesional real donde la empresa necesita presencia online para:

- Mostrar su catálogo de productos (videojuegos clásicos)
- Dar a conocer su historia y valores
- Facilitar el contacto con clientes potenciales
- Resolver dudas frecuentes sobre productos y servicios

El lema "*Tu relación afectiva más sana*" refleja la pasión por los videojuegos clásicos y la nostalgia que generan en coleccionistas y amantes del retro gaming.

---

## ¿Qué problema resuelve?

Este portal web da solución a las siguientes necesidades de negocio:

1. **Visibilidad online** - La tienda física necesita presencia digital para llegar a más clientes
2. **Catálogo accesible** - Mostrar productos destacados sin necesidad de visitar la tienda
3. **Atención al cliente** - Responder preguntas frecuentes y facilitar contacto directo
4. **Branding** - Comunicar la identidad y valores de la marca

---

##  Tecnologías utilizadas

- **HTML5** - Estructura semántica del contenido
- **CSS3** - Diseño visual y maquetación
  - Variables CSS (`--color-principal`, `--bordes`, etc.)
  - Flexbox y Grid para layouts
  - Transiciones y efectos hover
- **Google Fonts** - Tipografía "Press Start 2P" (estilo retro gaming)
- **GitHub Pages** - Hosting del proyecto

---

## Estructura del proyecto

El proyecto está organizado de la siguiente manera:

- **index.html** - Página principal con los videojuegos destacados
- **contacto.html** - Formulario de contacto
- **FAQ.html** - Preguntas frecuentes
- **quienesSomos.html** - Información sobre la empresa
- **Categorias.html** - Catálogo de productos (en desarrollo)
- **styles.css** - Hoja de estilos principal
- **ASSETS/** - Carpeta con todas las imágenes (logos, productos, fondo)

---

##  Instrucciones de visualización

### Opción 1: GitHub Pages
Visita el enlace: https://genchekitin.github.io/PROYECTO-INTERMODULAR-1-DAW/

### Opción 2: Local
1. Clona el repositorio:
   ```bash
   git clone https://github.com/Genchekitin/PROYECTO-INTERMODULAR-1-DAW.git
   ```
2. Abre `index.html` en tu navegador

---

##  Páginas del portal web

El portal incluye las siguientes secciones (requisito mínimo: Home + 3 páginas):

### 1. **index.html** - Página de inicio
- **Contenido:** Videojuegos más demandados (6 productos destacados)
- **Características:** Grid de tarjetas con imágenes, títulos y precios
- **Llamada a acción:** Botón "Ver categorías"
- **Diseño:** Fondo parallax con imagen de Resident Evil

### 2. **contacto.html** - Formulario de contacto
- **Contenido:** Formulario completo con validación HTML5
- **Campos:** Nombre (required), Teléfono (opcional), Email (required), Motivo (required), Mensaje (required)
- **Características:** Todos los campos con atributo `name`, botones Enviar/Borrar
- **Diseño:** Formulario semi-transparente sobre fondo parallax

### 3. **FAQ.html** - Preguntas frecuentes
- **Contenido:** 16 preguntas organizadas por categorías
- **Categorías:** Compras, Envíos, Devoluciones, Stock, Consolas, Otros
- **Características:** Uso de `<details>` y `<summary>` (acordeón nativo HTML5)
- **Diseño:** Contenedor semi-transparente con efectos hover

### 4. **quienesSomos.html** - Sobre nosotros
- **Contenido:** Historia de la empresa, valores, catálogo, ubicación
- **Características:** Tipografía clara, lista de valores con hover effects
- **Llamada a acción:** Botón hacia página de contacto
- **Diseño:** Contenedor semi-transparente con líneas separadoras

### 5. **Categorias.html** - Catálogo *(en desarrollo)*
- **Contenido:** Videojuegos organizados por plataforma/categoría
- **Estado:** Pendiente de completar

---


##  Decisiones de diseño

### Paleta de colores
- **Principal:** `#2B282B` (gris oscuro)
- **Secundario:** `#000000` (negro)
- **Acento 1:** `rgba(188, 65, 184)` (morado) - para efectos hover y sombras
- **Acento 2:** `rgb(115, 188, 7)` (verde) - para botón "Enviar"

### Tipografía
- **Títulos:** "Press Start 2P" (Google Fonts) - estilo pixel art retro
- **Texto:** Arial, Helvetica, sans-serif - legibilidad

### Efectos visuales
- **Fondo parallax:** Imagen de Resident Evil con `background-attachment: fixed`
- **Contenedores semi-transparentes:** `rgba(43, 40, 43, 0.92)` con `backdrop-filter: blur(10px)`
- **Transiciones:** `transition: 0.3s` en hover effects
- **Sombras:** Variables CSS para consistencia visual

---


##  Mejoras futuras

- [ ] Completar página de Categorías con grid de productos
- [ ] Implementar sistema de filtrado por consola/género
- [ ] Integrar con backend (módulo de Programación)

---

##  Información de contacto (empresa ficticia)

**Email:** BitLove@info.es  
**Teléfono:** +34 982 94 32 11  
**Ubicación:** Salamanca, España  

**Redes sociales:**
- Instagram
- Discord
- Twitch
- TikTok

---

##  Licencia y uso

Este proyecto es de carácter **exclusivamente educativo** y fue desarrollado como parte del Proyecto Intermodular del ciclo formativo de Desarrollo de Aplicaciones Web (DAW) - 1º curso.

No se permite su uso comercial. Las imágenes utilizadas (Resident Evil, carátulas de videojuegos) son propiedad de sus respectivos dueños y se usan únicamente con fines didácticos.

---

##  Agradecimientos

- A Francisco Molpeceres (Molpe) - Tutor de Lenguajes de Marcas
- A los profesores del módulo por su guía
- A la comunidad de retro gaming que inspira este proyecto

---


