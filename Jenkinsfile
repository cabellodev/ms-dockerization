pipeline {
    agent any
      environment {
        PATH = "/usr/local/bin:${env.PATH}"
    }
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
        stage('Build Docker Container') {
            steps {
                script {
                    // Detener y eliminar el contenedor viejo si existe
                    def containerName = 'ms-dockerization'
                    def containerId = sh(script: "docker ps -q -f name=${containerName}", returnStdout: true).trim()

                    if (containerId) {
                        sh "docker stop ${containerId}"
                        sh "docker rm ${containerId}"
                    }

                    // Ejecutar el nuevo contenedor
                    sh 'docker run -d -p 50522:50500 --name ms-dockerization ms-dockerization:latest --network network-system'
                }
            }
        }
    }
}
