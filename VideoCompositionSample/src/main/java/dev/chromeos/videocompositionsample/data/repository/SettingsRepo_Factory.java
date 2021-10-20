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

// Generated by Dagger (https://dagger.dev).
package dev.chromeos.videocompositionsample.data.repository;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SettingsRepo_Factory implements Factory<SettingsRepo> {
  private final Provider<Context> contextProvider;

  public SettingsRepo_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public SettingsRepo get() {
    return newInstance(contextProvider.get());
  }

  public static SettingsRepo_Factory create(Provider<Context> contextProvider) {
    return new SettingsRepo_Factory(contextProvider);
  }

  public static SettingsRepo newInstance(Context context) {
    return new SettingsRepo(context);
  }
}
