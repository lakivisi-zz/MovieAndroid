package com.andia.loice.movies.dagger;

import com.andia.loice.movies.view.activity.MovieListActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector
    abstract MovieListActivity bindMovieListActivity();
}