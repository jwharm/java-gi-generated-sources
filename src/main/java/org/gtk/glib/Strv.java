package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A typedef alias for gchar**. This is mostly useful when used together with
 * g_auto().
 */
public class Strv extends io.github.jwharm.javagi.Alias<java.lang.String> {
    
    /**
     * Create a new Strv with the provided value
     */
    public Strv(java.lang.String value) {
        super(value);
    }
    
    @ApiStatus.Internal
    public static Strv[] fromNativeArray(MemoryAddress address, long length) {
        Strv[] array = new Strv[(int) length];
        long bytesSize = Interop.valueLayout.ADDRESS.byteSize();
        for (int i = 0; i < length; i++) {
            array[i] = new Strv(Interop.getStringFrom(address.get(Interop.valueLayout.ADDRESS, i * bytesSize)));
        }
        return array;
    }
}
