package toGit.migration.targets.git

class GitOptions {
    List<String> ignore = []
    List<String> lfs = []
    String user = 'migration'
    String email = '2git@praqma.com'

    boolean defaultSetup = true
}
