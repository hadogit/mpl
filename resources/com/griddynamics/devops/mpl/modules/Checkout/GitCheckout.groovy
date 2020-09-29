/**
 * Git Checkout
 */
stage("my Checkout"){
 //    steps{
        gitOutput = git url: CFG.'git.url',
        branch: CFG.'git.branch'
        OUT.'gitOutput' = gitOutput
//     }
}
//,    credentialsId: CFG.'git.credentials'
