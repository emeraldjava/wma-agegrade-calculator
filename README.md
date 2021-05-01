# wma-agegrade-calculator

Exposing a WMA age grade calculator using supabase postgres DB.

https://emeraldjava.github.io/wma-agegrade-calculator/

## Notes

http://www.runscore.com/Alan/AgeGrade.html

http://www.howardgrubb.co.uk/athletics/wmalookup06.html

```
For example, the world record for a 53 year old woman running a 10km is 35:01.
So if a 53 year old woman finishes a 10km in 45:18, she has an age-graded
performance of 77.3% (which is 35:01 divided by 45:18).
```

http://www.runningforfitness.org/faq/agegrading

## DB Schema

- Athelete ~200
age
gender

- Record ~ 500
distance
ocSeconds
ocTime
factor
factorSeconds
factorTime

- Result
athelete
record
agerank
minRange - boolean (true if only age range is known. age should be 35, 40 etc)

- ResultDate (1 per day mini, but parkrun/bhaa can link specific results)
name
date
isSpecific boolean

## REST API
list and add results

## Graph
show gragh of last week, with ages, distances and age ranks.


# Mr Data Converter - Excel to Json

https://shancarter.github.io/mr-data-converter/

https://github.com/jbuckner/agegrader/blob/master/agegrader/age_grading_data.json

