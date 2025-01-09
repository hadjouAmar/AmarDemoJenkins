pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') {
            steps {
                // Remplacez sh par bat pour une compatibilité avec Windows
                bat 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                // Remplacez sh par bat pour la commande test
                bat 'mvn test'
            }
            post {
                always {
                    // Il peut être nécessaire d'ajuster le chemin des rapports JUnit si vous utilisez Maven sur Windows
                    junit 'target\\surefire-reports\\*.xml'
                }
            }
        }
    }
}
