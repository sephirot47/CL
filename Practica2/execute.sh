#!/bin/bash

(cd /home/sephirot47/CL/Asl ; make)
FILE=$1
Asl ${FILE}.asl -dot -ast ${FILE}.ast.dot 
if [ -z $2 ]
then
	echo ""
else
	dot -Tpdf ${FILE}.ast.dot -o ${FILE}.ast.pdf 
	xdg-open ${FILE}.ast.pdf
fi
