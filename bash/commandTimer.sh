#!/bin/bash
#
# This script should be run at the head of a command that you wish to time, in order to see how long it takes to execute
# It will rebuild the command you wish to run by concatenating the arguments provided by command prompt; this is relatively
# untested, so do not use this on professions (or, god help you, highly sensitive production data) cmd executions.
#
#
cmdToRun=""
for ARG in $*
do
  cmdToRun="$cmdToRun $ARG"
done
echo "Starting timed run for:$cmdToRun"
startTime=$(date +%s)
eval $cmdToRun
endTime=$(date +%s)
echo "It took $((endTime - startTime)) seconds to complete the task$cmdToRun"

