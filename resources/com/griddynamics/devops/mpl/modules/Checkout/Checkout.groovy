/**
 * Common checkout module
 */
 
import com.griddynamics.devops.mpl.Helper
def temp = [:]
if( CFG.'git.url' )
  //temp = MPLModule('Git Checkout', CFG)
  temp = MPLModule('Default Checkout', CFG)
 // OUT = Helper.mergeMaps(CFG,MPLModule('Git Checkout', CFG))
else
  //temp = MPLModule('Default Checkout', CFG)
  temp = MPLModule('Git Checkout', CFG)
 // OUT = Helper.mergeMaps(CFG,MPLModule('Default Checkout', CFG))
OUT.'output.git.user' = temp.'info.git.user'
println(temp.'output.git')
println(temp.'output.git.user')
println(OUT.'output.git.user')
OUT.'output.git' = temp.'output.git'
println(OUT.'output.git.user')  // = temp.'output.git.user'

for (inGit in OUT)
println(inGit)
//OUT = Helper.mergeMaps(CFG,temp.'info')


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
