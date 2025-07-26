> ✅ The issue has been fixed in version `2.5.6` of [JSONata4Java](https://github.com/IBM/JSONata4Java)

## How to reproduce

Open [src/test/java/TestOrderBy.java](src/test/java/TestOrderBy.java)

Execute tests in `TestOrderBy` class:

* The `testOrderByShouldSortAscending` test will succeed
* The `testOrderByShouldSortDescending` test will fail

Expressions used for sorting:

* `Email^(type)`
* `Email^(>type)`

The syntax seems correct according to this unit test:

[src/test/java/com/api/jsonata4java/test/expressions
/OpOrderByTest.java](https://github.com/IBM/JSONata4Java/blob/master/src/test/java/com/api/jsonata4java/test/expressions/OpOrderByTest.java)
