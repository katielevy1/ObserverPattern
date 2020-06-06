# Observer Pattern
This is an implementation of the observer pattern. 

The Observer pattern is defined as 
```a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.```
 
You can take advantage of [java.util.Observable](https://docs.oracle.com/javase/8/docs/api/java/util/Observable.html) in your own usage of the Observer pattern

### When to use the observer pattern:
- an abstraction has two aspects, one dependent on the other. Encapsulating these aspects in separate objects lets you vary and reuse them independently
- a change to one object requires changing others, and you don't know how many objects need to be changed
- an object should be able to notify other objects without making assumptions about who these objects are. In other words, you don't want these objects tightly coupled

### Resources
[Head First Design Patterns](https://www.oreilly.com/library/view/head-first-design/0596007124/ch02.html)