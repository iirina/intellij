/*
 * Copyright 2019 The Bazel Authors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.idea.sdkcompat.openapi;

import com.intellij.ide.SaveAndSyncHandler;

/**
 * A copy of the upstream HeadlessSaveAndSyncHandler usable in unit tests...
 *
 * <p>#api191: API changed in 2019.2
 */
public class HeadlessSaveAndSyncHandler extends SaveAndSyncHandler {
  @Override
  public void blockSaveOnFrameDeactivation() {}

  @Override
  public void blockSyncOnFrameActivation() {}

  @Override
  public void refreshOpenFiles() {}

  @Override
  public void scheduleRefresh() {}

  @Override
  public void unblockSaveOnFrameDeactivation() {}

  @Override
  public void unblockSyncOnFrameActivation() {}

  @Override
  public void saveProjectsAndDocuments() {}
}
