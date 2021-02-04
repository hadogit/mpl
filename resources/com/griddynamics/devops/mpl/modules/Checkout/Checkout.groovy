/**
 * Common checkout module
 */
 def out = [:]
if( CFG.'git.url' )
  out = MPLModule('Git Checkout', CFG)
else
  out = MPLModule('Default Checkout', CFG)

log.info(out.'git.user')
OUT.'out' = out
log.info(OUT.'out.git.user')
