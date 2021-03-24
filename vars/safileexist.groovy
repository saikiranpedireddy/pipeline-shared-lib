#!/usr/bin/env groovy

def call() {
  def file = new File("/usr/sbin/sa")
  
  if (file.exists()){
    return true;
  }
  else {
    echo " security file not exist."
  }
  return false;
}
  
