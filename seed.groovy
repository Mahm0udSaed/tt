multibranchPipelineJob('configuration-as-code-via-url') {
  branchSources {
    branchSource{
      source {
              gitSCMSource {
                remote('git@gitlab.com:Mahmoud_Saeed/jenkins-integration.git')
                credentialsId('736dbbbb-1559-41f1-bcf6-c2338629746f')
                
              
              }
              
            }
    }
      
  }
  

 

}
