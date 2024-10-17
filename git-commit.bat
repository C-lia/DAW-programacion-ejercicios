@echo off
set MENSAJE=%1

REM Crear un archivo temporal para el mensaje del commit
echo %MENSAJE% > commit_message.txt
echo. >> commit_message.txt
git status >> commit_message.txt

REM Agregar los cambios y realizar el commit usando el archivo temporal
git add .
git commit -F commit_message.txt
git push

REM Eliminar el archivo temporal
del commit_message.txt
