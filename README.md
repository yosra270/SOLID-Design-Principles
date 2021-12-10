### TP n° 1 en Qualité Logicielle : 

<h1 align="center">
   SOLID Design Principles
</h1>

<p align="center">
   <img height=350 src="https://miro.medium.com/max/1000/1*F_KLJBLZPJlPsZACHmgfCA.png">
</p>

This code implements basic examples of the SOLID object oriented design principles.
<br/>

   - [Why S.O.L.I.D. ?](#why-solid)
   - [Single Responsibility Principle](#single-responsibility-principle)
   - [Open Closed Principle](#open-closed-principle)
   - [Liskov Substitution Principle](#liskov-substitution-principle)
   - [Interface Segregation Principle](#interface-segregation-principle)
   - [Dependency Inversion Principle](#dependency-inversion-principle)

<br/>

## Why SOLID ?
#### What problems are solved or avoided by applying SOLID?

> "SOLID aims at creating understandable, readable, and testable code that many developers can collaboratively work on."
<br/>
  Software may start with a clean and elegant design but over time they become hard to maintain, often requiring costly redesigns. Robert Martin, who's credited with writing down the SOLID principles, points out some symptoms of rotting design due to improperly managed dependencies across modules:

- *Rigidity*: Implementing even a small change is difficult since it's likely to translate into a cascade of changes.
- *Fragility*: Any change tends to break the software in many places, even in areas not conceptually related to the change.
- *Immobility*: We're unable to reuse modules from other projects or within the same project because those modules have lots of dependencies.
- *Viscosity*: When code changes are needed, developers will prefer the easier route even if they break existing design.

Antipatterns and improper understanding of design principles can lead to ***STUPID*** code: ***Singleton***, ***Tight Coupling***, ***Untestability***, ***Premature Optimization***, ***Indescriptive Naming***, and ***Duplication***. SOLID can help developers stay clear of these.

The SOLID principles were developed by Robert C. Martin in a 2000 essay, “Design Principles and Design Patterns,” although the acronym was coined later by Michael Feathers.

  The broad goal of the SOLID principles is to reduce dependencies so that engineers change one area of software without impacting others. Additionally, they’re intended to make designs easier to understand, maintain, and extend. Ultimately, using these design principles makes it easier for software engineers to avoid issues and to build adaptive, effective, and agile software.

  While the principles come with many benefits, following the principles generally leads to writing longer and more complex code. This means that it can extend the design process and make development a little more difficult. However, this extra time and effort is well worth it because it makes software so much easier to maintain, test, and extend.

  Following these principles is not a cure-all and won’t avoid design issues. That said, the principles have become popular because when followed correctly, they lead to better code for readability, maintainability, design patterns, and testability. In the current environment, all developers should know and utilize these principles.

SOLID stands for:

- **S** - Single-responsiblity Principle (**SRP**)
- **O** - Open-closed Principle (**OCP**)
- **L** - Liskov Substitution Principle (**LSP**)
- **I** - Interface Segregation Principle (**ISP**)
- **D** - Dependency Inversion Principle (**DIP**)

<br/>
  While these concepts may seem daunting, they can be easily understood with some simple code examples. In this code, we'll take a deep dive into these principles, with a quick Java example to illustrate each one.

## Single Responsibility Principle

Single-responsibility Principle (***SRP***) states:

> A class should **do one thing** and therefore it should have only a **single reason to change**.


Following the Single Responsibility Principle is important. First of all, because many different teams can work on the same project and edit the same class for different reasons, this could lead to incompatible modules.

Second, it makes version control easier. For example, say we have a persistence class that handles database operations, and we see a change in that file in the GitHub commits. By following the SRP, we will know that it is related to storage or database-related stuff.

Merge conflicts are another example. They appear when different teams change the same file. But if the SRP is followed, fewer conflicts will appear – files will have a single reason to change, and conflicts that do exist will be easier to resolve.

Other benefits may include :

- Testing – A class with one responsibility will have far fewer test cases.
- Lower coupling – Less functionality in a single class will have fewer dependencies.
- Organization – Smaller, well-organized classes are easier to search than monolithic ones.


To illustrate the application of this principle, we will be looking at the code of a simple car management program as well as an employee displaying program as examples. 

First, we will be dealing with an employee class that takes care of defining an employee properties as well as converting them to an HTML format. Having more than one job, this class breaks the SRP which leads us to delegate the formatting job to another class say the EmployeeFormatter class.

Then, we will see a car manager class that takes car of retreaving cars data, formatting those data and analyzing them (rating cars). Therefore, we delegated each job to a new class : CarDao for retreaving the data, CarFormatter fro formatting them and CarAnalyzer fro analyzing those data. So, now the only job that is left for the CarManager is to orchestrate what the others classes do by calling their methods.

## Open Closed Principle

The Open-Closed Principle states :

> “Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.”

The general idea of this principle tells you to write your code so that you will be able to *add new functionality without changing the existing code*. That prevents situations in which a change to one of your classes also requires you to ***adapt all depending classes***. To achieve this goal, one should to use inheritance :

> “A class is closed, since it may be compiled, stored in a library, baselined, and used by client classes. But it is also open, since any new class may use it as parent, adding new features. When a descendant class is defined, there is no need to change the original or to disturb its clients.”

But since inheritance introduces *tight coupling* if the subclasses depend on implementation details of their parent class, the Open/Closed Principle has been redefined to the Polymorphic Open/Closed Principle. It uses *interfaces instead of superclasses* to allow different implementations which one can easily substitute without changing the code that uses them. The interfaces are closed for modifications, and one can provide new implementations to extend the functionality of your software.

The main benefit of this approach is that an interface introduces an additional level of abstraction which enables loose coupling. The implementations of an interface are independent of each other and don’t need to share any code. If one consider it beneficial that two implementations of an interface share some code, it would be possible either to use inheritance or composition.

To illustrate the application of this principle, we will be looking at the code of a simple

## Liskov Substitution Principle

Broadly, this principle simply requires that objects of a superclass shall be replaceable with objects of its subclasses without breaking the application. 

> Let Φ(x) be a property provable about objects x of type T. Then Φ(y) should be true for objects y of type S where S is a subtype of T.

In other words :

> What is wanted here is something like the following substitution property: if for each object O1 of type S there is an object O2 of type T such that for all programs P defined in terms of T, the behavior of P is unchanged when O1 is substituted for O2 then S is a subtype of T.

This is the expected behavior, because when we use inheritance we assume that the child class inherits everything that the superclass has. The child class extends the behavior but never narrows it down.

Therefore, when a class does not obey this principle, it leads to some nasty bugs that are hard to detect.

While this can be a difficult principle to internalize, in a lot of ways it’s simply an extension of open-closed principle, as it’s a way of ensuring that derived classes extend the base class without changing behavior.

Following this principle helps to avoid unexpected consequences of changes and avoids having to open a closed class in order to make changes. It leads to easy extensions of software, and, while it might slow down the development process, following this principle during development can avoid lots of issues during updates and extensions.

## Interface Segregation Principle
## Dependency Inversion Principle
