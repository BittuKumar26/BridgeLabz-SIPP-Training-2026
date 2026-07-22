-- Use Case 22: Mortality Rate Function
DELIMITER //
CREATE FUNCTION CalculateMortalityRate(
    p_country VARCHAR(100),
    p_date DATE
)
RETURNS DECIMAL(10,2)
DETERMINISTIC
BEGIN
    DECLARE rate DECIMAL(10,2);
    SELECT (Deaths/Confirmed)*100
    INTO rate
    FROM covid_cases
    WHERE Country=p_country AND Date=p_date;
    RETURN rate;
END //
DELIMITER ;
