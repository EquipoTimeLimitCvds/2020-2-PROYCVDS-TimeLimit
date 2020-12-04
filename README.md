# TimeLimit LABORATORIOS 
## Información General 
* **Periodo Academico:** 2020-2
* **Curso:** Ciclos de Vida y Desarrollo de Software 
* **Integrantes**: Lina Buitrago,Santiago Laiton,Sebastian Villamarin y Daniel Varon
* **Profesor**: Julian Velasco 
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

Al ingresar al aplicativo en primer lugar estara la ventana del _"Login"_ a la cual solo tienen acceso el personal del laboratorio y pueden ingresar con los datos de registros suministrados

![image](https://user-images.githubusercontent.com/59893804/101206236-dbe3a900-363c-11eb-925e-7d09964a81a4.png)

Despues de un login exitoso nos encontramos con 4 elementos principales: elementos , equipos , novedades y laboratorios 
![image](https://user-images.githubusercontent.com/59893804/101206335-fd449500-363c-11eb-9545-6235d9195399.png)

#### Equipos
Donde tendremos funcionalidades como:
* Consultar todos los equipos
* Agregar equipo
* Asociar elementos a un equipo especifico
* Generar un reporte de equipos
* Consultar todas las novedades de el equipo 

![image](https://user-images.githubusercontent.com/59893804/101207325-74c6f400-363e-11eb-9807-e61e1f62432a.png)

#### Elementos
Donde tendremos funcionalidades como:
* Consultar todos los elementos
* Agregar elementos
* Dar de baja a uno o varios elementos
* Generar un reporte de elementos
* Consultar todas las novedades de el elemento 

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
* Observar estadisticas de laboratorios 
* Consultar todas las novedades de el laboratorio

![image](https://user-images.githubusercontent.com/59893804/101207463-a93ab000-363e-11eb-8463-5429a2c84e33.png)

### Funcionalidades importantes 

El personal podra:

**Agregar**

El personal puede agregar nuevas novedades , equipos , elementos y laboratorios. La función de agregar es muy sencilla , simplemente se llenaran los campos del formulario y se seleccionaran las opciones adecuadas del mismo.
La unica variacion existe cuando creamos un nuevo equipo ya que este como requisito debe contar con sus 4 elementos que lo componen , para ello haremos los siguiente pasos:

1. Iremos a elementos y agregaremos 4 elementos de diferentes tipos (si no hay elementos disponibles para asociar) es decir "teclado" , "monitor" , "mouse" y "CPU".
2. Despues de esto iremos a "equipos" , llenaremos los campos y seleccionaremos casillas; podemos o no seleccionar un laboratorio al que queremos que pertenezca cierto equipo , pero obligatoriamente tenemos que elegir los 4 elementos que se asociaran a el equipo.
3. Despues de esto se podra agregar exitosamente.

**Consultar** 

La función consultar tambien es muy sencilla , simplemente iremos al item que queremos consultar y oprimimos el boton "consultar" , despues de esto veremos en pantalla toda la informacion de todos los atributos del item.

**Asociar** 

La función de asociar esta dada solo para dos items:
* Asociar un elemento a un equipo 
* Asociar un equipo a un laboratorio 
Asociar un equipo a un laboratorio ya lo explicamos ya que se hace cuando se agrega un nuevo equipo;para asociar un elemento:
1. Iremos al item "equipos" ,
2. Luego seleccionaremos "asociar elemento" 
3. Alli seleccionaremos el equipo al que le queremos asociar un elemento 
4. Elegiremos el elemento a asociar y oprimimos filtrar, se mostrara en pantalla los elementos de ese tipo disponibles para asociar
5. Seleccionaremos el que se desee 
6. Por ultimo le daremos "asociar" y el elemento quedara asociado con exito.

**Dar de baja**

Para dar de baja a un elemento haremos lo siguiente:


1. Entraremos al item elemento 
2. Consultaremos todos los elementos
3. Seleccionaremos el elemento que queremos dar de baja 
4. Oprimimos "dar de baja"
5. Exitosamente el elemento ya no estara disponible pero aun podemos ver toda su informacion

**Generar reporte** 

Podemos generar reportes para equipos, laboratorios y elementos; para ello :

1. Iremos al item al  cual queremos generarle un reporte 
2. Consultaremos todos los items 
3. Alli oprimiremos el botón de excel
4. Automaticamente se generara un archivo .xls con el reporte de ese item

## Arquitectura y Diseño detallado 🛠️📐
### Modelo E-R
![image](https://user-images.githubusercontent.com/59893804/101204662-90300000-363a-11eb-95f1-e9a9179ea8cb.png)
### Diagrama de clases
### Descripción de la arquitectura 
### _Despliegue en HEROKU_ 📦
https://protectotimelimitcvds2020-2.herokuapp.com/
### _Integración continua en CircleCI_ ✅
[![CircleCI](https://circleci.com/gh/EquipoTimeLimitCvds/2020-2-PROYCVDS-TimeLimit.svg?style=svg)](https://circleci.com/gh/EquipoTimeLimitCvds/2020-2-PROYCVDS-TimeLimit)

## Descripción del proceso 📝
### Integrantes
 * Santiago Laiton - [santiagolaiton2700](https://github.com/santiagolaiton2700)
 * Lina Buitrago - [lina-6020](https://github.com/lina-6020)
 * Sebastian Villamarin - [svillamarin27](https://github.com/svillamarin27)
 * Daniel Varon - [Daniel1Varon](https://github.com/Daniel1Varon)
  
### Descripción de la Metodología
### Taiga 
En este enlace se evidencia el 
### Release-Burndown Chart: 📈
#### Sprint1

Para este primer sprint escogimos 4 historias de usuario de las propuestas:
* Inicio de sesión 
* Registrar equipo 
* Registrar elemento
* Registrar novedad

Decidimos trabajar a par;una pareja en el back y una pareja en el front.Como era el primer sprint la estructura del proyecto nos tomo la mayoria del tiempo por lo que la unica historia que se completo al 100% en el primer sprint fue la de "Iniciar sesión" , las otras tres se implementaron a un 80% , hizo falta algunos detalles y completar algunas subtareas. 

_Burndown Chart_
![image](https://user-images.githubusercontent.com/59893804/101218372-f758af00-3650-11eb-948b-c352a98d0eea.png)
_Backlog_

#### Sprint2
Para este segundo sprint escogimos 3 historias de usuario de las propuestas y añadimos una destinada a las correcciones del primer sprint:

* Asociar elemento
* Dar de baja elemento 
* Crear laboratorio
* Correcciones sprint 1 

Seguimos trabajando con la misma metodologia de trabajo ( trabajar a par , una pareja en el back y una pareja en el front).Nos dimos cuenta que con la estructura montada y con el claro funcionamiento de nuestro aplicativo el segundo sprint fue mas sencillo y las historias y subtareas se realizaron exitosamente a tiempo. Logramos hacer todas las historias de usuario propuestas y algunas correcciones. Para este sprint solo quedaron pendientes algunas correcciones del sprint1.

_Burndown Chart_
![image](https://user-images.githubusercontent.com/59893804/101218457-19eac800-3651-11eb-9609-a052520f1690.png)

_Backlog_

#### Sprint3 
Este ultimo sprint fue el que nos llevo mas trabajo ya que fuimos concientes de que teniamos muchos detalles por ajustar aparte de las historias de usuario propuestas , las cuales fueron 6 en esta ocasion , al principio definimos solo 5 pero luego vimos que podiamos añadir una mas incluyendo las correcciones del sprint anterior:

* Asociar equipo
* Reporte de equipos 
* Reporte de elementos
* Reporte de novedades
* Reporte historico de novedades
* Correcciones sprint 2

Para este sprint cambiamos un poco la metodologia , seguimos trabajando a par pero nos dividimos las historias y subtareas equitativamente.

_Burndown Chart_
![image](https://user-images.githubusercontent.com/59893804/101218505-2d962e80-3651-11eb-92bd-f4069f0d3afd.png)

_Backlog_

### Reporte de análisis estático de código con _Codacy_ 💻
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/d1dc276b7002496887af5332f37e3c7b)](https://www.codacy.com/gh/EquipoTimeLimitCvds/2020-2-PROYCVDS-TimeLimit/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=EquipoTimeLimitCvds/2020-2-PROYCVDS-TimeLimit&amp;utm_campaign=Badge_Grade)

