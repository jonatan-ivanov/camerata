
# DSL
- https://docs.gradle.org/current/dsl/index.html
- It's a **Groovy DSL** (and Kotlin too since [Gradle 5.0](https://gradle.org/whats-new/gradle-5/))

# Core Types
- Gradle scripts are configuration scripts (they configure objects)
- Gradle uses a software design paradigm called **Convention Over Configuration**
- Script: Contains basic Gradle-specific methods and properties (`Project`, `Gradle`, `Settings`)
- Project: The main configuration API
    - Gradle creates `Project` instance(s) for the `build.gradle` file(s)
    - A collection of `Task`s
- Task: a single atomic piece of work for a build, e.g.: compile
    - List of `Action`s (`doFirst`, `doLast`)
- Action: basically a [`Closure`](http://groovy-lang.org/closures.html)

Demo: `01-inspect.gradle`

# Basic tasks
- `gradle` -> `gradle help`
- `gradle tasks`
- `gradle properties`
- `gradle dependencies`
- `gradle model`
- `gradle projects`
- `gradle buildEnvironment`
- It figures out some typos: `gradle propertie`

# Config syntax
- Property/Setter
- Closure

Demo: `02-setter.gradle`, `03-closure-and-task.gradle`
