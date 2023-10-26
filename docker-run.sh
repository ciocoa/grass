#!/bin/sh -l

PLUGIN_PATH=/plugins
RESOURCES_PATH=/resources

echo ">> Setting dependencies..."

cd /tmp/

apk -U --no-cache add openjdk17-jre openssl tzdata

echo ">> Setting resources..."

mv grasscutter-*.jar /grasscutter.jar

mv .$PLUGIN_PATH/opencommand-*.jar /opencommand.jar

unzip -q archive.zip

mv GC*/Resources $RESOURCES_PATH

echo ">> Clean up redundant files..."

mv docker-entrypoint.sh / && chmod +x /docker-entrypoint.sh

rm -rf *

ls -la / && ls -la $RESOURCES_PATH/

echo ">> Done..."
