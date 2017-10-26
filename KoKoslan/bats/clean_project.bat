REM Limpia el projecto
REM
@echo off
rd /S /Q classes  build
md classes
rd /S /Q build
md build
del /Q  src\java\parser\*
cls