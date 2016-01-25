/*
 * Copyright 2013-2014 the original author or authors.
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

package org.springframework.cloud.aws.core.env.stack.config;

import org.springframework.cloud.aws.core.support.documentation.RuntimeUse;

/**
 * Represents a provider for a statically configured stack name.
 *
 * @author Christian Stettler
 */
@RuntimeUse
public class StaticStackNameProvider implements StackNameProvider {

	private final String stackName;

	public StaticStackNameProvider(String stackName) {
		this.stackName = stackName;
	}

	@Override
	public String getStackName() {
		return this.stackName;
	}

}
