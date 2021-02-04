/**
 * Checkout for the current SCM
 */
 
log.info("Checkout")
//checkout scm

checkout( 
    scm: [
        $class: 'GitSCM', branches: [[name: CFG.'git.branch']], 
        doGenerateSubmoduleConfigurations: false, 
        extensions: [
            [$class: 'CloneOption', noTags: CFG.'git.noTags', reference: '', shallow: CFG.'git.shallow'], 
            [$class: 'CleanBeforeCheckout']], submoduleCfg: [], userRemoteConfigs: [[ url: CFG.'git.url']]]
)
