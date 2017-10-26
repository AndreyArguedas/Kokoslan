@echo off
REM Genera el jar del proyecto
set JAR=eif400_kokoslan_v0.jar
echo Cleaning
del /s /Q build\* classes\*.class 1>nul
rmdir /Q/S classes
mkdir classes
echo Compiling
call bats\build_parser.bat
call bats\build_compiler.bat
echo Building jar
jar cf %JAR% -C classes .
jar tf %JAR%
echo copying jar
move %JAR% build\%JAR%