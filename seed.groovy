multibranchPipelineJob('configuration-as-code-via-url') {
  branchSources {
      git {
          id = 'configuration-as-code'
          remote('https://github.com/Mahm0udSaed/simple-java-maven-app.git')
      }
  }
  

 

}
