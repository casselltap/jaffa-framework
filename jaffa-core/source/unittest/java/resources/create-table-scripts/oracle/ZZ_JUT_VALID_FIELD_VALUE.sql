CREATE TABLE "ZZ_JUT_VALID_FIELD_VALUE" (
	"TABLE_NAME" VARCHAR2(20),
	"FIELD_NAME" VARCHAR2(30),
	"LEGAL_VALUE" VARCHAR2(20),
	"DESCRIPTION" VARCHAR2(40),
	"REMARKS" VARCHAR2(250),
CONSTRAINT "ZZ_JUT_VALID_FIELD_VALUEP1" PRIMARY KEY (
 "TABLE_NAME","FIELD_NAME","LEGAL_VALUE")
)