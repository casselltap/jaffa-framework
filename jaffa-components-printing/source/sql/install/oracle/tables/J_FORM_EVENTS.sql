CREATE TABLE "J_FORM_EVENTS"(
        "EVENT_NAME"          VARCHAR2(20) NOT NULL,
        "DESCRIPTION"          VARCHAR2(100),
        "CREATED_ON"          DATE,
        "CREATED_BY"          VARCHAR2(20),
        "LAST_CHANGED_ON"          DATE,
        "LAST_CHANGED_BY"          VARCHAR2(20),
    CONSTRAINT "J_FORM_EVENTSP1" PRIMARY KEY("EVENT_NAME")
)
/
