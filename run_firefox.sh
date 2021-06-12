#!/usr/bin/env bash

set -xe

docker run -t --rm -v "$(pwd)/Academy_Automation_Test":/katalon/katalon/source katalonstudio/katalon katalon-execute.sh -browserType="Firefox" -retry=0 -statusDelay=15 -testSuitePath="Test Suites/DemoTestSuite"