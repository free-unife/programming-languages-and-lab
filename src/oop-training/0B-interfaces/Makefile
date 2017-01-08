#!/usr/bin/make -f

#
# Makefile
#
# Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
# This work is free. You can redistribute it and/or modify it under the
# terms of the Do What The Fuck You Want To Public License, Version 2,
# as published by Sam Hocevar. See the LICENSE file for more details.
#

.PHONY: clean

default: interfacesmain

clean:
	@echo "Removing object files..."
	@rm -fv *.class */*.class
	@echo "Object files removed."

interfacesmain:
	@javac -cp . InterfacesMain.java
	@java -cp . InterfacesMain

