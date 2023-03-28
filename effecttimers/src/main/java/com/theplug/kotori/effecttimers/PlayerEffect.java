/*
 * Copyright (c) 2020 ThatGamerBlue
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.theplug.kotori.effecttimers;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum PlayerEffect
{
	BIND("Bind", 181, 8, false, TimerType.FREEZE, true),
	SNARE("Snare", 180, 16, false, TimerType.FREEZE, true),
	ENTANGLE("Entangle", 179, 24, false, TimerType.FREEZE, true),
	RUSH("Ice Rush", 361, 8, false, TimerType.FREEZE, true),
	BURST("Ice Burst", 363, 16, false, TimerType.FREEZE, true),
	BLITZ("Ice Blitz", 367, 24, false, TimerType.FREEZE, true),
	BARRAGE("Ice Barrage", 369, 32, false, TimerType.FREEZE, true),
	TELEBLOCK("Teleblock", 345, 500, true, TimerType.TELEBLOCK, false),
	VENG("Vengeance", 726, 50, false, TimerType.VENG, false),
	VENG_OTHER("Vengeance Other", 725, 50, false, TimerType.VENG, false),
	STAFF_OF_THE_DEAD("Staff of the Dead", 1228, 100, false, TimerType.SOTD, false),
	STAFF_OF_LIGHT("Staff of Light", 1516, 100, false, TimerType.SOTD, false),
	STAFF_OF_BALANCE("Staff of Balance", 1733, 100, false, TimerType.SOTD, false),
	IMBUED_HEART("Imbued Heart", 1316, 700, false, TimerType.IMBUEDHEART, false),
	DFS("Dragon Fire Shield", 1165, 192, false, TimerType.DFS, false),
	ANCIENT_WYVERN("Ancient Wyvern Shield", 1402, 192, false, TimerType.ANCWYVERN, false);

	@Getter(AccessLevel.PACKAGE)
	private final String name;
	@Getter(AccessLevel.PACKAGE)
	private final int spotAnimId;
	@Getter(AccessLevel.PACKAGE)
	private final int timerLengthTicks;
	@Getter(AccessLevel.PACKAGE)
	private boolean halvable;
	@Getter(AccessLevel.PACKAGE)
	private final TimerType type;
	@Getter(AccessLevel.PACKAGE)
	private boolean resistance;

	static PlayerEffect getFromSpotAnim(int spotAnim)
	{
		for (PlayerEffect effect : values())
		{
			if (effect.getSpotAnimId() == spotAnim)
			{
				return effect;
			}
		}
		return null;
	}
}
