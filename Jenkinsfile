pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
       
        stage('Build JAR') {
            steps {
                script {
                    // Ejecuta Maven para construir el archivo JAR
                    sh 'mvn clean package'
                }
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                    sh 'docker build -t ms-dockerization .'
                }
            }
        }
        stage('Build Docker Conteiner') {
            steps {
                script {
                    // Mapea el puerto 50500 del contenedor al puerto 50522 en la máquina host
                    sh 'docker run -d -p 50522:50500 ms-dockerization'
                }
            }
        }
    }
}
