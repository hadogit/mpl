/**
 * Common checkout module
 */
 
import com.griddynamics.devops.mpl.Helper
def temp = [:]
if( CFG.'git.url' )
  temp = MPLModule('Git Checkout', CFG)
 // OUT = Helper.mergeMaps(CFG,MPLModule('Git Checkout', CFG))
else
  temp = MPLModule('Default Checkout', CFG)
 // OUT = Helper.mergeMaps(CFG,MPLModule('Default Checkout', CFG))
OUT.'info.git.user' = temp.'info.git.user'
//println("temp: " + temp.getClass())
//println("temp.out: " + temp.'out'.getClass())
//println("CFG: " + CFG.getClass())
//println("OUT: " + temp.getClass())
//println("OUT.info: " + temp.'info'.getClass())
//println("---------------")

//println("CFG.git: " + CFG.'git')
//OUT.'output.git.user' = temp.'info.git.user'
//OUT = Helper.mergeMaps(CFG.'git',OUT.'info.git')
//log.info(out.'git.user')
//OUT = temp
//log.info("OUT.output.git.user : " +  OUT.'output.git.user')
//println(OUT.size())

/**
 * Common checkout module
 */
