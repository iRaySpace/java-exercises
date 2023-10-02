# 1. Return Types

Rationale:
- To be able to understand the importance of return types

Lessons:
- In order to convert number to any other number types, you can use type cast operator
```java
int five = 5;
float twoPointFive = (float) five / 2.0; // Java is strict and doesn't allow implicit division if different data types, unlike Python. Therefore, `int` five needs to be converted to `float`
```

Objectives:
- Modify `addOne` to accommodate decimal value `1.5`
- Make a variable that accepts decimal value `1.5`
- Make a variable that accepts an integer from `Math.round(1.5)`
- Replace all static inputs `System.out.println` with variables

Acceptance Criteria:
- Results are `System.out.println`ed from variables with the following outputs:
```
0.5
1.5
2
```