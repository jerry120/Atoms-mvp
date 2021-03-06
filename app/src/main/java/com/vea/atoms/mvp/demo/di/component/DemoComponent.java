/*
 * Copyright 2017 Vea
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.vea.atoms.mvp.demo.di.component;

import com.vea.atoms.mvp.demo.di.module.DemoModule;
import com.vea.atoms.mvp.demo.mvp.ui.MainActivity;
import com.vea.atoms.mvp.di.component.AppComponent;
import com.vea.atoms.mvp.di.scope.ActivityScope;

import dagger.Component;

/**
 * ================================================
 * 展示 Component 的用法
 * <p>
 * Created by Vea on 09/04/2016 11:17
 * ================================================
 */
@ActivityScope
@Component(modules = DemoModule.class, dependencies = AppComponent.class)
public interface DemoComponent {

    void inject(MainActivity activity);
}
