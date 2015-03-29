@echo off
title Natura Workspace Setup

:: Call Gradle Setup
call gradlew setupDecompWorkspace eclipse
pause