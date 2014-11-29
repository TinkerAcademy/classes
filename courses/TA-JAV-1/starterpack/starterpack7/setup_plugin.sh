#!/bin/bash
PROJECT_NAME=StarterPack7
DIST=dist
BIN=bin
MINECRAFT_HOME=/home/student/Documents/minecraft
MINECRAFT_SERVER=$MINECRAFT_HOME/server
PLUGINS=$MINECRAFT_SERVER/plugins

pushd .
cd $PROJECT_NAME
mkdir -p $DIST
jar -cf dist/${PROJECT_NAME}.jar *.yml -C $BIN . || exit 1
popd

pushd .
mkdir -p $PLUGINS
cd $PROJECT_NAME
cd $DIST
cp -rp ${PROJECT_NAME}.jar $PLUGINS
popd