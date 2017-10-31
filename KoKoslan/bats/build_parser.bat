@echo off
REM Genera el parser y visitors y los compila
REM Asume antlr4 esta en el PATH
REM -package kokoslan.compile	
call antlr4 -visitor  -o src/kokoslan/parser -package kokoslan.parser  -no-listener grammar/KoKoslan.g4 %*
if %ERRORLEVEL% == 1 (goto :error)
javac -d classes   -Xlint:deprecation src/kokoslan/parser/*.java
goto :end
:error 
echo "*** ANTLR compilation failed ***"
:end

