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

## 2025-03-17

    $ pnpm setup
    Next configuration changes were made:
    PNPM_HOME=C:\Users\pault\AppData\Local\pnpm
    Path=%PNPM_HOME%;C:\Users\pault\AppData\Local\Programs\oh-my-posh\bin\;%USERPROFILE%\AppData\Local\Microsoft\WindowsApps;C:\Users\pault\AppData\Local\Programs\Microsoft VS Code\bin;C:\Users\pault\AppData\Roaming\npm;

- https://vinayak-hegde.medium.com/building-a-monorepo-with-pnpm-and-turborepo-a-journey-to-efficiency-cfeec5d182f5
- https://github.com/chengchao/nextjs-nestjs-pnpm-turborepo-monorepo-example
- https://nhost.io/blog/how-we-configured-pnpm-and-turborepo-for-our-monorepo
- https://turbo.build/repo/docs


## 2025-02-15

git switch --create feature/ui-app-20250215

- https://www.kochan.io/nodejs/pnpms-strictness-helps-to-avoid-silly-bugs.html
- https://www.testim.io/blog/typescript-unit-testing-101/
- https://solana.stackexchange.com/questions/3551/how-to-solve-typescript-errors-ts2307-cannot-find-module
- https://www.chucksacademy.com/en/topic/typescript-integration/handling-libraries-and-dependencies

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