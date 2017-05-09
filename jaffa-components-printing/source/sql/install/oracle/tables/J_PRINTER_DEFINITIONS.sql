CREATE TABLE "J_PRINTER_DEFINITIONS"(
        "PRINTER_ID"          VARCHAR2(50) NOT NULL,
        "DESCRIPTION"         VARCHAR2(100),
        "SITE_CODE"           VARCHAR2(20),
        "LOCATION_CODE"       VARCHAR2(40),
        "REMOTE_PRINTER"      CHAR(1) NOT NULL,
        "REAL_PRINTER_NAME"   VARCHAR2(255),
        "PRINTER_OPTION1"     VARCHAR2(255),
        "PRINTER_OPTION2"     VARCHAR2(255),
        "OUTPUT_TYPE"         VARCHAR2(20) NOT NULL,
        "SCALE_TO_PAGE_SIZE"  VARCHAR2(30),
        "CREATED_ON"          DATE,
        "CREATED_BY"          VARCHAR2(20),
        "LAST_CHANGED_ON"     DATE,
        "LAST_CHANGED_BY"     VARCHAR2(20),
    CONSTRAINT "J_PRINTER_DEFINITIONSP1" PRIMARY KEY("PRINTER_ID")
)
/