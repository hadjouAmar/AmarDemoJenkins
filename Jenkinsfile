pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    stages {
        
        stage('Check Java Version') {
    steps {
        bat 'java -version'
        bat 'javac -version'
    }
}
        
        
        
        
        stage('Build') {
            steps {
                bat 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
}

