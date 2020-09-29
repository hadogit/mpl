vars/log.groovy

def BLUE_COLOR = "\033[1m\033[34m"
def YELLOW_COLOR  "\033[1m\033[33m"
def RED_COLOR = "\033[1m\033[31m"
def GREEN_COLOR = "\033[1m\033[32m"


def info(message) {
  ansiColor('css') {
    echo BLUE_COLOR + "INFO: ${message}" + BLUE_COLOR
    }
}

def warning(message) {
  ansiColor('css') {
    echo YELLOW_COLOR + "WARNING: ${message}" + YELLOW_COLOR
    }
}

def error(message) {
  ansiColor('css') {
    echo RED_COLOR + "ERROR: ${message}" + RED_COLOR
    }
}

def success(message) {
  ansiColor('css') {
    echo GREEN_COLOR + "SUCCESS: ${message}" + GREEN_COLOR
    }
}
