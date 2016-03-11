#!/usr/bin/python
import os
listFile = list()
listFile = os.listdir("spinner")
listFile.sort()
for x in range(0,164):
	os.rename("spinner/"+listFile[x], "spinner/"+str(x)+".png")
	print listFile[x]
	print x
