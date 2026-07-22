-- Use Case 29: ACID Transaction

START TRANSACTION;

INSERT INTO vaccine_distribution(country, vaccine_name, doses)
VALUES ('India', 'Covaxin', 10000);

INSERT INTO vaccine_distribution(country, vaccine_name, doses)
VALUES ('India', 'Covishield', 15000);

COMMIT;

-- On error:
-- ROLLBACK;
