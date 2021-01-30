/**
 * Common checkout module
 */

if( CFG.'git.url' )
  out = MPLModule('Git Checkout', CFG)
else
  out = MPLModule('Default Checkout', CFG)

log.info(out.'git.user')
OUT = out
log.info(OUT.'git.user')
