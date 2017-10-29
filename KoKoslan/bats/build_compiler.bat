@echo off
REM compila modelo (parser, value, ast y compilador )
javac -cp .;classes;lib;%CLASSPATH%  -d classes src/java/parser/*.java src/java/ast/*.java src/java/eval/*.java  src/java/exception/*.java src/java/compiler/*.java  src/java/util/*.java

kotlinc -cp .;classes;lib;%CLASSPATH% -d classes src/kotlin/ast/*.kt src/kotlin/eval/*.kt src/kotlin/compiler/*.kt src/kotlin/exception/*.kt 
