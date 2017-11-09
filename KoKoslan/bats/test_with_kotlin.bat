@echo off
REM Tests with Kotlin
if "%1"=="" goto :paramempty
set OUT=%2
if "%2"=="" SET OUT=%1.out.kl
echo Prueba el caso de prueba: cases\%1 output\%OUT%
kotlin -cp .;classes;lib;%CLASSPATH% kokoslan.kotlin.compiler.KoKocKt cases\%1 output\%OUT%
if %ERRORLEVEL% == 1 (goto :error)
exit /b
:error
echo "*** Test failed ***"
exit /b
:paramempty
echo "*** Provide some test case in dir cases ***"
:end