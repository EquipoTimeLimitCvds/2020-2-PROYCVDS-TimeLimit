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
* **Agregar**
El personal puede agregar nuevas novedades , equipos , elementos y laboratorios. La función de agregar es muy sencilla , simplemente se llenaran los campos del formulario y se seleccionaran las opciones adecuadas del mismo.
La unica variacion existe cuando creamos un nuevo equipo ya que este como requisito debe contar con sus 4 elementos que lo componen , para ello haremos los siguiente pasos:
1. Iremos a elementos y agregaremos 4 elementos de diferentes tipos (si no hay elementos disponibles para asociar) es decir "teclado" , "monitor" , "mouse" y "CPU".
2. Despues de esto iremos a "equipos" , llenaremos los campos y seleccionaremos casillas; podemos o no seleccionar un laboratorio al que queremos que pertenezca cierto equipo , pero obligatoriamente tenemos que elegir los 4 elementos que se asociaran a el equipo.
3. Despues de esto se podra agregar exitosamente.
* **Consultar** 
La función consultar tambien es muy sencilla , simplemente iremos al item que queremos consultar y oprimimos el boton "consultar" , despues de esto veremos en pantalla toda la informacion de todos los atributos del item.
* **Asociar** 
La función de asociar esta dada solo para dos items:
* Asociar un elemento a un equipo 
* Asociar un equipo a un laboratorio 
Asociar un equipo a un laboratorio ya lo explicamos ya que se hace cuando se agrega un nuevo equipo;para asociar un elemento a un equipo iremos al item "equipos" , luego a "asociar elemento" alli seleccionaremos el equipo al que le queremos asocair un elemento , luego elegiremos el elemento a asociar y oprimimos filtrar , se mostrara en pantalla los elementos de ese tipo disponibels par asociar lo seleccionaremos y por ultimo le daremos "asociar"; despues de esto el elemento quedara asociado con exito.
* **Dar de baja **
Para dar de baja a un elemento haremos lo siguiente:
* Entraremos al item elemento 
* Consultaremos todos los elementos
* Seleccionaremos el elemento que queremos dar de baja 
* Oprimimos "dar de baja"
* Exitosamente el elemento ya no estara disponible pero aun podemos ver toda su informacion

* **Generar reporte** 
Podemos generar reportes para equipos, laboratorios y elementos; para ello :
* Iremos al item al  cual queremos generarle un reporte 
* Consultaremos todos los items 
* Alli oprimiremos el botón de excel
* Automaticamente se generara un archivo .xls con el reporte de ese item

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
#### Sprint2
#### Sprint3 


### Reporte de análisis estático de código con _Codacy_ 💻
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/d1dc276b7002496887af5332f37e3c7b)](https://www.codacy.com/gh/EquipoTimeLimitCvds/2020-2-PROYCVDS-TimeLimit/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=EquipoTimeLimitCvds/2020-2-PROYCVDS-TimeLimit&amp;utm_campaign=Badge_Grade)

