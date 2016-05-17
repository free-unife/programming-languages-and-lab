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

default: iomain rot13server rot13client

clean:
	@echo "Removing object files..."
	@rm -fv *.class */*.class inventory.dat
	@echo "Object files removed."

iomain:
	@javac -cp . IOMain.java
	@java -cp . IOMain

rot13server:
	@javac -cp . Rot13Server.java
	@java -cp . Rot13Server &

rot13client:
	@javac -cp . Rot13Client.java
	@java -cp . Rot13Client "hallo"


