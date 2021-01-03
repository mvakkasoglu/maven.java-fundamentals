pipeline {
    agent any
    stages {
        stage('SCM Checkout') {
            steps {
                script{
                sh 'git clone https://github.com/mvakkasoglu/maven.java-fundamentals.git'
                }
            }
        }

        stage('Compile-Package') {
            steps {
                script{
                def mvnHome = tool name: 'maven-3', type: 'maven'
                sh "${mvnHome}/bin/mvn/package"
                }
            }
        }
        }
        post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
   		}
  
}
