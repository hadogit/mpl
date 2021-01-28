/**
 * Git Checkout
 */
stage("my Checkout"){
 //    steps{
    git url: CFG.'git.url',
    branch: CFG.'git.branch'
//     }
    CFG.'git.user' = "yakir"
}
//,    credentialsId: CFG.'git.credentials'
