#!/usr/bin/env groovy

def call(String name = 'human') {
  this.sh("docker images -a");
}
