-- Use Case 24: Recovery Rate Function
DELIMITER //
CREATE FUNCTION CalculateRecoveryRate(
    p_country VARCHAR(100)
)
RETURNS DECIMAL(10,2)
DETERMINISTIC
BEGIN
    DECLARE rate DECIMAL(10,2);
    SELECT (Recovered/Confirmed)*100
    INTO rate
    FROM covid_cases
    WHERE Country=p_country
    ORDER BY Date DESC
    LIMIT 1;
    RETURN rate;
END //
DELIMITER ;
