multibranchPipelineJob('configuration-as-code-via-url') {
  branchSources {
      git {
          id = 'jenkins-test-token'
        remote{
          url ('https://gitlab.com/Mahmoud_Saeed/jenkins-integration.git')
        
        }
          
      }
  }
  

 

}
