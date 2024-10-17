@echo off

setlocal enabledelayedexpansion

REM guardar el mensaje del commit en una variable
set MENSAJE=%1

REM quitar las comillas del mensaje guardado en la variable
set MENSAJE=!MENSAJE:"=!

REM Crear un archivo temporal para el mensaje del commit
echo %MENSAJE% > commit_message.txt

REM añade un salto del linea al archivo
echo. >> commit_message.txt

REM Agregar los cambios
git add .

REM añade la salida del comando git status al archivo
git status >> commit_message.txt

REM Realizar el commit usando el archivo temporal
git commit -F commit_message.txt

REM Subir los cambios al repositorio remoto
git push

REM Eliminar el archivo temporal
del commit_message.txt
