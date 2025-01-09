pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    environment {
        JAVA_HOME = "C:\\Program Files\\Java\\jdk-21"
    }
    stages {
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
