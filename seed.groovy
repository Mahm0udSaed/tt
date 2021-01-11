multibranchPipelineJob('configuration-as-code-via-url') {
  branchSources {
    branchSource{
      source {
              gitSCMSource {
                remote('git@gitlab.com:Mahmoud_Saeed/jenkins-integration.git')
                credentialsId('gitlab+deploy-token-326813')
              }
              
            }
    }
      
  }
  

 

}
