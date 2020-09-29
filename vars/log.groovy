def loadColor(){  
 BLUE_COLOR = '\033[0;34m'
 YELLOW_COLOR  '\033[0;43m'
 RED_COLOR = '\033[0;31m'
 GREEN_COLOR = '\033[0;32m'
}


def info(message) {
  loadColor()
  //ansiColor('css') {
 echo '\033[34m' + "[INFO]: ${message}" + '\033[34m'
  //  }
}

def warning(message) {
  loadColor()
//  ansiColor('css') {
    echo "${YELLOW_COLOR}" + "[WARNING]: ${message}" + "${YELLOW_COLOR}"
 //   }
}

def error(message) {
  loadColor()
//  ansiColor('css') {
    echo "${RED_COLOR}" + "[ERROR]: ${message}" + "${RED_COLOR}"
//    }
}

def success(message) {
  loadColor()
//  ansiColor('css') {
    echo "${GREEN_COLOR}" + "[SUCCESS]: ${message}" + "${GREEN_COLOR}"
//    }
}
