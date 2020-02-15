/*
 * Copyright (c) 2020 Wideverse
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.wideverse.kthings

private const val DEFAULT_UPDATE_FREQUENCY = 500L
data class GpioButton(
    val pin: GpioPin,
    val updateFrequency: Long = DEFAULT_UPDATE_FREQUENCY){

    constructor(pinNumber: Int, frequency: Long = DEFAULT_UPDATE_FREQUENCY):
            this(GpioPin(number = pinNumber, direction = PinDirection.INPUT), frequency)
}