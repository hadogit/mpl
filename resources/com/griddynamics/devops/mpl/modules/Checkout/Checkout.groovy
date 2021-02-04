/**
 * Common checkout module
 */
 
import com.griddynamics.devops.mpl.Helper

 def Map out = [:]
if( CFG.'git.url' )
  OUT = Helper.mergeMaps(CFG,MPLModule('Git Checkout', CFG))
else
  OUT = Helper.mergeMaps(CFG,MPLModule('Default Checkout', CFG))

///OUT = Helper.mergeMaps(OUT,out)
//log.info(out.'git.user')
//OUT.'out' = out
log.info(OUT.'out.git.user')
