@echo off
javac -d ..\bin ua\nure\dlubovskyi\Practice1\*.java
java -cp ..\bin ua.nure.dlubovskyi.practice1.Demo
pause
del  ..\bin\ua\nure\dlubovskyi\Practice1\*.class
