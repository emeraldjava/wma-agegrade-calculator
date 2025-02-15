export declare enum Operation {
    add = 0,
    subtract = 1,
    divide = 2,
    multiply = 3
}
export declare const handleOperation: (num1: number, num2: number, operation: Operation) => number;
