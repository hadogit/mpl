/**
 * Git Checkout
 */
//stage("my Checkout"){
 //    steps{
    git url: CFG.'git.url',
    branch: CFG.'git.branch'
//     }
    OUT.'info.git.user' = "yakir"
    log.info("--------")
    println OUT.'info.git.user'
    log.info(OUT.'info.git.user')
    //OUT = CFG
//}
//,    credentialsId: CFG.'git.credentials'
