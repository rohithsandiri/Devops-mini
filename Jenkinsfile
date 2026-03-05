pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

    }

    post {
        success {
            emailext (
                subject: "Build Successful",
                body: "The Jenkins build succeeded.",
                to: "rohithsandiri064@gmail.com"
            )
        }
        failure {
            emailext (
                subject: "Build Failed",
                body: "The Jenkins build failed.",
                to: "rohithsandiri064@gmail.com"
            )
        }
    }
}