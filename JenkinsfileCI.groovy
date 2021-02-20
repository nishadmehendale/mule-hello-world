pipeline {
   agent any

   stages {
      stage('First') {
         steps {
            print ('First')
         }
      }
      stage('Second') {
         steps {
            print ('Second')
         }
      }
      stage('Third') {
         steps {
            print ('Third')
         }
      }
      stage('Four') {
         steps {
            print ('Four')
         }
      }
   }
}
