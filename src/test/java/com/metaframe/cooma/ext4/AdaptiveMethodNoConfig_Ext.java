/*
 * Copyright 2012-2013 Cooma Team.
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

package com.metaframe.cooma.ext4;

import com.metaframe.cooma.Adaptive;
import com.metaframe.cooma.Extension;

import java.util.List;

/**
 * @author Jerry Lee(oldratlee AT gmail DOT com)
 */
@Extension
public interface AdaptiveMethodNoConfig_Ext {
    @Adaptive
    String bark(String name, List<Object> list); // 没有Config参数的方法
}