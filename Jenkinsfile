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
                sh '''
                export PATH=$PATH:/usr/local/bin:/Applications/Docker.app/Contents/Resources/bin
                export DOCKER_CONFIG=$HOME/.docker
                /usr/local/bin/docker build -t rohithsandiri/javacalculator:latest .
                '''
            }
        }

        stage('Push Docker Image') {
            steps {
                sh '''
                export PATH=$PATH:/usr/local/bin:/Applications/Docker.app/Contents/Resources/bin
                export DOCKER_CONFIG=$HOME/.docker
                docker push rohithsandiri/javacalculator:latest
                '''
            }
        }
        stage('Deploy Application') {
            steps {
                sh '''
                export PATH=$PATH:/opt/homebrew/bin
                ansible-playbook deploy.yml
                '''
            }
        }
        stage('Run Calculator') {
            steps {
                sh """
                docker run --rm rohithsandiri/javacalculator:latest \
                ${OPERATION} ${A} ${B}
                """
            }
        }
    }

    post {
        success {
            emailext(
                subject: "Build Successful",
                body: "Docker image built and pushed successfully.",
                to: "rohithsandiri064@gmail.com",
                from: "rohithsandiri064@gmail.com"
            )
        }

        failure {
            emailext(
                subject: "Build Failed",
                body: "Pipeline failed. Check Jenkins logs.",
                to: "rohithsandiri064@gmail.com",
                from: "rohithsandiri064@gmail.com"
            )
        }
    }
}