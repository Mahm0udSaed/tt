multibranchPipelineJob('configuration-as-code-via-url') {
  branchSources {
    branchSource{
      source {
              
                remote('git@gitlab.com:Mahmoud_Saeed/jenkins-integration.git')
                credentialsId('jenkins-test-token')
               
              
            }
    }
      
  }
  

 

}
