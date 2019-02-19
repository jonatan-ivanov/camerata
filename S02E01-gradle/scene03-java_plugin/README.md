# Basics
- [`Build Init Plugin`](https://docs.gradle.org/current/userguide/build_init_plugin.html)
- [`The Gradle Wrapper`](https://docs.gradle.org/current/userguide/gradle_wrapper.html)
- `alias gradlew='./gradlew'` :smiling_imp:
- `gradlew -version`
- `gradlew tasks`
- `gradlew properties`
- `gradlew dependencies`
- `gradlew model`
- `gradlew projects`
- `gradlew buildEnvironment`

# Basic Plugins
- [The Java Plugin](https://docs.gradle.org/current/userguide/java_plugin.html)
- Layout
- Source sets
- Tasks
- [Dependencies](https://docs.gradle.org/current/userguide/managing_dependency_configurations.html#managing_dependency_configurations)
- `gradlew clean assemble`
- `gradlew test`
- `gradlew check`
- `gradlew clean build`
- `gradlew javadoc`
- [The Java Library Plugin](https://docs.gradle.org/current/userguide/java_library_plugin.html)
- [The Java Platform Plugin](https://docs.gradle.org/current/userguide/java_platform_plugin.html)
- [The Application Plugin](https://docs.gradle.org/current/userguide/application_plugin.html)
  - `gradlew clean run`
- [The Distribution Plugin](https://docs.gradle.org/current/userguide/distribution_plugin.html)
  - `gradlew clean assemble` (`assembleDist`)
- [The IDEA Plugin](https://docs.gradle.org/current/userguide/idea_plugin.html)
  - `gradlew clean assemble openIdea`
  - `gradlew clean cleanIdea cleanIdeaWorkspace`
  - Hack: `gradlew cleanAll`
- [The Project Report Plugin](https://docs.gradle.org/current/userguide/project_report_plugin.html)
  - `gradlew projectReport`
- [The Build Dashboard Plugin](https://docs.gradle.org/current/userguide/build_dashboard_plugin.html)
  - `gradlew clean build projectReport`

# Other Topics
- [Dependency Locking](https://docs.gradle.org/current/userguide/dependency_locking.html)
  - `gradlew resolveAndLockAll --write-locks`
  - [Netflix Nebula Gradle Dependency Lock Plugin](https://github.com/nebula-plugins/gradle-dependency-lock-plugin)
- [Multi-Project Builds](https://docs.gradle.org/current/userguide/multi_project_builds.html)