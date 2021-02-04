/**
 * Git Checkout
 */
//stage("my Checkout"){
 //    steps{
    git url: CFG.'git.url',
    branch: CFG.'git.branch'
//     }
    OUT.'output.git.user' = "yakir"
    log.info("--------")
    println OUT.'output.git.user'
    log.info(OUT.'output.git.user')
    //OUT = CFG
//}
//,    credentialsId: CFG.'git.credentials'
