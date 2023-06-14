package io.github.mockitokotlinrx

import io.reactivex.rxjava3.core.Observable
import org.mockito.kotlin.doReturnConsecutively
import org.mockito.stubbing.OngoingStubbing

fun <T: Any> OngoingStubbing<Observable<T>>.thenReturnJust(item: T): OngoingStubbing<Observable<T>> {
    return thenReturn(Observable.just(item))
}

fun <T: Any> OngoingStubbing<Observable<T>>.thenReturnJust(item: T, vararg items: T): OngoingStubbing<Observable<T>> {
    return doReturnConsecutively(listOf(Observable.just(item)) + items.map { Observable.just(it) })
}

fun <T: Any> OngoingStubbing<Observable<T>>.thenReturnJust(item1: T, item2: T): OngoingStubbing<Observable<T>> {
    return thenReturn(Observable.just(item1, item2))
}

fun <T: Any> OngoingStubbing<Observable<T>>.thenReturnJust(item1: T, item2: T, item3: T): OngoingStubbing<Observable<T>> {
    return thenReturn(Observable.just(item1, item2, item3))
}

fun <T: Any> OngoingStubbing<Observable<T>>.thenReturnJust(item1: T, item2: T, item3: T, item4: T): OngoingStubbing<Observable<T>> {
    return thenReturn(Observable.just(item1, item2, item3, item4))
}

fun <T: Any> OngoingStubbing<Observable<T>>.thenReturnJust(item1: T, item2: T, item3: T, item4: T, item5: T): OngoingStubbing<Observable<T>> {
    return thenReturn(Observable.just(item1, item2, item3, item4, item5))
}

fun <T: Any> OngoingStubbing<Observable<T>>.thenReturnJust(item1: T, item2: T, item3: T, item4: T, item5: T, item6: T): OngoingStubbing<Observable<T>> {
    return thenReturn(Observable.just(item1, item2, item3, item4, item5, item6))
}

fun <T: Any> OngoingStubbing<Observable<T>>.thenReturnJust(item1: T, item2: T, item3: T, item4: T, item5: T, item6: T, item7: T): OngoingStubbing<Observable<T>> {
    return thenReturn(Observable.just(item1, item2, item3, item4, item5, item6, item7))
}

fun <T: Any> OngoingStubbing<Observable<T>>.thenReturnJust(item1: T, item2: T, item3: T, item4: T, item5: T, item6: T, item7: T, item8: T): OngoingStubbing<Observable<T>> {
    return thenReturn(Observable.just(item1, item2, item3, item4, item5, item6, item7, item8))
}

fun <T: Any> OngoingStubbing<Observable<T>>.thenReturnJust(item1: T, item2: T, item3: T, item4: T, item5: T, item6: T, item7: T, item8: T, item9: T): OngoingStubbing<Observable<T>> {
    return thenReturn(Observable.just(item1, item2, item3, item4, item5, item6, item7, item8, item9))
}

fun <T: Any> OngoingStubbing<Observable<T>>.thenReturnJust(item1: T, item2: T, item3: T, item4: T, item5: T, item6: T, item7: T, item8: T, item9: T, item10: T): OngoingStubbing<Observable<T>> {
    return thenReturn(Observable.just(item1, item2, item3, item4, item5, item6, item7, item8, item9, item10))
}

fun <T: Any> OngoingStubbing<Observable<T>>.thenReturnEmpty(): OngoingStubbing<Observable<T>> {
    return thenReturn(Observable.empty())
}

fun <T: Any> OngoingStubbing<Observable<T>>.thenReturnError(throwable: Throwable): OngoingStubbing<Observable<T>> {
    return thenReturn(Observable.error(throwable))
}

fun <T: Any> OngoingStubbing<Observable<T>>.thenReturnNever(): OngoingStubbing<Observable<T>> {
    return thenReturn(Observable.never())
}

infix fun <T: Any> OngoingStubbing<Observable<T>>.doReturnJust(item: T): OngoingStubbing<Observable<T>> {
    return thenReturnJust(item)
}

fun <T: Any> OngoingStubbing<Observable<T>>.doReturnJust(item1: T, item2: T): OngoingStubbing<Observable<T>> {
    return thenReturnJust(item1, item2)
}

fun <T: Any> OngoingStubbing<Observable<T>>.doReturnJust(item1: T, item2: T, item3: T): OngoingStubbing<Observable<T>> {
    return thenReturnJust(item1, item2, item3)
}

fun <T: Any> OngoingStubbing<Observable<T>>.doReturnJust(item1: T, item2: T, item3: T, item4: T): OngoingStubbing<Observable<T>> {
    return thenReturnJust(item1, item2, item3, item4)
}

fun <T: Any> OngoingStubbing<Observable<T>>.doReturnJust(item1: T, item2: T, item3: T, item4: T, item5: T): OngoingStubbing<Observable<T>> {
    return thenReturnJust(item1, item2, item3, item4, item5)
}

fun <T: Any> OngoingStubbing<Observable<T>>.doReturnJust(item1: T, item2: T, item3: T, item4: T, item5: T, item6: T): OngoingStubbing<Observable<T>> {
    return thenReturnJust(item1, item2, item3, item4, item5, item6)
}

fun <T: Any> OngoingStubbing<Observable<T>>.doReturnJust(item1: T, item2: T, item3: T, item4: T, item5: T, item6: T, item7: T): OngoingStubbing<Observable<T>> {
    return thenReturnJust(item1, item2, item3, item4, item5, item6, item7)
}

fun <T: Any> OngoingStubbing<Observable<T>>.doReturnJust(item1: T, item2: T, item3: T, item4: T, item5: T, item6: T, item7: T, item8: T): OngoingStubbing<Observable<T>> {
    return thenReturnJust(item1, item2, item3, item4, item5, item6, item7, item8)
}

fun <T: Any> OngoingStubbing<Observable<T>>.doReturnJust(item1: T, item2: T, item3: T, item4: T, item5: T, item6: T, item7: T, item8: T, item9: T): OngoingStubbing<Observable<T>> {
    return thenReturnJust(item1, item2, item3, item4, item5, item6, item7, item8, item9)
}

fun <T: Any> OngoingStubbing<Observable<T>>.doReturnJust(item1: T, item2: T, item3: T, item4: T, item5: T, item6: T, item7: T, item8: T, item9: T, item10: T): OngoingStubbing<Observable<T>> {
    return thenReturnJust(item1, item2, item3, item4, item5, item6, item7, item8, item9, item10)
}

fun <T: Any> OngoingStubbing<Observable<T>>.doReturnEmpty(): OngoingStubbing<Observable<T>> {
    return thenReturn(Observable.empty())
}

infix fun <T: Any> OngoingStubbing<Observable<T>>.doReturnError(throwable: Throwable): OngoingStubbing<Observable<T>> {
    return thenReturnError(throwable)
}

fun <T: Any> OngoingStubbing<Observable<T>>.doReturnNever(): OngoingStubbing<Observable<T>> {
    return thenReturn(Observable.never())
}