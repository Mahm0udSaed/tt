multibranchPipelineJob('configuration-as-code-via-url') {
  branchSources {
      git {
          id = 'configuration-as-code'
          remote('https://github.com/mkrzyzanowski/blog-001.git')
      }
  }
}
