package com.bartoszwesolowski.mockitokotlinrx

import io.reactivex.rxjava3.core.Single
import org.mockito.stubbing.OngoingStubbing

fun <T: Any> OngoingStubbing<Single<T>>.thenReturnJust(item: T): OngoingStubbing<Single<T>> {
    return thenReturn(Single.just(item))
}

fun <T: Any> OngoingStubbing<Single<T>>.thenReturnError(throwable: Throwable): OngoingStubbing<Single<T>> {
    return thenReturn(Single.error(throwable))
}

fun <T: Any> OngoingStubbing<Single<T>>.thenReturnNever(): OngoingStubbing<Single<T>> {
    return thenReturn(Single.never())
}

infix fun <T: Any> OngoingStubbing<Single<T>>.doReturnJust(item: T): OngoingStubbing<Single<T>> {
    return thenReturnJust(item)
}

infix fun <T: Any> OngoingStubbing<Single<T>>.doReturnError(throwable: Throwable): OngoingStubbing<Single<T>> {
    return thenReturnError(throwable)
}

fun <T: Any> OngoingStubbing<Single<T>>.doReturnNever(): OngoingStubbing<Single<T>> {
    return thenReturn(Single.never())
}