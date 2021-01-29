/**
 * Git Checkout
 */
stage("my Checkout"){
 //    steps{
    git url: CFG.'git.url',
    branch: CFG.'git.branch'
//     }
    CFG.'git.user' = "yakir"
    OUT = CFG
}
//,    credentialsId: CFG.'git.credentials'
