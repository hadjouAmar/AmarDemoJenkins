pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    environment {
        // JAVA_HOME global est configuré dans Jenkins
        JAVA_HOME = "C:\\Program Files (x86)\\Java\\jdk-21"
    }
    stages {
        stage('Build') {
            steps {
                // Définir JAVA_HOME juste avant d'exécuter Maven
                bat 'set JAVA_HOME =C:\\Program Files (x86)\\Java\\jdk-21 && mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                bat 'set JAVA_HOME=C:\\Program Files (x86)\\Java\\jdk-21 && mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
}
