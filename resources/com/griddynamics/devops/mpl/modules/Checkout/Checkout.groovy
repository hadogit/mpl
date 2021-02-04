/**
 * Common checkout module
 */
 
import com.griddynamics.devops.mpl.Helper

def Map out = [:]
if( CFG.'git.url' )
  out = MPLModule('Git Checkout', CFG)
 // OUT = Helper.mergeMaps(CFG,MPLModule('Git Checkout', CFG))
else
  out = MPLModule('Default Checkout', CFG)
 // OUT = Helper.mergeMaps(CFG,MPLModule('Default Checkout', CFG))

println(out.getClass())
OUT = Helper.mergeMaps(CFG,out)
//log.info(out.'git.user')
//OUT.'out' = out
log.info(OUT.'out.git.user')
