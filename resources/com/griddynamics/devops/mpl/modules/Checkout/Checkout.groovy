/**
 * Common checkout module
 */
 
import com.griddynamics.devops.mpl.Helper

 def out = [:]
if( CFG.'git.url' )
  out = MPLModule('Git Checkout', CFG)
else
  out = MPLModule('Default Checkout', CFG)

OUT = Helper.mergeMaps(OUT,out)
log.info(out.'git.user')
OUT.'out' = out
log.info(OUT.'out.git.user')
