pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    environment {
        JAVA_HOME = "C:\Program Files (x86)\Java\jre-1.8"  // Mettez ici le chemin vers le JDK 21
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
