#!/usr/bin/env groovy

package com.mcnz

public class fileexists {
  
  def safile() {
    def file = new File("/usr/sbin/sa")
  
    if (file.exists()){
      return true;
    }
    else {
      echo " security file not exist."
    }
  
    return false;
  }
}
  
