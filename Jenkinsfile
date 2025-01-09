pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    environment {
        JAVA_HOME = "C:\\Program Files (x86)\\Java\\jre-1.8"  // Utilisation du chemin spécifié
    }
    stages {
        stage('Build') {
            steps {
                // Utilisation du chemin de JAVA_HOME spécifié pour la commande Maven
                bat 'set JAVA_HOME=C:\\Program Files (x86)\\Java\\jre-1.8 && mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                bat 'set JAVA_HOME=C:\\Program Files (x86)\\Java\\jre-1.8 && mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
}
