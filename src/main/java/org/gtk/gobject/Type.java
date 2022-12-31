package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A numerical value which represents the unique identifier of a registered
 * type.
 */
public class Type extends io.github.jwharm.javagi.Alias<Long> {
    
    public Type(long value) {
        super(value);
    }
    
    @ApiStatus.Internal
    public static Type[] fromNativeArray(MemoryAddress address, long length) {
        Type[] array = new Type[(int) length];
        long bytesSize = Interop.valueLayout.C_LONG.byteSize();
        for (int i = 0; i < length; i++) {
            array[i] = new Type(address.get(Interop.valueLayout.C_LONG, i * bytesSize));
        }
        return array;
    }
}
