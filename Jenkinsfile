pipeline {
  agent any
  stages {
  stage('Stage 1') {
      steps {
        script {
          echo 'Stage 1'
        }
      }
      }
  stage('Stage 2') {
      steps {
        script {
         echo 'Stage 2'
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