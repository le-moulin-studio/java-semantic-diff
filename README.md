# Introduction

This is an early experiment about Semantic Diff for the Java language.
Our goal is to integrate it into NetBeans once it is finished.

# What semantic diff is

It is a diff between multiple files, where the differences are expressed with criteria
which are related to the file content's semantic.

Examples of semantic differences:

- A new function has been introduced into a class.
- A new function call was added into a block of code.
- The 2nd parameter of a function call was modified.
- A class inherits from a different class.
- A function was moved to a super class.

Examples of differences which are not semantical:

- A method have been re-indented.
- A new line was added into a piece of code which was too long.
- A function was moved to a different location inside the same class.
- A local variable was renamed.

# Why it is cool

## Ignoring irrelevant changes

When developers want to review a commit, they use a diff tool.
Sometimes, they don't want to list all the details which do not change the
behavior of a program, and they only want to see changes that matter.
A semantic diff can help them to select which type of changes they think matter,
and help them save some time by ignoring the unimportant changes.

## Ignoring irrelevant **conflicts**

Another reason why a semantic diff can be cool is when you have to merge 2 branches
together in your code. A classical diff tool might reveal conflicts on lines
being modified on each branch, while a semantic diff might be able to see the changes
from a different angle and still be able to merge them if their semantic doesn't
conflict which each other.

For example:

- There is a section of code which was modified on both `branch A` and `branch B`.
- On `branch A`, the change is just a code formatting change.
- On `branch B`, the change is a variable which was renamed.
- The semantic diff doesn't detect semantic conflict and a semantic merge tool
  can merge the changes without bothering the developer.

# License

This project is distributed under the Affero General Public License (AGPL) version 3.
The license's terms are defined in the file LICENSE.txt.
For information about our license choice: [Why Affero GPL](http://www.gnu.org/licenses/why-affero-gpl.html).

# Original Developers

David Andreoletti & Vincent Cantin

# Contributions

Contributions are welcome, do not hesitate to create an issue and/or start a pull request.

