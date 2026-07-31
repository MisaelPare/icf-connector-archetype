#!/usr/bin/env zsh

# Validar que se envíen exactamente los 2 parámetros
if [ -z "$1" ] || [ -z "$2" ]; then
    echo "Error: Faltan parámetros."
    echo "Uso: ./generate-connecotr.sh <nombre_minusculas> <Nombre_CamelCase>"
    exit 1
fi

LC_NAME=$1  # Primer parámetro (ej: docusign)
CC_NAME=$2  # Segundo parámetro (ej: Docusign)

echo "Generando conector '${CC_NAME}'..."

mvn archetype:generate \
  -DarchetypeGroupId=io.github.misaelpare \
  -DarchetypeArtifactId=icf-connector-archetype \
  -DarchetypeVersion=1.0.0 \
  -DgroupId=org.forgerock.openicf.connectors \
  -DartifactId=${LC_NAME}-connector \
  -Dpackage=org.forgerock.openicf.connectors.${LC_NAME} \
  -DconnectorName=${CC_NAME} \
  -DinteractiveMode=false