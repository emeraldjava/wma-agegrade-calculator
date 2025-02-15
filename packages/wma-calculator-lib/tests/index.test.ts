//import { Operation } from "../src/types";
import { handleOperation, Operation } from "../src/index";
import { describe, it, expect } from "@jest/globals";

test('Operation.add', () => {
    expect(handleOperation(1,2,Operation.add)).toBe(3);
});

test('Operation.subtract', () => {
    expect(handleOperation(5,2,Operation.subtract)).toBe(3);
});
