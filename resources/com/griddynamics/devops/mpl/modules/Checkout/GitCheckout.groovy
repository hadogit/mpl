/**
 * Git Checkout
 */
checkout( 
    scm: [
        $class: 'GitSCM', branches: [[name: CFG.'git.branch']], 
        doGenerateSubmoduleConfigurations: false, 
        extensions: [
            [$class: 'CloneOption', noTags: CFG.'git.noTags', reference: '', shallow: CFG.'git.shallow'], 
            [$class: 'CleanBeforeCheckout']], submoduleCfg: [], userRemoteConfigs: [[ url: CFG.'git.url']]]
)
OUT.'output.git.user' = "yakir"
log.info("--------")
println OUT.'output.git.user'
log.info(OUT.'output.git.user')

