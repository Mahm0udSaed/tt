multibranchPipelineJob('configuration-as-code-via-url') {
  branchSources {
      git {
          id = 'jenkins-test-token'
          remote ('https://gitlab.com/Mahmoud_Saeed/jenkins-integration.git')
        
        
          
      }
  }
  

 

}
