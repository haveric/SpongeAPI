/*
 * This file is part of Sponge, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered.org <http://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.block.data;

import org.spongepowered.api.item.inventory.Carrier;
import org.spongepowered.api.item.inventory.types.TileInventory;

/**
 * A representation of the persisted data for a tile entity with a 'lock'.
 * <p>
 * A tile entity having a lock token set implies that it may only be used by a
 * player who is holding an item with a name equal to the lock token.
 * </p>
 */
public interface Lockable extends TileEntity, Carrier {

    /**
     * Gets the lock token for this tile entity. Will be empty if this tile
     * entity is not locked.
     *
     * @return The lock token
     */
    String getLockToken();

    /**
     * Sets the lock token for this tile entity.
     *
     * @param token The new lock token
     */
    void setLockToken(String token);
    
    /* (non-Javadoc)
     * @see org.spongepowered.api.item.inventory.Carrier#getInventory()
     */
    @Override
    public TileInventory<Lockable> getInventory();
}
