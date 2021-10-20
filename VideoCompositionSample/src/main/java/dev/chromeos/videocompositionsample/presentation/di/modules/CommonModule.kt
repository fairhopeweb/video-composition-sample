/*
 * Copyright (c) 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.chromeos.videocompositionsample.presentation.di.modules

import android.content.Context
import dev.chromeos.videocompositionsample.presentation.tools.logger.ILogger
import dev.chromeos.videocompositionsample.presentation.tools.logger.Logger
import dev.chromeos.videocompositionsample.presentation.tools.resource.IResourceManager
import dev.chromeos.videocompositionsample.presentation.tools.resource.ResourceManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CommonModule(private val context: Context) {

    @Provides
    @Singleton
    fun provideContext(): Context {
        return context
    }

    @Provides
    @Singleton
    fun provideResourceManager(resourceManager: ResourceManager): IResourceManager {
        return resourceManager
    }

    @Provides
    @Singleton
    fun provideLogger(logger: Logger): ILogger {
        return logger
    }
}