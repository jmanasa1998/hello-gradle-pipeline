pipeline {
    agent any

    stages {
        stage('Greet') {
            steps {
                echo 'Hello, Manasa! Your first Jenkins pipeline is running 🎉'
            }
        }
    }
}