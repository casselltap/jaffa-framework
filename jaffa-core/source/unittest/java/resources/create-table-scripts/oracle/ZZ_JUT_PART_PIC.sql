CREATE TABLE "ZZ_JUT_PART_PIC"(
        "PART"          VARCHAR2(50) NOT NULL,
        "SMALL_PICTURE"          RAW(2000),
        "PICTURE"          LONG RAW,
    CONSTRAINT "ZZ_JUT_PART_PICP1" PRIMARY KEY("PART")
)