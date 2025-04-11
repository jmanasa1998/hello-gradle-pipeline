pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh './gradlew build'
            }
        }

        stage('Run App') {
            steps {
                sh './gradlew runApp'
            }
        }
    }
}