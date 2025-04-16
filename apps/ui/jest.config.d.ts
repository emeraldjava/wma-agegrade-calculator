export let preset: string;
export let testEnvironment: string;
export let transform: {
    '^.+\\.tsx?$': string;
};
export let moduleFileExtensions: string[];
export let testPathIgnorePatterns: string[];
export let setupFilesAfterEnv: string[];
