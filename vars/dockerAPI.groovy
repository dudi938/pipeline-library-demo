#!/usr/bin/env groovy

def call(){
  this.sh("docker images -a");
}
