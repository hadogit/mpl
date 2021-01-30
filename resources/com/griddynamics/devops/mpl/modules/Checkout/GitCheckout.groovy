/**
 * Git Checkout
 */
stage("my Checkout"){
 //    steps{
    git url: CFG.'git.url',
    branch: CFG.'git.branch'
//     }
    OUT.'git.user' = "yakir"
    println OUT.'git.user'
    out.'git.user' = "yakir"
    //OUT = CFG
}
//,    credentialsId: CFG.'git.credentials'
