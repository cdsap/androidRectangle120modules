package com.awesomeapp.messagelogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.messagelogin.Viewmodel116_1
import com.awesomeapp.messagelogin.Activity116_2
import com.awesomeapp.messagelogin.Activity116_3
import com.awesomeapp.messagelogin.Fragment116_4
import com.awesomeapp.messagelogin.Repository116_5
import com.awesomeapp.mediacontact.Api96_6
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.podcastcontact.Api92_6
import com.awesomeapp.notecontact.Api84_6
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.messagelogin.Api116_6
import com.awesomeapp.messagelogin.Model116_8
import com.awesomeapp.messagelogin.Model116_9
import com.awesomeapp.messagelogin.Activity116_10
import com.awesomeapp.messagelogin.Model116_12
import com.awesomeapp.messagelogin.Activity116_13
import com.awesomeapp.messagelogin.Model116_15
import com.awesomeapp.messagelogin.Activity116_16
import com.awesomeapp.messagelogin.Model116_18
import com.awesomeapp.messagelogin.Activity116_19
import com.awesomeapp.messagelogin.Model116_21
import com.awesomeapp.messagelogin.Activity116_22
import com.awesomeapp.messagelogin.Model116_24
import com.awesomeapp.messagelogin.Activity116_25
import com.awesomeapp.messagelogin.Model116_27
import com.awesomeapp.messagelogin.Activity116_28
import com.awesomeapp.messagelogin.Model116_30
import com.awesomeapp.messagelogin.Activity116_31
import com.awesomeapp.messagelogin.Model116_33
import com.awesomeapp.messagelogin.Activity116_34
import com.awesomeapp.messagelogin.Model116_36
import com.awesomeapp.messagelogin.Activity116_37
import com.awesomeapp.messagelogin.Model116_39
import com.awesomeapp.messagelogin.Activity116_40
import com.awesomeapp.messagelogin.Model116_42
import com.awesomeapp.messagelogin.Activity116_43

@Module
@InstallIn(SingletonComponent::class)
object Module_116 {
    @Provides
    @Singleton
    fun provideRepository116_5(
        api0: Api96_6 = Api96_6(),
        api1: Api80_6 = Api80_6(),
        api2: Api92_6 = Api92_6(),
        api3: Api84_6 = Api84_6(),
        api4: Api76_6 = Api76_6()
    ): Repository116_5 {
        return Repository116_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi116_6(): Api116_6 {
        return Api116_6()
    }
}