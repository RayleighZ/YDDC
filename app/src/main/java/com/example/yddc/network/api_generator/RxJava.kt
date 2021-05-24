package com.example.yddc.network.api_generator

/**
 * Author: RayleighZ
 * Time: 2021-05-23 17:58
 */
import io.reactivex.Observable
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.annotations.CheckReturnValue
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

/**
 * Author: RayleighZ
 * Time: 2021-05-13 18:01
 * Rxjava的部分拓展方法
 */

@CheckReturnValue
fun <T> Observable<T>.setSchedulers(
    subscribeOn: Scheduler = Schedulers.io(),
    unsubscribeOn: Scheduler = Schedulers.io(),
    observeOn: Scheduler = AndroidSchedulers.mainThread()
): Observable<T> = subscribeOn(subscribeOn)
    .unsubscribeOn(unsubscribeOn)
    .observeOn(observeOn)

fun <T> Observable<T>.safeSubscribeBy(
    onError: (Throwable) -> Unit = {},
    onComplete: () -> Unit = {},
    onNext: (T) -> Unit = {}
): Disposable = subscribe(onNext, onError, onComplete)