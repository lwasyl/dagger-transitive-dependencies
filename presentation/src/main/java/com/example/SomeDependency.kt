package com.example

import dagger.Module
import dagger.Subcomponent

@Subcomponent(modules = [UiModule::class])
interface UiSubcomponent {
    fun coreInterface(): CoreInterface
}

@Module(includes = [CoreModule::class])
abstract class UiModule

fun dupa(subcomponent: UiSubcomponent) {
    subcomponent.coreInterface()
}
