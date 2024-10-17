@echo off
set MENSAJE=%1

git add .
git commit -am "%MENSAJE%"
git push
