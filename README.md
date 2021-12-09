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
## Open Closed Principle
## Liskov Substitution Principle
## Interface Segregation Principle
## Dependency Inversion Principle
