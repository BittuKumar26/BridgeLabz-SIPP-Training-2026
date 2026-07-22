-- Use Case 23: Stored Procedure
DELIMITER //
CREATE PROCEDURE UpdateCovidStats(
    IN p_country VARCHAR(100),
    IN p_date DATE,
    IN p_confirmed INT,
    IN p_deaths INT,
    IN p_recovered INT
)
BEGIN
    UPDATE covid_cases
    SET Confirmed=p_confirmed,
        Deaths=p_deaths,
        Recovered=p_recovered
    WHERE Country=p_country
      AND Date=p_date;
END //
DELIMITER ;
