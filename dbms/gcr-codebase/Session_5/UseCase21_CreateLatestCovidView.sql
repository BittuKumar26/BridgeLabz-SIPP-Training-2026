-- Use Case 21: Create View for Latest COVID Data
CREATE VIEW LatestCovidData AS
SELECT c.Country, c.Date, c.Confirmed, c.Deaths, c.Recovered
FROM covid_cases c
JOIN (
    SELECT Country, MAX(Date) AS LatestDate
    FROM covid_cases
    GROUP BY Country
) m
ON c.Country = m.Country AND c.Date = m.LatestDate;
