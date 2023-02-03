Mockito-Kotlin-Rx
===================

![build](https://github.com/bartek-wesolowski/mockito-kotlin-rx/actions/workflows/build.yml/badge.svg)
[![](https://jitpack.io/v/bartek-wesolowski/mockito-kotlin-rx.svg)](https://jitpack.io/#bartek-wesolowski/mockito-kotlin-rx)

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
Add [JitPack][jitpack] to the repository list:

```groovy
allprojects {
  repositories {
    ...

    maven { url 'https://jitpack.io' }
}
```

```kotlin
implementation("com.github.bartek-wesolowski:mockito-kotlin-rx:1.0.0")
```

[mockito-kotlin]: https://github.com/mockito/mockito-kotlin
[jitpack]: https://jitpack.io/#bartek-wesolowski/customizable-okhttp-logging-interceptor
