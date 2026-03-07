pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }

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
                docker build -t rohithsandiri/javacalculator:latest .
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
                ansible-playbook -i inventory.ini deploy.yml
                '''
            }
        }
    }

    post {
        success {
            emailext(
                subject: "Build Successful",
                body: "Tests passed. Docker image built, pushed and deployed successfully.",
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