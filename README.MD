Mockito-Kotlin-Rx
===================

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.bartek-wesolowski/mockito-kotlin-rx/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.bartek-wesolowski/mockito-kotlin-rx)
![build](https://github.com/bartek-wesolowski/mockito-kotlin-rx/actions/workflows/build.yml/badge.svg)

A small library that provides helper functions to work with RxJava and Mockito in Kotlin.

Example usages
--------
The following function calls from [Mockito-Kotlin][mockito-kotlin] can now be simplified.
```kotlin
whenever(mock.getStringObservable()).thenReturn(Observable.just("text")) // Mockito-Kotlin
whenever(mock.getStringObservable()).thenReturnJust("text") // Mockito-Kotlin-Rx

whenever(mock.getStringObservable()).thenReturn(Observable.just("text1", "text2", "text3")) // Mockito-Kotlin
whenever(mock.getStringObservable()).thenReturnJust("text1", "text2", "text3") // Mockito-Kotlin-Rx

whenever(mock.getStringObservable()).thenReturn(Observable.empty()) // Mockito-Kotlin
whenever(mock.getStringObservable()).thenReturnEmpty() // Mockito-Kotlin-Rx

whenever(mock.getStringObservable()).thenReturn(Observable.never()) // Mockito-Kotlin
whenever(mock.getStringObservable()).thenReturnNever() // Mockito-Kotlin-Rx

whenever(mock.getStringObservable()).thenReturn(Observable.error(IOException())) // Mockito-Kotlin
whenever(mock.getStringObservable()).thenReturnError(IOException()) // Mockito-Kotlin-Rx

val mock = mock<MyClass> {
    on { getStringObservable() } doReturn Observable.just("text") // Mockito-Kotlin
    on { getStringObservable() } doReturnJust "text" // Mockito-Kotlin-Rx

    on { getStringObservable() } doReturn Observable.just("text1", "text2", "text3") // Mockito-Kotlin
    on { getStringObservable() }.doReturnJust("text1", "text2", "text3") // Mockito-Kotlin-Rx
    
    on { getStringObservable() } doReturn Observable.empty() // Mockito-Kotlin
    on { getStringObservable() }.doReturnEmpty() // Mockito-Kotlin-Rx
    
    on { getStringObservable() } doReturn Observable.never() // Mockito-Kotlin
    on { getStringObservable() }.doReturnNever() // Mockito-Kotlin-Rx
    
    on { getStringObservable() } doReturn Observable.error(IOException()) // Mockito-Kotlin
    on { getStringObservable() } doReturnError IOException() // Mockito-Kotlin-Rx
}
```
Similar helper functions are available for Flowables, Singles, and Maybes.

Installation
--------
Mockito-Kotlin-Rx is available on Maven Central. Add the following to your `build.gradle`/`build.gradle.kts` file:
#### Groovy DSL
```groovy
testImplementation "io.github.bartek-wesolowski:mockito-kotlin-rx:2.0.0"
```

#### Kotlin DSL
```kotlin
testImplementation("io.github.bartek-wesolowski:mockito-kotlin-rx:2.0.0")
```

[mockito-kotlin]: https://github.com/mockito/mockito-kotlin
