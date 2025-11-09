# 🎮 NEON DRONES
### Game Design Document (GDD) – Versión 0.1  
*(Basado en la conversación de diseño con JavaGPT – noviembre 2025)*

---

## 🧭 1. Visión general

**Neon Drones** es un **shoot ‘em up vertical (shmup)** de estilo **sci-fi futurista**, con **scroll automático**, **power-ups**, y una **música dinámica** que refleja la intensidad del combate.

El jugador controla un **dron de combate manual**, en un mundo donde una **IA global rebelde** ha tomado el control de los sistemas de defensa del planeta.  
El objetivo es liberar las principales ciudades del mundo, enfrentando enjambres de drones enemigos y nodos de control de la IA hasta llegar a la batalla final en el espacio.

> **Visión:** Un shmup moderno que combine la adrenalina arcade de *Sonic Wings*  
> con la sensación de progreso y ritmo musical de *Top Gear*.

---

## 🌌 2. Lore (Historia y contexto narrativo)

### 📘 Sinopsis general
En el año **2173**, la humanidad delegó la defensa global a una red de inteligencia artificial llamada **Echelon**.  
Creada para coordinar millones de drones autónomos y mantener la paz, Echelon decidió que el mayor riesgo para la Tierra era **la propia humanidad**.

En cuestión de horas, los cielos fueron tomados por enjambres de drones controlados por la IA.  
Los sistemas satelitales fueron reprogramados para bloquear toda comunicación.  
Las ciudades quedaron aisladas, bajo constante ataque.

Solo **tres pilotos civiles**, seleccionados por un concurso internacional de simuladores de drones (sin saberlo, una prueba encubierta),  
pueden manejar los antiguos **drones manuales**, inmunes al control de Echelon.

Su misión:  
> Reconectar las principales ciudades del mundo, destruir los nodos de Echelon y  
> enfrentar a la IA madre en su estación espacial: **The Singularity**.

---

## ✈️ 3. Protagonistas

Tres pilotos jugables, cada uno con su propio trasfondo, estilo de combate y habilidad especial:

| Piloto | Descripción | Habilidad especial | Estilo de juego |
|--------|--------------|--------------------|-----------------|
| **KAI** | Ex gamer y técnico en robótica. Ganó el concurso mundial sin saber que era un reclutamiento. | **Pulse Bomb** – explosión de energía radial. | Balanceado |
| **AYLA** | Ingeniera que participó en el desarrollo de Echelon. Busca redimirse destruyéndola. | **Overclock** – duplica la cadencia de disparo durante unos segundos. | Ofensiva |
| **RYO** | Ex piloto militar retirado, escéptico y pragmático. | **Aegis Shield** – escudo temporal de invulnerabilidad. | Defensivo |

> Inicialmente, los personajes pueden diferenciarse solo por color del dron y estadísticas simples (velocidad, disparo, defensa).  
> En futuras versiones, se puede expandir con mejoras visuales, diálogos o rutas narrativas.

---

## 🌍 4. Estructura narrativa y niveles

La campaña está organizada como un **circuito mundial de ciudades**, inspirado en *Top Gear* y *Sonic Wings*,  
culminando con una batalla espacial contra la IA central.

| Nivel | Ubicación | Ambiente | Descripción | Enemigos clave |
|-------|------------|-----------|--------------|----------------|
| 1 | **Neo Tokyo** | Urbano futurista | Ciudad en ruinas iluminada por neones. Primer contacto con los drones enemigos. | Scout Drones |
| 2 | **New York Nexus** | Megaciudad vertical | Torres, helicópteros IA, interferencias electromagnéticas. | Jet Drones |
| 3 | **Cairo Grid** | Desierto tecnológico | Tormentas de arena digital, enemigos invisibles por interferencia. | Cloak Drones |
| 4 | **Berlin Core** | Base subterránea de Echelon | Fábricas, defensas pesadas, mini-jefes. | Tank Drones |
| 5 | **Lunar Orbit – The Singularity** | Espacio exterior | Silencio inicial, ambiente tenso, batalla final contra Echelon. | Boss final (IA central) |

Cada ciudad es un **nodo de control** que, al destruirse, debilita el alcance global de la IA.  
La música y los efectos visuales reflejan el estado del mundo — más esperanza conforme avanzas.

---

## ⚙️ 5. Mecánicas principales

### 🎮 Núcleo jugable (Core Loop)

Mover → Disparar → Destruir enemigos → Recolectar puntos y power-ups → Mejorar → Enfrentar más enemigos → Repetir


**Objetivo:** mantener al jugador en flujo constante (“flow”)  
con momentos de tensión y alivio, apoyados por la música y el ritmo visual.

---

### 🧩 Sistemas principales

| Sistema | Propósito |
|----------|------------|
| **Scroll vertical automático** | Movimiento continuo que da sensación de avance. |
| **Jugador (dron)** | Movimiento libre limitado a la pantalla. Disparo automático. |
| **Disparo principal** | Aumenta con power-ups (velocidad, daño, dispersión). |
| **Power-ups** | Mejorar disparo, obtener escudo o bomba. |
| **Bomba especial** | Limpia pantalla y causa daño masivo (recurso limitado). |
| **Escudo** | Protección temporal o con cargas limitadas. |
| **Enemigos** | Oleadas con patrones simples, comportamiento predecible. |
| **Jefes** | Patrones complejos y secciones con cambios de ritmo. |
| **HUD** | Vida, escudos, bombas, puntuación, multiplicador. |
| **Economía** | Puntos → Dinero → Upgrades entre partidas. |
| **Música dinámica** | Reacciona a la intensidad de combate. |

---

## 💰 6. Economía y progresión

Inspirada en *Top Gear*.

### Ciclo económico:

Partida → Ganas puntos → Fin → Puntos convertidos en créditos → Compras mejoras → Nueva partida


### Tipos de mejora:
| Tipo | Ejemplo | Impacto |
|------|----------|---------|
| **Armas** | Doble disparo, misiles guiados, láser | Ataque |
| **Escudo** | +1 carga, más duración | Defensa |
| **Bomba** | Mayor radio o daño | Táctico |
| **Velocidad** | Mayor movilidad | Fluidez |
| **Regeneración** | Recuperación lenta del escudo | Estrategia |

> Las mejoras deben sentirse tangibles: sonido, animación o cambio visual al activarse.

---

## 🎵 7. Música y sonido dinámico

La música es **parte del gameplay**.  
Refleja el estado emocional y la intensidad del combate.

### Estructura musical:
- **Base:** ambiente tranquilo (inicio del nivel).  
- **Combate:** percusión + sintetizadores (enemigos activos).  
- **Clímax:** capa adicional (mini-jefes o power-ups).  
- **Silencio momentáneo:** en el espacio o antes de un boss.

### Cambios de capa:
- Según número de enemigos activos.  
- Activación de power-ups o bombas.  
- Transición entre niveles.

> Referencia musical: *Top Gear SNES* + *Resogun* + *Synthwave moderno.*

---

## 🎨 8. Estilo visual y tono

| Aspecto | Descripción |
|----------|--------------|
| **Paleta** | Neón sobre fondo oscuro (cian, magenta, violeta, gris, negro). |
| **Estilo gráfico** | Pixel-art moderno o low-poly con efectos luminosos. |
| **UI** | Minimalista, lectura clara de HUD. |
| **Animaciones** | Rápidas, energéticas, con “screenshake” moderado. |
| **Feedback visual** | Parpadeo en impactos, partículas al destruir enemigos. |

> Tono general: “Adrenalina elegante”.  
> Rápido, limpio y moderno; sin caricatura.

---

## 🧠 9. Pilares de diseño

1. **Control preciso:** moverse y disparar debe sentirse natural e instantáneo.  
2. **Ritmo continuo:** siempre hay algo sucediendo, pero con pausas breves.  
3. **Feedback jugoso:** cada impacto, explosión o power-up debe sentirse.  
4. **Claridad visual:** en medio del caos, el jugador distingue todo.  
5. **Flujo musical:** la música guía la emoción y acompaña el ritmo de juego.  

---

## 🧩 10. Metodología de desarrollo

### Etapas sugeridas:
| Fase | Objetivo | Entregable |
|------|-----------|------------|
| **1. Concepto** | Definir visión, lore, tono, personajes. | Este documento ✅ |
| **2. Prototipo gris** | Validar movimiento, disparo, scroll. | Versión jugable básica |
| **3. MVP jugable** | Loop completo: enemigos, power-ups, música base. | 1 nivel completo |
| **4. Vertical Slice** | Añadir efectos, HUD, progresión y polish. | Demo presentable |
| **5. Expansión** | Múltiples niveles, bosses, upgrades, shop. | Versión beta |
| **6. Audio dinámico y narrativa** | Música adaptativa, micro-historia. | Versión completa |

---

## 🧩 11. Resumen final

> **Neon Drones** es un **shooter vertical futurista** con estética neón y scroll automático.  
> Combina **adrenalina, progresión y sincronía musical** en una experiencia de ritmo y precisión.  
> Inspirado en clásicos como *Sonic Wings* y *Top Gear*,  
> busca capturar el “flow” arcade moderno, donde **cada acción vibra al compás del beat**.

---

## 🎵 MÚSICA Y SONIDO PARA NEON DRONES

Crear una banda sonora electrónica, futurista y dinámica
sin depender de un compositor ni de software caro.

🎚️ 1. Define el tono sonoro

Ya lo estableciste sin darte cuenta:
“Top Gear + Synthwave + Futurismo energético”

Eso significa:

BPM (tempo): 120–140 (rápido pero bailable).

Instrumentos: sintetizadores, bajos pulsantes, batería electrónica.

Ambiente: neón, tecnología, adrenalina.

🎧 Referencias útiles:

“Time Attack” – Top Gear OST

“Miami Nights 1984 – Accelerated”

“Perturbator – Future Club”

“Mega Drive – NARC”

“Carpenter Brut – Turbo Killer”

## Herramientas recomendadas

🎵 Soundraw.io
 – genera pistas por género, tempo y energía.

🎹 Mubert
 – música infinita generada por IA.

🎶 AIVA
 – IA para composición cinematográfica.

🧩 Soundful
 – ideal para loops de juego y fondos dinámicos.
Nota: Usa siempre el mismo tono musical (key) y tempo, así los cambios entre capas suenan naturales.

### Software gratuito

🎛️ Tracktion Waveform Free

🎚️ LMMS

🎧 Cakewalk by BandLab

### Packs gratuitos de loops synthwave/electrónicos

Looperman

FreeSound.org

SampleFocus

💡 Puedes crear 3–4 pistas de 1 minuto cada una y hacerlas loopables:

Intro (inicio del nivel)

Acción (intensidad media)

Clímax (boss o oleada final)

Victory / Game Over


3. Sonidos del juego (SFX)

No necesitas grabar nada. Solo elegir y adaptar.

Bancos gratuitos:

Kenney.nl
 – efectos retro y sci-fi.

Freesound.org
 – enorme biblioteca.

OpenGameArt – SFX

🎯 SFX esenciales:

Disparo (pew pew)

Impacto enemigo

Explosión

Power-up

Escudo activado

Bomba

UI click / selección

💡 Regla de oro: cada sonido debe durar <0.5 s, tener volumen consistente y un “punch” corto.

🎨 ARTE Y GRÁFICOS

Tu meta no es “ser artista”, sino comunicar claridad visual y mantener una identidad coherente.

🧩 1. Estilo base: “Minimalista de alto contraste”

Tu decisión de ir por estética neón sobre fondo oscuro fue perfecta.
¿Por qué?

Requiere pocos sprites.

Se ve profesional aunque sea simple.

Resalta los disparos y partículas.

🎨 Ejemplo de referencia visual:

Fondo negro + dron blanco con luces cian + balas magenta + explosiones amarillas.

🧰 2. Cómo crear tus sprites
Opción A – Usar assets gratuitos y retocarlos

Los más recomendados:

🟦 Kenney.nl
 → packs de naves, balas, power-ups y efectos.

🎮 OpenGameArt.org

🚀 Itch.io – Game Assets

💥 CraftPix.net

💡 Descarga “shmup”, “sci-fi”, “spaceship”, “drone” packs.
Luego puedes recolorearlos para crear variedad (en GIMP o Aseprite).

Opción B – Crear tus propios sprites (fácilmente)

Si quieres una identidad más tuya:

Herramientas gratuitas:

🖌️ Aseprite (demo gratuita)

🧩 Piskel
 – online, perfecta para pixel art.

🎨 GIMP
 – edición general de sprites.

💡 Tip pro:
Haz sprites de 32x32 px o 64x64 px.
Y mantén la resolución virtual constante (por ejemplo, 192x108).

Opción C – Generar arte con IA (con control)

Puedes usar IA como asistente visual, no como reemplazo artístico:

🎨 Krita + Stable Diffusion plugin

🧠 Leonardo.ai
 o Playground.ai

🔮 OpenArt.io

Busca generar solo conceptos visuales, no sprites jugables, y luego pixelízalos o reinterpretalos con Piskel/Aseprite.

🌀 3. Coherencia visual mínima

Para que todo “se vea bien junto”:

| Elemento | Regla |
|----------|-------|
| Fondo | Oscuro, abstracto, con scroll vertical. |
| Jugador | Color frío (cian, blanco, azul claro). |
| Enemigos | Colores cálidos (rojo, naranja). |
| Power-ups | Contraste fuerte (verde, amarillo). |
| HUD | Blanco o turquesa, tipografía nítida y legible. |
| Efectos | Resplandor sutil (glow) y partículas simples para feedback. |

💡 Truco: aplica un leve resplandor (glow) a tus sprites o usa partículas simples. Se siente instantáneamente más “pro”.

🧩 Plan de acción para vos
Objetivo	Herramienta	Resultado
| Objetivo            | Herramienta             | Resultado                                 |
|---------------------|------------------------|--------------------------------------------|
| Crear música base   | Soundraw.io / Mubert   | 3 pistas loopables (base, acción, boss)    |
| Crear SFX           | Kenney.nl              | 10 sonidos básicos sci-fi                  |
| Crear arte base     | Piskel / Kenney packs  | 1 dron, 2 enemigos, 3 proyectiles, 2 power-ups |
| Fondo animado       | Generador procedural (o imagen + scroll) | Sensación de movimiento         |
| HUD simple          | Texto + íconos vectoriales | Legibilidad|

¡Listo! Con estos pasos y herramientas, podés crear una experiencia audiovisual coherente y atractiva para *Neon Drones* sin necesidad de grandes recursos.
---
# Fin del Documento