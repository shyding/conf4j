/*
 * MIT License
 *
 * Copyright 2017-2018 Sabre GLBL Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.sabre.oss.conf4j.internal.config;

import com.sabre.oss.conf4j.annotation.Internal;
import com.sabre.oss.conf4j.converter.TypeConverter;
import com.sabre.oss.conf4j.source.ConfigurationSource;

/**
 * Interface which is implemented by the class generator by all dynamic configurations.
 * It allows injecting/accessing {@link TypeConverter} and {@link ConfigurationSource}.
 */
public interface DynamicConfiguration {
    @Internal
    TypeConverter<?> getTypeConverter();

    @Internal
    void setTypeConverter(TypeConverter<?> typeConverter);

    @Internal
    ConfigurationSource getConfigurationSource();

    @Internal
    void setConfigurationSource(ConfigurationSource configurationSource);

    @Internal
    ConfigurationValueProvider getConfigurationValueProvider();

    @Internal
    void setConfigurationValueProvider(ConfigurationValueProvider configurationValueProvider);

    @Internal
    DynamicConfiguration getParentConfiguration();

    @Internal
    void setParentConfiguration(DynamicConfiguration parentConfiguration);
}
