package com.example

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Inject

interface CoreInterface

internal class CoreInterfaceImpl @Inject constructor(
    private val dep: InternalCoreInterface<ApiModel>
) : CoreInterface

internal interface InternalCoreInterface<T>

@Module
abstract class CoreModule {

    companion object {

        @Provides
        internal fun coreInterface() = object : InternalCoreInterface<ApiModel> {}
    }

    @Binds
    internal abstract fun CoreInterfaceImpl.bind(): CoreInterface
}
