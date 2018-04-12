#!/bin/sh
#
# dirch1.sh
#
#cd ${0%/*}
#cd ~/javaLowLevel  || exit
cd /media/mikeh/mikeSpace/javaLowLevel  || exit
cd /home/mikeh/javaLowLevel  || exit
pwd


java mike1.TabGen2 > TabGenOut4.html
tidy TabGenOut4.html -o TabGenOut.html


