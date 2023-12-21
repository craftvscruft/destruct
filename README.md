# Destruct
> The un-language

Structural rewrite rules transpiled to multiple languages.

## Example

```
rule1 : { key: [a,...red], ... } => {f:5, ...a, g:7}
      | { key: [a,...red], ... } => {f:5, ...a, g:7};

rule1 : { key: [a,...red], ... } => {f:5, ...a, g:7};

rule2.a.* : {text} => text;
```
*/

## Formatting
./gradlew spotlessAntlr4Apply


# Reading

https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Destructuring_assignment
https://github.com/tc39/proposal-deiter

> This message will self-destruct