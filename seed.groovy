multibranchPipelineJob('configuration-as-code-via-url') {
  branchSources {
    branchSource{
      source {
              gitSCMSource {
                remote('https://gitlab.com/Mahmoud_Saeed/jenkins-integration.git')
                credentialsId('UCyD3XXZhCZfy9j-__x8')
              }
              
            }
    }
      
  }
  

 

}
