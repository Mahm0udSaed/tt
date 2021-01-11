multibranchPipelineJob('configuration-as-code-via-url') {
  branchSources {
    branchSource{
      source {
              gitSCMSource {
                remote('https://github.com/Mahm0udSaed/mvntest1.git')
               
                
              
              }
              
            }
    }
      
  }
  

 

}
