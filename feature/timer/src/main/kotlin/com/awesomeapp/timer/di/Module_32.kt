package com.awesomeapp.timer.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.timer.Viewmodel32_1
import com.awesomeapp.timer.Activity32_2
import com.awesomeapp.timer.Activity32_3
import com.awesomeapp.timer.Fragment32_4
import com.awesomeapp.timer.Repository32_5
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.search.Api12_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.timer.Model32_8
import com.awesomeapp.timer.Model32_9
import com.awesomeapp.timer.Activity32_10
import com.awesomeapp.timer.Model32_12
import com.awesomeapp.timer.Activity32_13
import com.awesomeapp.timer.Model32_15
import com.awesomeapp.timer.Activity32_16
import com.awesomeapp.timer.Model32_18
import com.awesomeapp.timer.Activity32_19
import com.awesomeapp.timer.Model32_21
import com.awesomeapp.timer.Activity32_22
import com.awesomeapp.timer.Model32_24
import com.awesomeapp.timer.Activity32_25
import com.awesomeapp.timer.Model32_27
import com.awesomeapp.timer.Activity32_28
import com.awesomeapp.timer.Model32_30
import com.awesomeapp.timer.Activity32_31
import com.awesomeapp.timer.Model32_33
import com.awesomeapp.timer.Activity32_34
import com.awesomeapp.timer.Model32_36
import com.awesomeapp.timer.Activity32_37
import com.awesomeapp.timer.Model32_39
import com.awesomeapp.timer.Activity32_40
import com.awesomeapp.timer.Model32_42
import com.awesomeapp.timer.Activity32_43
import com.awesomeapp.timer.Model32_45

@Module
@InstallIn(SingletonComponent::class)
object Module_32 {
    @Provides
    @Singleton
    fun provideRepository32_5(
        api0: Api8_6 = Api8_6(),
        api1: Api12_6 = Api12_6(),
        api2: Api16_6 = Api16_6(),
        api3: Api4_6 = Api4_6(),
        api4: Api20_6 = Api20_6()
    ): Repository32_5 {
        return Repository32_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi32_6(): Api32_6 {
        return Api32_6()
    }
}