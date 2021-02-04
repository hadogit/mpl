/**
 * Git Checkout
 */
//stage("my Checkout"){
 //    steps{
    git url: CFG.'git.url',
    branch: CFG.'git.branch'
//     }
    OUT.'out.git.user' = "yakir"
    log.info("--------")
    println OUT.'out.git.user'
    log.info(OUT.'out.git.user')
    //OUT = CFG
//}
//,    credentialsId: CFG.'git.credentials'
