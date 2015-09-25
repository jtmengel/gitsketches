#!/bin/bash 
#
# This script was used to batch download files off of my favorite web comic's site
# I've scrubbed out the curl cmd I had as the cmd running within the for loop, but
# thought the tomfoolery with the date merited a push
#
d=2000-01-17
while [ "$d" != 2015-09-23 ]; do # TODO The date to start on could be an argument 
  d=$(date -I -d "$d + 1 day")
  # curl # statement went here, with the variable $d replacing any date references 
done
