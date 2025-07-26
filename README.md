> ✅ The issue has been fixed in version `2.5.6` of [JSONata4Java](https://github.com/IBM/JSONata4Java)

## How to reproduce

Open [src/test/java/TestOrderBy.java](src/test/java/TestOrderBy.java)

Execute tests in `TestOrderBy` class:

* The `testOrderByShouldSortAscending` test will succeed
* The `testOrderByShouldSortDescending` test will fail (refer to commit [858e619](https://github.com/JCCorreale/jsonata4java-orderby-issue/commit/858e619ab58d7bf33681b8317f2eeba890f4d708))

Expressions used for sorting:

* `Email^(type)`
* `Email^(>type)`

The syntax seems correct according to this unit test:

[src/test/java/com/api/jsonata4java/test/expressions
/OpOrderByTest.java](https://github.com/IBM/JSONata4Java/blob/master/src/test/java/com/api/jsonata4java/test/expressions/OpOrderByTest.java)
