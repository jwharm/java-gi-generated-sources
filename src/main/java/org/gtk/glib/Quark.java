package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A GQuark is a non-zero integer which uniquely identifies a
 * particular string. A GQuark value of zero is associated to {@code null}.
 */
public class Quark extends io.github.jwharm.javagi.Alias<Integer> {
    
    public Quark(int value) {
        super(value);
    }
    
    @ApiStatus.Internal
    public static Quark[] fromNativeArray(MemoryAddress address, long length) {
        Quark[] array = new Quark[(int) length];
        long bytesSize = Interop.valueLayout.C_INT.byteSize();
        for (int i = 0; i < length; i++) {
            array[i] = new Quark(address.get(Interop.valueLayout.C_INT, i * bytesSize));
        }
        return array;
    }
}
