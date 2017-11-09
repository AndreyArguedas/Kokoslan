@echo off
REM compila modelo (parser, value, ast y compilador )
REM Compila el parser
javac -cp .;classes;lib;%CLASSPATH%  -d classes src/kokoslan/parser/*.java
REM Compila Java
REM javac -cp .;classes;lib;%CLASSPATH%  -d classes src/kokoslan/java/ast/*.java src/kokoslan/java/eval/*.java  src/kokoslan/java/exception/*.java src/kokoslan/java/compiler/*.java  src/kokoslan/java/util/*.java
REM Compila Kotlin
kotlinc -cp .;classes;lib;%CLASSPATH% -d classes src/kokoslan/kotlin/ast/*.kt src/kokoslan/kotlin/eval/*.kt src/kokoslan/kotlin/compiler/*.kt src/kokoslan/kotlin/exception/*.kt 
