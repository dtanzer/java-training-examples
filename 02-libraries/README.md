# Lab 01: Hello World

Implement and run a hello world program, in Java, using only a text editor and the command line tools.

## Solution

### Step 1

Separate code: Create class HelloWriter, move printing to new class.

Compile:

    cd src
    javac -d ../out net/davidtanzer/hello/HelloWriter.java net/davidtanzer/HelloWorld.java

Run:

    java -cp out net.davidtanzer.HelloWorld

### Step 2

Create new source folder ```srclib```, move HelloWriter (+package) there.

Compile Library:

    cd srclib
    javac -d ../outlib net/davidtanzer/hello/HelloWriter.java
    cd ../outlib/
    jar -cf ../hellolib.jar *

Compile Program:

    cd src
    javac -d ../out -cp ../hellolib.jar net/davidtanzer/HelloWorld.java

Run:

    java -cp "out;hellolib.jar" net.davidtanzer.HelloWorld
