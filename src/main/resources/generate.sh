GRAMMAR_NAME="Java"
GRAMMAR_FILE="../../../src/main/resources/${GRAMMAR_NAME}.g4"
PACKAGE_NAME="com.lemoulinstudio.sdiff.parser.java"
OUT_JAVA_DIR="../../../src/main/java"

java -jar ../../../lib/antlr-4.1-complete.jar -o "${OUT_JAVA_DIR}" -package "${PACKAGE_NAME}" "${GRAMMAR_FILE}"


