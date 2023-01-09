package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A type defining the type of an element factory.
 */
public class ElementFactoryListType extends io.github.jwharm.javagi.Alias<Long> {
    
    /**
     * Create a new ElementFactoryListType with the provided value
     */
    public ElementFactoryListType(long value) {
        super(value);
    }
    
    @ApiStatus.Internal
    public static ElementFactoryListType[] fromNativeArray(MemoryAddress address, long length) {
        ElementFactoryListType[] array = new ElementFactoryListType[(int) length];
        long bytesSize = Interop.valueLayout.C_LONG.byteSize();
        for (int i = 0; i < length; i++) {
            array[i] = new ElementFactoryListType(address.get(Interop.valueLayout.C_LONG, i * bytesSize));
        }
        return array;
    }
}
