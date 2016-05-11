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

default: bicountermain supercountermain

clean:
	@echo "Removing object files..."
	@rm -fv *.class
	@echo "Object files removed."

bicountermain:
	@javac Counter.java BiCounter.java BiCounterMain.java
	@java -cp . BiCounterMain

supercountermain:
	@javac Counter.java BiCounter.java SuperCounter.java SuperCounterMain.java
	@java -cp . SuperCounterMain

