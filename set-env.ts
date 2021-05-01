import { writeFile } from 'fs';

// https://ferie.medium.com/how-to-pass-environment-variables-at-building-time-in-an-angular-application-using-env-files-4ae1a80383c
// https://betterprogramming.pub/how-to-secure-angular-environment-variables-for-use-in-github-actions-39c07587d590
// https://itnext.io/github-actions-hide-and-set-angular-environment-variables-e753d06d16a8

// Configure Angular `environment.ts` file path
const targetPath = './src/environments/environment.prod.ts';
// Load node modules
const colors = require('colors');
// `environment.ts` file structure
const envConfigFile = `export const environment = {
   production: true,
   supabase: {
    url: '${process.env.SUPABASE_URL}',
    apiKey: '${process.env.SUPABASE_ANON_PUBLIC}'
  }
};
`;
console.log(colors.magenta('The file `environment.ts` will be written with the following content: \n'));
console.log(colors.grey(envConfigFile));
writeFile(targetPath, envConfigFile, function (err) {
   if (err) {
       throw console.error(err);
   } else {
       console.log(colors.magenta(`Angular environment.ts file generated correctly at ${targetPath} \n`));
   }
});