# Important notes

- When you create an Interface, you create a point in code where will all changes occure. It is very important, because if some code needs to be changed, you need to work only with some class that will be changed and with its Interface, instead of changing every class that uses it

# Creational

- Factory Method - when you have 2 or more groups of classes that are same in what they do, but different in their realisations (button for a mac, button for a linux, text field fot a mac, text field for a linux) and you need to decide which group of them to use at the runtime. And the most important thing: you have 2 ways when the changes: either you will create new Groups of Classes or new Class3, Class4, etc. This pattern is a good one when you want to add new Class3, Class4. If you want to add new Groups of Classes - it will be a horrible one! If you want to add new Groups of Classes - you need to choose Abstract Factory Pattern
    ```Rust
         Today                     Tomorrow

    Group1    Group2           Group1    Group2
    ------    ------           ------    ------
    Class1    Class1           Class1    Class1
    Class2    Class2           Class2    Class2
                               Class3    Class3
                               Class4    Class4
    ```

- Abstract Factory - when you have 2 or more groups of classes that are same in what they do, but different in their realisations (button for a mac, button for a linux, text field fot a mac, text field for a linux) and you need to decide which group of them to use at the runtime. And the most important thing: you have 2 ways when the changes: either you will create new Groups of Classes or new Class3, Class4, etc. This pattern is a good one when you want to add new Groups of classes. If you want to add Class3, Class4 - it will be a horrible one! If you want to add Class3, Class4 - you need to choose Factory Method Pattern
    ```Rust
          Today                          Tomorrow
    
    Group1    Group2           Group1    Group2    Group3    Group4
    ------    ------           ------    ------    ------    ------
    Class1    Class1           Class1    Class1    Class1    Class1
    Class2    Class2           Class2    Class2    Class2    Class2
    ```

- Builder - when there is some `Class_With_A_Lot_Of_Variables` - to handle this, you can create a `Builder_Class` that have different funcitons to set all of variables. In a modern Java world lombok will do it for you.

- Prototype - in Java it just means to implement `Cloneable` interface and override `clone()` method.

- Singleton - when you need to be shure that there is only 1 instance of `Singleton_Class`. The best way to do this is via `Enum`. But this way will not work if you need to extend your singleton from some parent class.





# Structural

- Adapter - it has 3 main reasons to use:
    - when you have 2 or more `ClassThatCannotBeChanged` that you can't change (because they are final or because they are already too big), but you want to change them
    - when you have 2 or more classes that need to implement some common interface, but they are not AND they cannot be changed
    - when you have 2 or more very annoing classes (because to do a simple thing they call a lot of methods or because author of these classes often changes them and these changes break your code)
    ```Rust
                 Before                              After

    AnnoingClassThatCannotBeChanged1              LovelyInterface===>LovelyClass1====>AnnoingClassThatCannotBeChanged1
    AnnoingClassThatCannotBeChanged2                            "===>LovelyClass2====>AnnoingClassThatCannotBeChanged2
    ```

- Proxy - has 2 main reasons to use:
    - when you have a class that cannot be changed, but you don't want for somebody to directly call methods or get/set fields of original class (for example, when you add caching)
    - when you have a class that cannot be changed, but you need to add something new at the compile time (e.g. that wlill not be changed while program is running) to it
    ```Rust
       Before                             After

    OldClass                InterfaceForOldClass====>ProxyWithNewFeatures- - [calls].
                                             "====>OldClass< - - - - - - - - - - -'
    ```

- Decorator - when you want to control flow of some method at the runtime.

- Bridge - If there are 2 groups of classes, and both `Group1Class1` and `Group1Class2` may call either `Group2Class1` or `Group2Class2`
    ```Rust
                 Before                                             After

    Group1Class1 -[calls]- >Group2Class1<-.            Group1Class1-[calls]-                                         Group2Class1
                `-[calls]- >Group2Class2  :                                  \                                        ||
                                 ^        :                                   AbstractGroup1-[calls]->AbstractGroup2==++
                                 :        :                                  /                                        ||
    Group1Class2- [calls]- - - - '        :            Group1Class2-[calls]-                                         Group2Class2
                `-[calls]- - - - - - - - -'
    ```

- Composite has 2 main purposes:
    - For working with Tree Data Structures 
    - Sometimes you have a lot of `Some_Class` instances that should run some `important_function ()` either together, by groups or one by one. You can create `ArrayList_Of_ArrayLists_And_Some_Class_Instances` that will contains of single `Some_Class` instances and other `ArrayList_Of_ArrayLists_And_Some_Class_Instances`.

- Facade - Adapter, but for a lot of classes

- Flyweight - Sometimes there is a `Big_Class` that have a lot of variables that is common between its instances. You can create a `Class_For_Common_Variables` that will keep them.





# Behavioral

- Chain Of responsibility - 2 main purposes:
    - Method that uses a lot of if-then-else or switch checkers. You can divide that method by creating an `Abstract_Checker_Class` and `Cheacker_Class`es that will handle this long check one by one
    - You need to create if-the-else check that may change in a RunTime

- Command - Sometimes you need to queue methods, or handle undo/redo for methods, or you want to different classes to perform same operations (for example a clicking on a button and pressing a key on a keyboard should run same method) - then you can create a `Function_Handler_Class` that will wrap some method and then you need to create an `Invoker` class that will run a method based on given `Funciton_Handler_Class`.

- Iterator - Simply creating a custon `Iterator_Class` for some Colleciton. What is good about it: to work with some big Collection, you don't need to create a copy of it (and it makes possible to work with the very large Collections. Without Iterator you can't do it)

- Interpreter - it is used when you need to create a system where a user may customize what a program do.

- Mediator - Sometimes you need to create some `Class1`, each instance of which has a `desired_function ()` in itself, and each instance of which can run `desired_function ()` within other functions. To handle this, you can create an `ArrayList_Of_Class1_Instances` that will keep track of added `Class1` instances and that will allow each instance of `Class1` to run `desired_funciton ()` in other `Class1` instances.

- Memento - Sometimes you want to safe the state of the instance of `Some_Class` - to handle this, you can create a `Snapshot_Class` that will save the snapshot of `Soeme_Class`'s variables.

- Observer - When you need one group of instances of some classes (and that set of instances of some classes often changes at a Runtime: new ones is created and other deleted), to notify another set of classes, that also changes at the Runtime.

- State - Sometimes you need to create a finite-state machine (for example, a traffic light) - to handle this, you can create a `Contex_Class` that has a variable for `Concrete_State`s. It is similar to the Strategy Design Pattern, but in the State Design Pattern, the `State_Class`es know about each other and `Context_Class` sometimes can't switch from one state to another.

- Strategy - Sometimes you need a function that can perform different actions. To handle this, you can create a `Functional_Interface1`. Then you need to create some `Functional_Class`es that will implement `Funcitonal_Interface1`. And then you need to create a `Function1_Executor_Class` that will change `function1 ()` based on given `Functional_Class`.

- Template Method - when you have 2 or more classes that have a lot of a common in their methods.

- Visitor:
    - You will often change similar methods for some group of classes, but adding or removing methods is not easy.
    - Sometimes you have a lot of `Some_Class`es and you want to treat them differently with 1 object. To handle this, you need to create a new `Interface_For_Dealing_With_Visitor` and all classes that implement it, can deals with an `Visitor_Class` that will treat them differently.
