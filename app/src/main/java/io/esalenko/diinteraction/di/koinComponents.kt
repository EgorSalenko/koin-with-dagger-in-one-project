package io.esalenko.diinteraction.di

import io.esalenko.awesome.di.awesomeModule
import io.esalenko.common.di.commonModule
import io.esalenko.horrible.di.horribleModule
import org.koin.core.module.Module

val appComponent : List<Module> = listOf(
    commonModule,
    awesomeModule,
    horribleModule
)