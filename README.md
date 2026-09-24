## 1. Repositorio base para el curso 2026-2027 
Se proporciona un repositorio plantilla que ya tiene la estructura **Maven** y el `pom.xml` configurado con todas las dependencias necesarias (JAXB, Gson, JUnit 5). 

---

## 2. Crear tu repositorio desde la plantilla

1. Accede al repositorio base del profesor en GitHub: [https://github.com/juangarcia317/repojava2627](https://github.com/juangarcia317/repojava2627). 
2. Pulsa el botón verde **Use this template** → **Create a new repository**. 
3. Ponle de nombre: `repojava2627`. 
4. Márcalo como **privado (Private)**. ⚠️ ***muy importante***
5. Pulsa **Create repository**. 
6. Comparte con el profesor en la URL: [Enlace de entrega](https://educa2madrid-my.sharepoint.com/:x:/g/personal/juan_garcia317_educa_madrid_org/IQCd9rqaiZ6VTKbbjpd62LBdAXYzAc0t1Ph0oalQfQeoPyU?e=5Wzkxr)

---

## 3. Clonar tu repositorio en local
Abre **Git Bash** en Spring Tool Suite o en Eclipse (`Window` → `Show View` → `Terminal`) y ejecuta:


`cd C:\Programas\sts`

`git clone https://USUARIO:TOKEN@github.com/USUARIO/repojava2627`

> **Nota:** Recuerca añadir tu token personal para poder hacer commit a tu repositorio.

> **Nota:** Recuerda la ruta donde has hecho el `clone` para importar esa carpeta en Eclipse/STS.

---

## 4. Importar en Spring Tool Suite

1. **File** → **Import** → **Maven** → **Existing Maven Projects** → **Next**.
2. En **Root Directory** pulsa **Browse** y selecciona la carpeta `repojava2627`.
3. Eclipse detecta el `pom.xml` — marca el checkbox → **Finish**.
4. Espera a que Maven descargue las dependencias.
5. Clic derecho en el proyecto → **Maven** → **Update Project** → **OK**.
6. **NO Cerrar**.


### Estructura de carpetas:

* **repojava2627** [repojava2627 main]
    * 📁 **src/main/java**        
    * 📁 **src/main/resources**
---

## 5. Comandos git

**Resumen de flujo para tu commit:**

1. `git status` (revisas qué hay).
2. `git add .`
3. `git status` (verificas que estén en verde).
4. `git commit -m "tu mensaje"` (confirmas los cambios).
5. `git push`
