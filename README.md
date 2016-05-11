# oop-training
My attempt to finally learn what object oriented programming is and what one can do with it

##Prerequisites
- Install `jdk8-openjdk` and `jre8-openjdk-headless` which are on 
the `libre` repo on Parabola GNU/Linux-libre. Optionally you can install 
`openjdk8-doc` which is on the `extra` repo.

- Add a shell alias to make life much simpler (the following works if you use 
bash):
```
$ printf "alias java='java -cp .'\n" >> ~/.bashrc
```

To compile and run:
```
$ javac ClassName.java
$ java ClassName
```

This method is not handy if you have multiple files to compile and run. I 
recommend using the Makefiles instead.

## Makefiles
Most directories include a Makefile that will build and execute the programs 
in a much easier fashion than doing it by hand. The only thing to do is to 
`$ cat Makefile` to know what the available targets are, and then `$ make 
[TARGET]`.

##License
Every file in this repository is covered by the WTFPL. I decided not to use
the GPL because all these are implemetations of well known situations,
so the copyleft clause and others clauses are not necessary here.

