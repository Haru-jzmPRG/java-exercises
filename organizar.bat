@echo off
setlocal enabledelayedexpansion
chcp 65001 >nul

:: ═══════════════════════════════════════════════════════════════
::  CONFIGURACIÓN — Cambia estos valores si es necesario
:: ═══════════════════════════════════════════════════════════════

:: Tu usuario de GitHub
set GITHUB_USER=Haru-jzmPRG

:: Carpeta donde están tus repos clonados en el PC
:: (la carpeta PADRE donde están todas las carpetas ejercicio_xx_xx)
set REPOS_LOCALES=..

:: Prefijo que tienen los repos de ejercicios
set PREFIJO=ejercicio_

:: ═══════════════════════════════════════════════════════════════
::  NO TOQUES NADA A PARTIR DE AQUÍ
:: ═══════════════════════════════════════════════════════════════

echo.
echo  ╔══════════════════════════════════════════╗
echo  ║   Organizador de ejercicios de GitHub   ║
echo  ╚══════════════════════════════════════════╝
echo.

:: Verificar que git está instalado
git --version >nul 2>&1
if errorlevel 1 (
    echo [ERROR] Git no está instalado o no está en el PATH.
    pause
    exit /b
)

set CONTADOR=0
set CLONADOS=0
set COPIADOS=0

:: Recorrer todos los repos que empiezan por el prefijo en la carpeta local
for /d %%R in (%REPOS_LOCALES%\%PREFIJO%*) do (
    set NOMBRE=%%~nxR

    :: Extraer el número de tema (segundo y tercer carácter tras el prefijo)
    :: Formato esperado: ejercicio_01_01 → tema 01
    set TEMA=
    set RESTO=!NOMBRE:%PREFIJO%=!
    for /f "tokens=1 delims=_" %%T in ("!RESTO!") do set TEMA=%%T

    if not "!TEMA!"=="" (
        :: Crear carpeta del tema si no existe
        if not exist "tema-!TEMA!" (
            mkdir "tema-!TEMA!"
            echo  [+] Carpeta creada: tema-!TEMA!
        )

        :: Copiar el contenido del ejercicio a su carpeta de tema
        :: (excluye la carpeta .git del ejercicio original)
        if exist "tema-!TEMA!\!NOMBRE!" (
            echo  [~] Ya existe: tema-!TEMA!\!NOMBRE! — omitido
        ) else (
            xcopy "%%R" "tema-!TEMA!\!NOMBRE!" /E /I /Q /EXCLUDE:excluir.txt >nul 2>&1
            echo  [OK] Copiado: !NOMBRE! → tema-!TEMA!\
            set /a COPIADOS+=1
        )
        set /a CONTADOR+=1
    )
)

echo.
echo  ─────────────────────────────────────────
echo  ¿Quieres también clonar los repos que
echo  SOLO están en GitHub (no en este PC)?
echo  ─────────────────────────────────────────
set /p CLONAR= Escribe S para clonar o N para saltar: 

if /i "!CLONAR!"=="S" (
    echo.
    echo  Introduce los nombres de los repos a clonar.
    echo  Escribe uno por línea. Cuando termines escribe FIN.
    echo.

    :bucle_clonar
    set /p REPO_NAME= Nombre del repo (ej: ejercicio_03_05): 
    if /i "!REPO_NAME!"=="FIN" goto fin_clonar

    :: Extraer tema del nombre introducido
    set RESTO2=!REPO_NAME:%PREFIJO%=!
    set TEMA2=
    for /f "tokens=1 delims=_" %%T in ("!RESTO2!") do set TEMA2=%%T

    if "!TEMA2!"=="" (
        echo  [ERROR] Nombre no reconocido, intenta de nuevo.
        goto bucle_clonar
    )

    :: Clonar en una carpeta temporal
    echo  Clonando !REPO_NAME!...
    git clone https://github.com/%GITHUB_USER%/!REPO_NAME! _temp_clone >nul 2>&1

    if exist "_temp_clone" (
        :: Crear carpeta de tema si no existe
        if not exist "tema-!TEMA2!" mkdir "tema-!TEMA2!"

        :: Mover a su carpeta de tema (sin la carpeta .git)
        if exist "tema-!TEMA2!\!REPO_NAME!" (
            echo  [~] Ya existe: tema-!TEMA2!\!REPO_NAME! — omitido
        ) else (
            xcopy "_temp_clone" "tema-!TEMA2!\!REPO_NAME!" /E /I /Q /EXCLUDE:excluir.txt >nul 2>&1
            echo  [OK] Clonado y movido: !REPO_NAME! → tema-!TEMA2!\
            set /a CLONADOS+=1
        )
        rmdir /s /q "_temp_clone"
    ) else (
        echo  [ERROR] No se pudo clonar !REPO_NAME! — revisa el nombre o tu conexión.
    )

    goto bucle_clonar
    :fin_clonar
)

:: Crear archivo de exclusión para xcopy (excluye carpeta .git)
echo .git\ > excluir.txt

:resumen
echo.
echo  ╔══════════════════════════════════════════╗
echo  ║              RESUMEN FINAL              ║
echo  ╚══════════════════════════════════════════╝
echo  Repos encontrados en PC:  !CONTADOR!
echo  Copiados correctamente:   !COPIADOS!
echo  Clonados desde GitHub:    !CLONADOS!
echo.
echo  Ahora ejecuta estos comandos para subir todo:
echo.
echo    git add .
echo    git commit -m "feat: organizar ejercicios por temas"
echo    git push
echo.

:: Limpiar archivo temporal
if exist excluir.txt del excluir.txt

pause