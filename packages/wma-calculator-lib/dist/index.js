"use strict";
//import { Operation } from './types';
Object.defineProperty(exports, "__esModule", { value: true });
exports.handleOperation = exports.Operation = void 0;
// the supported operations
// from https://thriveread.com/create-monorepos-with-pnpm-workspaces/
var Operation;
(function (Operation) {
    Operation[Operation["add"] = 0] = "add";
    Operation[Operation["subtract"] = 1] = "subtract";
    Operation[Operation["divide"] = 2] = "divide";
    Operation[Operation["multiply"] = 3] = "multiply";
})(Operation || (exports.Operation = Operation = {}));
// the function to handle the arithmetic operation
var handleOperation = function (num1, num2, operation) {
    if (operation == Operation.add) {
        return num1 + num2;
    }
    else if (operation == Operation.subtract) {
        return num1 - num2;
    }
    else if (operation == Operation.divide) {
        return num1 / num2;
    }
    else {
        return num1 * num2;
    }
};
exports.handleOperation = handleOperation;
