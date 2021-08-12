pipeline 
{
   agent any
   stages 
   {
      stage('Build') 
	  {
         steps 
		 {
            echo 'Build APP'
         }
      }
	   stage('Test') 
	  {
         steps 
		 {
            echo 'Test APP'
         }
      }
	   stage('Deploy') 
	  {
         steps 
		 {
            echo 'Deploy APP'
         }
      }
	}
	
	post {
        always {
           emailext body: 'Testing the Pipeline Continuous Delivery ', subject: 'Pipeline Continuous Delivery Status', to: 'ajaykumarzib@gmail.com'
        }
      
		}
	
}
