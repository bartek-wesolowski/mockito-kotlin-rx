package io.github.mockitokotlinrx

import io.reactivex.rxjava3.core.Maybe
import org.mockito.stubbing.OngoingStubbing

fun <T: Any> OngoingStubbing<Maybe<T>>.thenReturnJust(item: T): OngoingStubbing<Maybe<T>> {
    return thenReturn(Maybe.just(item))
}

fun <T: Any> OngoingStubbing<Maybe<T>>.thenReturnEmpty(): OngoingStubbing<Maybe<T>> {
    return thenReturn(Maybe.empty())
}

fun <T: Any> OngoingStubbing<Maybe<T>>.thenReturnError(throwable: Throwable): OngoingStubbing<Maybe<T>> {
    return thenReturn(Maybe.error(throwable))
}

fun <T: Any> OngoingStubbing<Maybe<T>>.thenReturnNever(): OngoingStubbing<Maybe<T>> {
    return thenReturn(Maybe.never())
}

infix fun <T: Any> OngoingStubbing<Maybe<T>>.doReturnJust(item: T): OngoingStubbing<Maybe<T>> {
    return thenReturnJust(item)
}

fun <T: Any> OngoingStubbing<Maybe<T>>.doReturnEmpty(): OngoingStubbing<Maybe<T>> {
    return thenReturn(Maybe.empty())
}

infix fun <T: Any> OngoingStubbing<Maybe<T>>.doReturnError(throwable: Throwable): OngoingStubbing<Maybe<T>> {
    return thenReturnError(throwable)
}

fun <T: Any> OngoingStubbing<Maybe<T>>.doReturnNever(): OngoingStubbing<Maybe<T>> {
    return thenReturn(Maybe.never())
}