pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                script {
                    sh 'docker build -t ms-dockerization .'
                }
            }
        }
        stage('Run') {
            steps {
                script {
                    // Mapea el puerto 50500 del contenedor al puerto 50522 en la máquina host
                    sh 'docker run -d -p 50522:50500 ms-dockerization'
                }
            }
        }
    }
}
