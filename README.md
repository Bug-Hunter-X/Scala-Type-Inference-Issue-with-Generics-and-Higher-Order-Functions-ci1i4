# Scala Type Inference Bug

This repository demonstrates a subtle Scala bug related to type inference with generics and higher-order functions.  The original code may fail to compile or produce unexpected results if the compiler cannot properly deduce the type of the lambda expression's input. The solution provides a way to explicitly type the input argument within the lambda to fix the issue.

## Bug Description
The problem originates from the `myMethod` function in the `MyClass` class.  This method accepts a function (`T => String`) and applies it to the generic `value` field. In certain scenarios, especially if `T` is not a primitive type, the compiler might struggle to infer the correct type of the lambda expression's parameter, leading to compilation errors or runtime exceptions.

## Solution
The solution involves explicitly specifying the type of the lambda expression's argument to guide the compiler in its type inference.