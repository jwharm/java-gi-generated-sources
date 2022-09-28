#!/bin/bash

java --enable-preview --enable-native-access=ALL-UNNAMED -cp out:lib/gtk4-jextract.jar test.TestNotebook
