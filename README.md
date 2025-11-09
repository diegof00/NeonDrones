# NeonDrones

A [libGDX](https://libgdx.com/) project generated with [gdx-liftoff](https://github.com/libgdx/gdx-liftoff).

**Neon Drones** is a vertical shoot ’em up prototype built with **LibGDX**, inspired by classic arcade titles such as *Sonic Wings* and *Raiden*.  
The goal of the project is to create a modern, fast-feeling sci-fi shooter with clean mechanics, reactive controls, and a professional gameplay loop.

## Platforms

- `core`: Main module with the application logic shared by all platforms.
- `lwjgl3`: Primary desktop platform using LWJGL3; was called 'desktop' in older docs.

## Gradle

This project uses [Gradle](https://gradle.org/) to manage dependencies.
The Gradle wrapper was included, so you can run Gradle tasks using `gradlew.bat` or `./gradlew` commands.
Useful Gradle tasks and flags:

- `--continue`: when using this flag, errors will not stop the tasks from running.
- `--daemon`: thanks to this flag, Gradle daemon will be used to run chosen tasks.
- `--offline`: when using this flag, cached dependency archives will be used.
- `--refresh-dependencies`: this flag forces validation of all dependencies. Useful for snapshot versions.
- `build`: builds sources and archives of every project.
- `cleanEclipse`: removes Eclipse project data.
- `cleanIdea`: removes IntelliJ project data.
- `clean`: removes `build` folders, which store compiled classes and built archives.
- `eclipse`: generates Eclipse project data.
- `idea`: generates IntelliJ project data.
- `lwjgl3:jar`: builds application's runnable jar, which can be found at `lwjgl3/build/libs`.
- `lwjgl3:run`: starts the application.
- `test`: runs unit tests (if any).

Note that most tasks that are not specific to a single project can be run with `name:` prefix, where the `name` should be replaced with the ID of a specific project.
For example, `core:clean` removes `build` folder only from the `core` project.

---

## 🎮 Current Features
- **Smooth vertical scrolling** with parallax backgrounds
- **Responsive player controls** and fluid movement feel
- **Continuous shooting system** with tunable fire rate
- **Pixel-perfect rendering** using LibGDX `FitViewport`
- Clean project architecture (`Game`, `Screens`, `World`, `Gameplay` packages)

---

## 🚧 Roadmap
- [x] Core prototype (scroll, player, bullets)
- [ ] Enemy spawner system
- [ ] Collision detection and score handling
- [ ] Dynamic music system
- [ ] Upgrades, shields, and power-ups
- [ ] Polished visuals and sound design

---

## 🛠️ Tech Stack
- **Language:** Java 17+
- **Framework:** [LibGDX](https://libgdx.com/)
- **Build Tool:** Gradle
- **Target Platforms:** Desktop (LWJGL3), Android (future)

---

## 💡 Vision
> A single-developer journey to build a professional-feeling 2D shooter —  
> blending classic arcade energy with modern visual depth and musical atmosphere.

---

## 📸 Preview
*(coming soon)*

---

## 📜 License
This project is currently in early development.  
Code is open for learning and experimentation purposes.
