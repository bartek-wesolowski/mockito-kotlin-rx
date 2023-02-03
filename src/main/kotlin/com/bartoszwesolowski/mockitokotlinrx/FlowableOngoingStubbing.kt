package com.bartoszwesolowski.mockitokotlinrx

import io.reactivex.rxjava3.core.Flowable
import org.mockito.kotlin.doReturnConsecutively
import org.mockito.stubbing.OngoingStubbing

fun <T: Any> OngoingStubbing<Flowable<T>>.thenReturnJust(item: T): OngoingStubbing<Flowable<T>> {
    return thenReturn(Flowable.just(item))
}

fun <T: Any> OngoingStubbing<Flowable<T>>.thenReturnJust(item: T, vararg items: T): OngoingStubbing<Flowable<T>> {
    return doReturnConsecutively(listOf(Flowable.just(item)) + items.map { Flowable.just(it) })
}

fun <T: Any> OngoingStubbing<Flowable<T>>.thenReturnJust(item1: T, item2: T): OngoingStubbing<Flowable<T>> {
    return thenReturn(Flowable.just(item1, item2))
}

fun <T: Any> OngoingStubbing<Flowable<T>>.thenReturnJust(item1: T, item2: T, item3: T): OngoingStubbing<Flowable<T>> {
    return thenReturn(Flowable.just(item1, item2, item3))
}

fun <T: Any> OngoingStubbing<Flowable<T>>.thenReturnJust(item1: T, item2: T, item3: T, item4: T): OngoingStubbing<Flowable<T>> {
    return thenReturn(Flowable.just(item1, item2, item3, item4))
}

fun <T: Any> OngoingStubbing<Flowable<T>>.thenReturnJust(item1: T, item2: T, item3: T, item4: T, item5: T): OngoingStubbing<Flowable<T>> {
    return thenReturn(Flowable.just(item1, item2, item3, item4, item5))
}

fun <T: Any> OngoingStubbing<Flowable<T>>.thenReturnJust(item1: T, item2: T, item3: T, item4: T, item5: T, item6: T): OngoingStubbing<Flowable<T>> {
    return thenReturn(Flowable.just(item1, item2, item3, item4, item5, item6))
}

fun <T: Any> OngoingStubbing<Flowable<T>>.thenReturnJust(item1: T, item2: T, item3: T, item4: T, item5: T, item6: T, item7: T): OngoingStubbing<Flowable<T>> {
    return thenReturn(Flowable.just(item1, item2, item3, item4, item5, item6, item7))
}

fun <T: Any> OngoingStubbing<Flowable<T>>.thenReturnJust(item1: T, item2: T, item3: T, item4: T, item5: T, item6: T, item7: T, item8: T): OngoingStubbing<Flowable<T>> {
    return thenReturn(Flowable.just(item1, item2, item3, item4, item5, item6, item7, item8))
}

fun <T: Any> OngoingStubbing<Flowable<T>>.thenReturnJust(item1: T, item2: T, item3: T, item4: T, item5: T, item6: T, item7: T, item8: T, item9: T): OngoingStubbing<Flowable<T>> {
    return thenReturn(Flowable.just(item1, item2, item3, item4, item5, item6, item7, item8, item9))
}

fun <T: Any> OngoingStubbing<Flowable<T>>.thenReturnJust(item1: T, item2: T, item3: T, item4: T, item5: T, item6: T, item7: T, item8: T, item9: T, item10: T): OngoingStubbing<Flowable<T>> {
    return thenReturn(Flowable.just(item1, item2, item3, item4, item5, item6, item7, item8, item9, item10))
}

fun <T: Any> OngoingStubbing<Flowable<T>>.thenReturnEmpty(): OngoingStubbing<Flowable<T>> {
    return thenReturn(Flowable.empty())
}

fun <T: Any> OngoingStubbing<Flowable<T>>.thenReturnError(throwable: Throwable): OngoingStubbing<Flowable<T>> {
    return thenReturn(Flowable.error(throwable))
}

fun <T: Any> OngoingStubbing<Flowable<T>>.thenReturnNever(): OngoingStubbing<Flowable<T>> {
    return thenReturn(Flowable.never())
}

infix fun <T: Any> OngoingStubbing<Flowable<T>>.doReturnJust(item: T): OngoingStubbing<Flowable<T>> {
    return thenReturnJust(item)
}

fun <T: Any> OngoingStubbing<Flowable<T>>.doReturnJust(item1: T, item2: T): OngoingStubbing<Flowable<T>> {
    return thenReturnJust(item1, item2)
}

fun <T: Any> OngoingStubbing<Flowable<T>>.doReturnJust(item1: T, item2: T, item3: T): OngoingStubbing<Flowable<T>> {
    return thenReturnJust(item1, item2, item3)
}

fun <T: Any> OngoingStubbing<Flowable<T>>.doReturnJust(item1: T, item2: T, item3: T, item4: T): OngoingStubbing<Flowable<T>> {
    return thenReturnJust(item1, item2, item3, item4)
}

fun <T: Any> OngoingStubbing<Flowable<T>>.doReturnJust(item1: T, item2: T, item3: T, item4: T, item5: T): OngoingStubbing<Flowable<T>> {
    return thenReturnJust(item1, item2, item3, item4, item5)
}

fun <T: Any> OngoingStubbing<Flowable<T>>.doReturnJust(item1: T, item2: T, item3: T, item4: T, item5: T, item6: T): OngoingStubbing<Flowable<T>> {
    return thenReturnJust(item1, item2, item3, item4, item5, item6)
}

fun <T: Any> OngoingStubbing<Flowable<T>>.doReturnJust(item1: T, item2: T, item3: T, item4: T, item5: T, item6: T, item7: T): OngoingStubbing<Flowable<T>> {
    return thenReturnJust(item1, item2, item3, item4, item5, item6, item7)
}

fun <T: Any> OngoingStubbing<Flowable<T>>.doReturnJust(item1: T, item2: T, item3: T, item4: T, item5: T, item6: T, item7: T, item8: T): OngoingStubbing<Flowable<T>> {
    return thenReturnJust(item1, item2, item3, item4, item5, item6, item7, item8)
}

fun <T: Any> OngoingStubbing<Flowable<T>>.doReturnJust(item1: T, item2: T, item3: T, item4: T, item5: T, item6: T, item7: T, item8: T, item9: T): OngoingStubbing<Flowable<T>> {
    return thenReturnJust(item1, item2, item3, item4, item5, item6, item7, item8, item9)
}

fun <T: Any> OngoingStubbing<Flowable<T>>.doReturnJust(item1: T, item2: T, item3: T, item4: T, item5: T, item6: T, item7: T, item8: T, item9: T, item10: T): OngoingStubbing<Flowable<T>> {
    return thenReturnJust(item1, item2, item3, item4, item5, item6, item7, item8, item9, item10)
}

fun <T: Any> OngoingStubbing<Flowable<T>>.doReturnEmpty(): OngoingStubbing<Flowable<T>> {
    return thenReturn(Flowable.empty())
}

infix fun <T: Any> OngoingStubbing<Flowable<T>>.doReturnError(throwable: Throwable): OngoingStubbing<Flowable<T>> {
    return thenReturnError(throwable)
}

fun <T: Any> OngoingStubbing<Flowable<T>>.doReturnNever(): OngoingStubbing<Flowable<T>> {
    return thenReturn(Flowable.never())
}