-- Use Case 27: Optimize Top 10 High Infection Rate Queries

CREATE INDEX idx_country_infection_rate
ON covid_cases (infection_rate, Country);

SELECT Country, infection_rate
FROM covid_cases
ORDER BY infection_rate DESC
LIMIT 10;
