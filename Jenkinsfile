pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Build Jar') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh '/usr/local/bin/docker build -t javacalculator .'
            }
        }

    }

    post {
        success {
            emailext(
                subject: "Build Successful",
                body: "Jenkins build succeeded and Docker image was created successfully.",
                to: "rohithsandiri064@gmail.com",
                from: "rohithsandiri064@gmail.com"
            )
        }

        failure {
            emailext(
                subject: "Build Failed",
                body: "Jenkins build failed. Please check the Jenkins console output.",
                to: "rohithsandiri064@gmail.com",
                from: "rohithsandiri064@gmail.com"
            )
        }
    }
}