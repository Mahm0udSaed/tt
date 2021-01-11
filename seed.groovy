multibranchPipelineJob('configuration-as-code-via-url') {
  branchSources {
      git {
          id = 'configuration-as-code'
          remote('ssh://git@gitlab.com:Mahmoud_Saeed/jenkins-integration.git')
      }
  }
  

 

}
