/**
 * Git Checkout
 */
//stage("my Checkout"){
 //    steps{
    git url: CFG.'git.url',
    branch: CFG.'git.branch'
//     }
    OUT.'git.user' = "yakir"
    log.info("--------")
    println OUT.'git.user'
    log.info(OUT.'git.user')
    //OUT = CFG
//}
//,    credentialsId: CFG.'git.credentials'
