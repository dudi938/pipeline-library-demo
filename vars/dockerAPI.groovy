#!/usr/bin/env groovy

call(String name = 'human') {
  this.sh("docker images -a");
}
