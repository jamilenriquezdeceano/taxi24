## API Rest to Taxi24 Project


###Requeriments
- Java 1.8 +
- PostGreSQL 12+

###Setup Database
- Set params correct in file application.properties
- create database bdtaxi24
- import file bdtaxi24-v1.sql to database



###Deploy project
Step 1. git clone https://github.com/jamilenriquezdeceano/taxi24.git

Step 2. cd taxi24

Step 3. mvn spring-boot:run


## All Endpoints are GET except /api/viaje is POST and  /api/viaje/completar/{id} is PUT
- Conductor 

  http://localhost:8080/api/conductores
  http://localhost:8080/api/conductores/disponibles
  http://localhost:8080/api/conductores/disponibles/radio3km/{ubicacion}
  http://localhost:8080/api/conductor/{id}

- Pasajero

  http://localhost:8080/api/pasajeros
  http://localhost:8080/api/pasajero/{id}
  http://localhost:8080/api/pasajero/buscar/viaje/cercano/{ubicacion}

- Viajes

  http://localhost:8080/api/viajes
  http://localhost:8080/api/viaje
  http://localhost:8080/api/viaje/completar/{id}


