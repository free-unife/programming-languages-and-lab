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

default: subtypingmain

clean:
	@echo "Removing object files..."
	@rm -fv *.class */*.class
	@echo "Object files removed."

subtypingmain:
	@javac -cp . SubtypingMain.java
	@java -cp . SubtypingMain

