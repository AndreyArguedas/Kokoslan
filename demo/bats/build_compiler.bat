@echo off
REM compila modelo (parser, value, ast y compilador )
javac -cp .;classes;lib;%CLASSPATH%  -d classes src/java/parser/*.java src/java/ast/*.java src/java/eval/*.java  src/java/exception/*.java src/java/compiler/*.java 

kotlinc  -cp .;classes;lib;%CLASSPATH% -d classes src/kotlin/*.kt
