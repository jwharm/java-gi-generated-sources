#!/bin/bash

javac -d out --enable-preview --source 19 -cp lib/gtk-4.0.jar -sourcepath src src/test/TestNotebook.java
