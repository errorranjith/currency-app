pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/errorranjith/currency-app.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deployment Successful'
            }
        }
    }
}
