-- Use Case 25: Audit Trigger

CREATE TABLE IF NOT EXISTS covid_cases_audit(
    audit_id INT AUTO_INCREMENT PRIMARY KEY,
    Country VARCHAR(100),
    OldConfirmed INT,
    NewConfirmed INT,
    OldDeaths INT,
    NewDeaths INT,
    OldRecovered INT,
    NewRecovered INT,
    ChangedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

DELIMITER //
CREATE TRIGGER trg_covid_cases_audit
BEFORE UPDATE
ON covid_cases
FOR EACH ROW
BEGIN
    INSERT INTO covid_cases_audit(
        Country,OldConfirmed,NewConfirmed,
        OldDeaths,NewDeaths,
        OldRecovered,NewRecovered
    )
    VALUES(
        OLD.Country,OLD.Confirmed,NEW.Confirmed,
        OLD.Deaths,NEW.Deaths,
        OLD.Recovered,NEW.Recovered
    );
END //
DELIMITER ;
