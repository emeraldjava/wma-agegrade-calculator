import { generateSchemaTypes } from "@openapi-codegen/typescript";
import { defineConfig } from "@openapi-codegen/cli";
export default defineConfig({
  wmaAgeGrade: {
    from: {
      relativePath: "./openapi/wmaAgeGrade.yaml",
      source: "file",
    },
    outputDir: "./src",
    to: async (context) => {
      await generateSchemaTypes(context, {
        filenamePrefix: "wmaAgeGrade",
      });
    },
  },
});
