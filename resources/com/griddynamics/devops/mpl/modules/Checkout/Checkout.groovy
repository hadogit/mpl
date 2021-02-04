/**
 * Common checkout module
 */
 
import com.griddynamics.devops.mpl.Helper

if( CFG.'git.url' )
  OUT = MPLModule('Git Checkout', CFG)
 // OUT = Helper.mergeMaps(CFG,MPLModule('Git Checkout', CFG))
else
  OUT = MPLModule('Default Checkout', CFG)
 // OUT = Helper.mergeMaps(CFG,MPLModule('Default Checkout', CFG))

//println("temp: " + temp.getClass())
//println("temp.out: " + temp.'out'.getClass())
println("CFG: " + CFG.getClass())
println("OUT: " + OUT.getClass())
println("OUT.info: " + OUT.'info'.getClass())
println("---------------")

println("CFG.git: " + CFG.'git')
OUT = Helper.mergeMaps(CFG.'git',OUT.'info.git')
//log.info(out.'git.user')
//OUT = temp
log.info("OUT.git.user : " +  OUT.'git.user')
log.info("OUT.'git.url' : " +  OUT.'git.url')
OUT.'git.user' = "other"
log.info("OUT.git.user : " +  OUT.'git.user')
println(temp.size())
