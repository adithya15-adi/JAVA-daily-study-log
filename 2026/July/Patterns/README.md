# Day 3 - 23-July-2026

## Topic Covered
### Pattern Printing (Practice)

## Concepts Learned
- Nested Loops
- Row and Column Relationships
- Pattern Logic
- Formula-Based Pattern Design
- Dry Run and Trace of Pattern Programs

## Programs Implemented
1. Solid Rectangle
2. Same Number in Each Row
3. Numbers in Each Row
4. Half Pyramid
5. Pyramid (Without Leading Spaces)
6. Inverted Half Pyramid
7. Inverted Pyramid (Odd Number of Stars)
8. Even Inverted Pyramid

## Pattern Formulas Learned

| Pattern | Formula |
|---------|---------|
| Solid Rectangle | `j <= n` |
| Same Number Pattern | `j <= n` |
| Number Pattern | `j <= n` |
| Half Pyramid | `j <= i` |
| Pyramid | `j <= 2*i - 1` |
| Inverted Half Pyramid | `j <= n - i + 1` |
| Inverted Pyramid | `j <= 2*(n - i) + 1` |
| Even Inverted Pyramid | `j <= 2*(n - i) + 2` |

## Key Learnings
- Understood how the outer loop controls rows.
- Understood how the inner loop controls columns.
- Learned to derive formulas instead of memorizing code.
- Practiced tracing pattern execution step by step.
- Improved understanding of nested loops.

## Achievement
- Successfully implemented 8 different pattern programs.
- Learned the mathematical formulas behind each pattern.
- Built a strong foundation for advanced pattern problems.

## Progress
- Java Basics
- Functions & Methods
- Pattern Printing (Practice)
- Advanced Patterns (Next)

## Next Goal
- Hollow Rectangle
- Inverted & Rotated Half Pyramid
- Inverted Half Pyramid with Numbers
- Floyd's Triangle

## Reflection
Today I practiced eight different pattern programs using nested loops.
Instead of memorizing the solutions, I focused on understanding the relationship between rows, columns, and the number of characters printed in each row. 
I also learned how to derive pattern formulas, which will help me solve more advanced pattern questions and strengthen my problem-solving skills.



# Day 4 - 24 July 2026

## Topic Covered
### Advanced Patterns (Session 2)

## Concepts Learned
- Pattern Formula Derivation
- Separating Space and Star Logic
- Nested Loops for Pattern Problems
- Right Half Pyramid
- Inverted Right Half Pyramid
- Full Pyramid (Equilateral Triangle)
- Inverted Full Pyramid
- Half Diamond Pattern
- Diamond Pattern Logic

## Pattern Formulas

| Pattern | Spaces | Stars |
|---------|--------|--------|
| Right Half Pyramid | `n - i` | `i` |
| Inverted Right Half Pyramid | `i - 1` | `n - i + 1` |
| Full Pyramid | `n - i` | `2*i - 1` |
| Inverted Full Pyramid | `i - 1` | `2*(n - i) + 1` |
| Half Diamond | `0` | `i` then `n - i` |
| Diamond | `n - i`, then `i` | `2*i - 1`, then `2*(n - i) - 1` |

## Programs Implemented
- Right Half Pyramid
- Inverted Right Half Pyramid
- Full Pyramid
- Inverted Full Pyramid
- Half Diamond
- Diamond Pattern

## Key Learnings
- Every pattern can be broken into two separate parts:
  1. Space Loop
  2. Star Loop
- The outer loop controls rows.
- The inner loops control spaces and stars.
- Deriving formulas makes solving new pattern problems much easier.

## Formula Cheat Sheet

- Right Half Pyramid → Spaces = `n - i`, Stars = `i`
- Inverted Right Half Pyramid → Spaces = `i - 1`, Stars = `n - i + 1`
- Full Pyramid → Spaces = `n - i`, Stars = `2*i - 1`
- Inverted Full Pyramid → Spaces = `i - 1`, Stars = `2*(n - i) + 1`
- Diamond → Combine Full Pyramid + Inverted Full Pyramid

## Achievement
- Learned formula-based pattern solving.
- Implemented six important pattern programs.
- Improved nested loop logic.
- Built a reusable pattern formula cheat sheet.

## Progress
- Java Basics
- Functions & Methods
- Advanced Patterns (In Progress)

##  Next Goal
- Hollow Rectangle
- Floyd's Triangle
- 0-1 Triangle
- Butterfly Pattern
- Solid Rhombus
- Hollow Rhombus


## Reflection
Today I focused on understanding the logic behind pattern problems instead of memorizing solutions. 
I learned to separate every pattern into space and star loops, derive formulas for each row, and implement multiple pyramid and diamond patterns using nested loops. 
This strengthened my problem-solving skills and prepared me for more advanced pattern questions.
