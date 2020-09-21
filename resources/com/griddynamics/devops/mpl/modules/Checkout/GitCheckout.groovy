/**
 * Git Checkout
 */
stage("Checkout"){
     steps{
        git url: CFG.'git.url',
    branch: CFG.'git.branch'
     }
}
//,    credentialsId: CFG.'git.credentials'
