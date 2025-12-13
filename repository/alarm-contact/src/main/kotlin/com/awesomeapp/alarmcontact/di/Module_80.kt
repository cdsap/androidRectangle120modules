package com.awesomeapp.alarmcontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.alarmcontact.Viewmodel80_1
import com.awesomeapp.alarmcontact.Activity80_2
import com.awesomeapp.alarmcontact.Activity80_3
import com.awesomeapp.alarmcontact.Fragment80_4
import com.awesomeapp.alarmcontact.Repository80_5
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.synccontact.Api64_6
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.postcontact.Api60_6
import com.awesomeapp.notificationcontact.Api68_6
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.alarmcontact.Service80_7
import com.awesomeapp.alarmcontact.Worker80_8
import com.awesomeapp.alarmcontact.Model80_10
import com.awesomeapp.alarmcontact.Model80_11
import com.awesomeapp.alarmcontact.Activity80_12
import com.awesomeapp.alarmcontact.Model80_14
import com.awesomeapp.alarmcontact.Activity80_15
import com.awesomeapp.alarmcontact.Model80_17
import com.awesomeapp.alarmcontact.Activity80_18
import com.awesomeapp.alarmcontact.Model80_20
import com.awesomeapp.alarmcontact.Activity80_21
import com.awesomeapp.alarmcontact.Model80_23
import com.awesomeapp.alarmcontact.Activity80_24
import com.awesomeapp.alarmcontact.Model80_26
import com.awesomeapp.alarmcontact.Activity80_27
import com.awesomeapp.alarmcontact.Model80_29

@Module
@InstallIn(SingletonComponent::class)
object Module_80 {
    @Provides
    @Singleton
    fun provideRepository80_5(
        api0: Api52_6 = Api52_6(),
        api1: Api56_6 = Api56_6(),
        api2: Api64_6 = Api64_6(),
        api3: Api72_6 = Api72_6(),
        api4: Api60_6 = Api60_6(),
        api5: Api68_6 = Api68_6()
    ): Repository80_5 {
        return Repository80_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi80_6(): Api80_6 {
        return Api80_6()
    }
}