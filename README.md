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

## 2025-02-15

git switch --create feature/ui-app-20250215

## 2025-02-14

- https://thriveread.com/create-monorepos-with-pnpm-workspaces/

## 2025-02-12

setup of esm vs commonjs builds

- https://thesametech.com/how-to-build-typescript-project/
- https://docs.astro.build/en/reference/publish-to-npm/
- https://docs.astro.build/en/guides/integrations-guide/react/

## 2025-02-11

- https://www.squash.io/how-to-add-a-dev-dependency-with-pnpm/
- https://codingforseo.com/blog/mjs-vs-cjs-files/

## 2025-02-09

- https://medium.com/hike-medical/ditching-yarn-creating-a-monorepo-with-pnpm-workspaces-6fa7e3bfe19c
- https://github.com/Hike-Medical/engineering-blog/tree/main/pnpm-monorepo
- https://github.com/bakeruk/modern-typescript-monorepo-example/tree/main