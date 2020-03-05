#!/usr/bin/env groovy

def call(String name = 'human') {
  docker "images -a"
}
