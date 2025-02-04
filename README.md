This repository demonstrates two common pitfalls when using Groovy's `each` method:

1. **`each` returns the original collection:**  The `each` method iterates through a collection, but it doesn't modify the collection in place.  If you expect the `each` method to return a transformed collection, this will lead to unexpected results.
2. **Returning from within `each`:** Returning from within the closure passed to `each` does not terminate the iteration of the entire collection. The iteration continues until all elements are processed.

The `bug.groovy` file contains examples showcasing these issues. The `bugSolution.groovy` file provides corrected versions using appropriate methods for transforming collections.