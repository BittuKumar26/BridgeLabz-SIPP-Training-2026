-- Use Case 28: Analyze Query Execution Plans

EXPLAIN
SELECT c.Country, v.total_vaccinations
FROM covid_cases c
JOIN vaccine_data v
ON c.Country = v.Country
WHERE c.Date = '2025-01-01';
