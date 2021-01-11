multibranchPipelineJob('configuration-as-code-via-url') {
  branchSources {
      git {
          id = 'configuration-as-code'
        remote{
          url ('https://gitlab.com/Mahmoud_Saeed/jenkins-integration.git')
          credentialsId ('jenkins-test-token')
        
        }
          
      }
  }
  

 

}
