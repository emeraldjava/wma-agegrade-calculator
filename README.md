# wma-agegrade-calculator

![GitHub CI](https://github.com/emeraldjava/wma-agegrade-calculator/actions/workflows/build.yml/badge.svg)

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

- Athlete ~200
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
athlete
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
show graph of last week, with ages, distances and age ranks.


# Mr Data Converter - Excel to Json

https://shancarter.github.io/mr-data-converter/

https://github.com/jbuckner/agegrader/blob/master/agegrader/age_grading_data.json

## 2025-04-16

### types

- https://blog.angular-university.io/typescript-2-type-system-how-do-type-definitions-work-in-npm-when-to-use-types-and-why-what-are-compiler-opt-in-types/

### process manager

    npx kill-port 3000

- https://stackoverflow.com/questions/39322089/node-js-port-3000-already-in-use-but-it-actually-isnt
- https://pm2.keymetrics.io/docs/usage/quick-start/
- https://medium.com/@s.atmaramani/node-js-process-managers-tools-detailed-comparision-for-ex-a7ca813b7e8b

- https://stackoverflow.com/questions/77232531/run-of-a-next-js-app-stuck-npm-run-dev-doesnt-work
- https://jsupskills.dev/next-js-15-folder-structure-best-practices/
- https://www.wisp.blog/blog/the-ultimate-guide-to-organizing-your-nextjs-15-project-structure

## 2025-03-17

nest setup

- https://docs.nestjs.com/

cli setup

- https://blog.logrocket.com/building-typescript-cli-node-js-commander/
- https://oclif.io/docs/introduction.html

Turbo Setup

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