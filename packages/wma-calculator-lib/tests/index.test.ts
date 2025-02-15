import { handleOperation, Operation } from "../src/index";

test('Operation.add', () => {
    expect(handleOperation(1,2,Operation.add)).toBe(3);
});

test('Operation.subtract', () => {
    expect(handleOperation(5,2,Operation.subtract)).toBe(3);
});
