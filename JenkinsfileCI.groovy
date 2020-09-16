pipeline {
   agent any

   stages {
      stage('First') {
         steps {
            sh"""
            mvn -version
            """
         }
      }
      stage('Second') {
         steps {
            echo 'Hello World'
         }
      }
      stage('Third') {
         steps {
            echo 'Hello World'
         }
      }
      stage('Four') {
         steps {
            echo 'Hello World'
         }
      }
   }
}
