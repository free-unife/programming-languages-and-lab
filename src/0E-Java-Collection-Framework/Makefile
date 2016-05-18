#!/usr/bin/make -f

#
# Makefile
#
# Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
# This work is free. You can redistribute it and/or modify it under the
# terms of the Do What The Fuck You Want To Public License, Version 2,
# as published by Sam Hocevar. See the LICENSE file for more details.
#

WORDS = "hallo" "how" "are" "you?" "and" "you?" "I'm" "fine" "thank" "you."

.PHONY: clean

default: setmain listmain mapmain sortedmapmain collectionsmain

clean:
	@echo "Removing object files..."
	@rm -fv *.class */*.class inventory.dat
	@echo "Object files removed."

setmain:
	@cd set && javac -cp . FindDups.java
	@cd set && java -cp . FindDups $(WORDS)
	@printf "\n"

listmain:
	@cd list && { javac -cp . Exchange.java; javac -cp . Reverse.java; }
	@cd list && java -cp . Exchange $(WORDS)
	@printf "\n"
	@cd list && java -cp . Reverse $(WORDS)
	@printf "\n"

mapmain:
	@cd map && javac -cp . CountFrequency.java
	@cd map && java -cp . CountFrequency $(WORDS)
	@printf "\n"

sortedmapmain:
	@cd sorted-map && javac -cp . CountFrequencySorted.java
	@cd sorted-map && java -cp . CountFrequencySorted $(WORDS)
	@printf "\n"

collectionsmain:
	@cd collections && javac -cp . Person.java NameSort.java
	@cd collections && java -cp . NameSort
	@printf "\n"
