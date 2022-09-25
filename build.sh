#!/bin/bash

javac -d out --enable-preview --source 19 -cp lib/gtk4-jextract.jar -sourcepath src src/test/TestNotebook.java
