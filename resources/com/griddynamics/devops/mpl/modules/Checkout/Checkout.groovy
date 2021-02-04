/**
 * Common checkout module
 */
 
import com.griddynamics.devops.mpl.Helper

def Map out = [:]
if( CFG.'git.url' )
  temp = MPLModule('Git Checkout', CFG)
 // OUT = Helper.mergeMaps(CFG,MPLModule('Git Checkout', CFG))
else
  temp = MPLModule('Default Checkout', CFG)
 // OUT = Helper.mergeMaps(CFG,MPLModule('Default Checkout', CFG))

println("temp: " + temp.getClass())
println("temp.out: " + temp.'out'.getClass())
println("CFG: " + CFG.getClass())
println("---------------")

println("CFG.git: " + CFG.'git')
//OUT = Helper.mergeMaps(CFG,temp.'out')
//log.info(out.'git.user')
OUT = temp
log.info("OUT.out.git.user : " +  OUT.'out.git.user')
