package com.athila.cleansample.di.component;

import com.athila.cleansample.data.repository.city.CityRepository;
import com.athila.cleansample.data.repository.forecast.ForecastRepository;
import com.athila.cleansample.di.module.ApplicationModule;
import com.athila.cleansample.di.module.DatabaseModule;
import com.athila.cleansample.di.module.NetworkModule;
import com.athila.cleansample.di.module.repository.CityRepositoryModule;
import com.athila.cleansample.di.module.repository.ForecastRepositoryModule;
import com.athila.cleansample.infrastructure.CleanSampleApp;
import com.pushtorefresh.storio.sqlite.StorIOSQLite;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by athila on 30/05/16.
 */

@Singleton
@Component(modules = {
        ApplicationModule.class,
        NetworkModule.class,
        DatabaseModule.class,
        CityRepositoryModule.class,
        ForecastRepositoryModule.class
})
public interface ApplicationComponent {
    // expose to sub graphs

    CleanSampleApp application();

    // Repositories
    CityRepository cityRepository();
    ForecastRepository forecastRepository();

    // Datasources for tests
    StorIOSQLite storIO();
}
