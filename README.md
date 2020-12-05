# TimeLimit LABORATORIOS 
## Información General 
* **Periodo Académico:** 2020-2
* **Curso:** Ciclos de Vida y Desarrollo de Software 
* **Integrantes**: Lina Buitrago, Santiago Laiton, Sebastian Villamarin y Daniel Varón.
* **Profesor**: Julián Velasco 
## Roles 👥
 * **Julian Velasco** - *Product Owner* 
 * **Santiago Laiton** - *Developer* - [santiagolaiton2700](https://github.com/santiagolaiton2700)
 * **Lina Buitrago** - *Scrum Master* - [lina-6020](https://github.com/lina-6020)
 * **Sebastian Villamarin** - *Developer* - [svillamarin27](https://github.com/svillamarin27)
  * **Daniel Varon** - *Developer* - [Daniel1Varon](https://github.com/Daniel1Varon)
## Descripción del proyecto 📑
### Descripción General 
TimeLimit Laboratorios es un aplicativo web diseñado para que el personal perteneciente a la decanatura de Ingeniería de Sistemas de la Escuela Colombiana de Ingeniería Julio Garavito, pueden registrar los laboratorio, equipos y elementos de cada equipo, junto con las novedades que se realizan a cada uno de estos. La herramienta busca mantener a todo el personal informado sobre las novedades que se presentan en los laboratorios. 
### Manual de Usuario 

Al ingresar al aplicativo en primer lugar estará la ventana del _"Login"_ a la cual solo tienen acceso el personal del laboratorio y pueden ingresar con los datos de registros suministrados

![image](https://user-images.githubusercontent.com/59893804/101206236-dbe3a900-363c-11eb-925e-7d09964a81a4.png)

Después de un login exitoso nos encontramos con 4 elementos principales: elementos , equipos , novedades y laboratorios 
![image](https://user-images.githubusercontent.com/59893804/101206335-fd449500-363c-11eb-9545-6235d9195399.png)

#### Equipos
Donde tendremos funcionalidades como:
* Consultar todos los equipos
* Agregar equipo
* Asociar elementos a un equipo especifico
* Generar un reporte de equipos
* Consultar todas las novedades del equipo 

![image](https://user-images.githubusercontent.com/59893804/101207325-74c6f400-363e-11eb-9807-e61e1f62432a.png)

#### Elementos
Donde tendremos funcionalidades como:
* Consultar todos los elementos
* Agregar elementos
* Dar de baja a uno o varios elementos
* Generar un reporte de elementos
* Consultar todas las novedades del elemento 

![image](https://user-images.githubusercontent.com/59893804/101206416-177e7300-363d-11eb-858e-3d4d0a3a1932.png)

#### Novedades
Donde tendremos funcionalidades como:
* Consultar todas las novedades
* Agregar nuevas novedades
* Generar un reporte de novedades

![image](https://user-images.githubusercontent.com/59893804/101207417-9aec9400-363e-11eb-9b7e-16d1f76cfbcd.png)

#### Laboratorios
Donde tendremos funcionalidades como:
* Consultar todos los laboratorios
* Agregar laboratorios
* Generar un reporte de laboratorios
* Observar estadísticas de laboratorios 
* Consultar todas las novedades del laboratorio

![image](https://user-images.githubusercontent.com/59893804/101207463-a93ab000-363e-11eb-8463-5429a2c84e33.png)

### Funcionalidades importantes 

El personal podrá:

**Agregar**

![image](https://user-images.githubusercontent.com/59893804/101232270-bf686080-367e-11eb-8529-61867f913beb.png)

El personal puede agregar nuevas novedades, equipos, elementos y laboratorios. La función de agregar es muy sencilla, simplemente se llenarán los campos del formulario y se seleccionarán las opciones adecuadas del mismo.
La única variación existe cuando creamos un nuevo equipo ya que este como requisito debe contar con sus 4 elementos que lo componen, para ello haremos los siguientes pasos:

1. Iremos a elementos y agregaremos 4 elementos de diferentes tipos (si no hay elementos disponibles para asociar) es decir "teclado”, "monitor", "mouse" y "CPU".
2. Después de esto iremos a "equipos”, llenaremos los campos y seleccionaremos casillas; podemos o no seleccionar un laboratorio al que queremos que pertenezca cierto equipo, pero obligatoriamente tenemos que elegir los 4 elementos que se asociaran a el equipo.
3. Después de esto se podrá agregar exitosamente.

**Consultar** 

![image](https://user-images.githubusercontent.com/59893804/101232279-cf804000-367e-11eb-913c-90ee3fbbf191.png)

La función consultar también es muy sencilla, simplemente iremos al ítem que queremos consultar y oprimimos el botón "consultar", después de esto veremos en pantalla toda la información de todos los atributos del ítem.

**Asociar** 

![image](https://user-images.githubusercontent.com/59893804/101232298-ed4da500-367e-11eb-9d71-395494dfe7ed.png)

La función de asociar está dada solo para dos ítems:
* Asociar un elemento a un equipo 
* Asociar un equipo a un laboratorio 
Asociar un equipo a un laboratorio ya lo explicamos ya que se hace cuando se agrega un nuevo equipo; para asociar un elemento:
1. Iremos al ítem "equipos" 
2. Luego seleccionaremos "asociar elemento" 
3. Allí seleccionaremos el equipo al que le queremos asociar un elemento 
4. Elegiremos el elemento a asociar y oprimimos filtrar, se mostrará en pantalla los elementos de ese tipo disponibles para asociar
5. Seleccionaremos el que se desee 
6. Por último le daremos "asociar" y el elemento quedara asociado con éxito

**Dar de baja**

![image](https://user-images.githubusercontent.com/59893804/101232450-90062380-367f-11eb-8740-4d990a541c04.png)

Para dar de baja a un elemento haremos lo siguiente:


1. Entraremos al ítem elemento 
2. Consultaremos todos los elementos
3. Seleccionaremos el elemento que queremos dar de baja 
4. Oprimimos "dar de baja"
5. Exitosamente el elemento ya no estará disponible pero aun podemos ver toda su información

**Generar reporte** 

![image](https://user-images.githubusercontent.com/59893804/101232469-bcba3b00-367f-11eb-948c-23bdd4a7f808.png)
![image](https://user-images.githubusercontent.com/59893804/101232629-a52f8200-3680-11eb-8bc6-85916e5c272e.png)


Podemos generar reportes para equipos, laboratorios y elementos; para ello:

1. Iremos al ítem al cual queremos generarle un reporte 
2. Consultaremos todos los ítems 
3. allí oprimiremos el botón de Excel
4. Automáticamente se generará un archivo .xls con el reporte de ese ítem

## Arquitectura y Diseño detallado 🛠️📐
### Modelo E-R
![image](https://user-images.githubusercontent.com/59893804/101231110-0b170c00-3677-11eb-9793-fe1a2c71fcda.png)
### Diagrama de clases
### Tecnologías utilizadas
Se utilizaron diferentes tecnologías a lo largo del desarrollo del proyecto como:
* **PrimeFaces (FRONT):** Fue la biblioteca de componentes que se utilizó para el front del aplicativo , tiene componentes agradables a la vista que son innovadores en cuanto a diseño lo que mejora la experiencia de navegación en el aplicativo.
* **Guice (BACK):** En cuanto a framework de inyección de dependencias utilizamos Google Guice el cual podía usarse para aplicaciones hechas en java (el lenguaje oficial de nuestro proyecto).
* **PostgreSQL (BASE DE DATOS):** Este fue el servidor de base de datos relacional que utilizamos para el manejo de la base de datos del aplicativo; incluye características de la orientación a objetos como herencias , tipos de datos , funciones , restricciones y reglas de integridad características muy útiles para el desarrollo de nuestro proyecto.

### _Despliegue en HEROKU_ 📦
[![Deployed to Heroku](https://www.herokucdn.com/deploy/button.png)](https://protectotimelimitcvds2020-2.herokuapp.com)



### _Integración continua en CircleCI_ ✅
[![CircleCI](https://circleci.com/gh/EquipoTimeLimitCvds/2020-2-PROYCVDS-TimeLimit.svg?style=svg)](https://circleci.com/gh/EquipoTimeLimitCvds/2020-2-PROYCVDS-TimeLimit)

## Descripción del proceso 📝
### Integrantes
 * Santiago Laiton - [santiagolaiton2700](https://github.com/santiagolaiton2700)
 * Lina Buitrago - [lina-6020](https://github.com/lina-6020)
 * Sebastian Villamarin - [svillamarin27](https://github.com/svillamarin27)
 * Daniel Varon - [Daniel1Varon](https://github.com/Daniel1Varon)
  
### Taiga 

En este enlace se evidencia el avance del proyecto durante los 3 sprints 
[Taiga](https://tree.taiga.io/project/santiagolaiton2700-historial-de-equipos-labinfo/timeline)

### Descripción de la Metodología y Release-Burndown Chart: 📈

#### Sprint1

Para este primer sprint escogimos 4 historias de usuario de las propuestas:
* Inicio de sesión 
* Registrar equipo 
* Registrar elemento
* Registrar novedad

Decidimos trabajar a par; una pareja en el back y una pareja en el front.Como era el primer sprint la estructura del proyecto nos tomó la mayoría del tiempo por lo que la única historia que se completó al 100% en el primer sprint fue la de "Iniciar sesión" , las otras tres se implementaron a un 80% , hizo falta algunos detalles y completar algunas subtareas. 

_**Burndown Chart**_

![image](https://user-images.githubusercontent.com/59893804/101218372-f758af00-3650-11eb-948b-c352a98d0eea.png)

_**Backlog**_

Estas fueron las subtareas propuestas

![image](https://user-images.githubusercontent.com/59893804/101221411-a39c9480-3655-11eb-9b81-bb5fb99c1aef.png)



#### Sprint2
Para este segundo sprint escogimos 3 historias de usuario de las propuestas y añadimos una destinada a las correcciones del primer sprint:

* Asociar elemento
* Dar de baja elemento 
* Crear laboratorio
* Correcciones sprint 1 

Seguimos trabajando con la misma metodología de trabajo (trabajar a par , una pareja en el back y una pareja en el front).Nos dimos cuenta que con la estructura montada y con el claro funcionamiento de nuestro aplicativo el segundo sprint fue más sencillo y las historias y subtareas se realizaron exitosamente a tiempo. Logramos hacer todas las historias de usuario propuestas y algunas correcciones. Para este sprint solo quedaron pendientes algunas correcciones del sprint1.

_**Burndown Chart**_

![image](https://user-images.githubusercontent.com/59893804/101218457-19eac800-3651-11eb-9609-a052520f1690.png)

_**Backlog**_

Estas fueron las subtareas propuestas

![image](https://user-images.githubusercontent.com/59893804/101221845-887e5480-3656-11eb-99d8-3e6661038ab5.png)


#### Sprint3 
Este último sprint fue el que nos llevó más trabajo ya que fuimos conscientes de que teníamos muchos detalles por ajustar aparte de las historias de usuario propuestas , las cuales fueron 6 en esta ocasión, al principio definimos solo 5 pero luego vimos que podíamos añadir una más incluyendo las correcciones del sprint anterior:

* Asociar equipo
* Reporte de equipos 
* Reporte de elementos
* Reporte de novedades
* Reporte histórico de novedades
* Correcciones sprint 2

Para este sprint cambiamos un poco la metodología, seguimos trabajando a par, pero nos dividimos las historias y subtareas equitativamente.

_**Burndown Chart**_

![image](https://user-images.githubusercontent.com/59893804/101218505-2d962e80-3651-11eb-92bd-f4069f0d3afd.png)

_**Backlog**_

Estas fueron las subtareas propuestas

![image](https://user-images.githubusercontent.com/59893804/101222671-42c28b80-3658-11eb-8f14-8d4560d9c1a2.png)

### Reporte de análisis estático de código con _Codacy_ 💻
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/d1dc276b7002496887af5332f37e3c7b)](https://www.codacy.com/gh/EquipoTimeLimitCvds/2020-2-PROYCVDS-TimeLimit/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=EquipoTimeLimitCvds/2020-2-PROYCVDS-TimeLimit&amp;utm_campaign=Badge_Grade)

