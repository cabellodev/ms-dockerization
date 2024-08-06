# Usa la imagen base de OpenJDK 22
FROM openjdk:22-jdk

# Configura el directorio de trabajo en el contenedor
WORKDIR /app

# Copia el archivo JAR de la aplicación al contenedor
COPY target/ms-dockerizacion-1.0.0.jar ms-dockerization.jar

# Expone el puerto en el que la aplicación estará escuchando
EXPOSE 50500

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "ms-dockerization.jar"]
