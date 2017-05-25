#!/bin/sh
#
# dirch1.sh
#
#cd ${0%/*}
cd ~/javaLowLevel
pwd


java mike1.TabGen2 > TabGenOut4.html
tidy TabGenOut4.html -o TabGenOut.html


