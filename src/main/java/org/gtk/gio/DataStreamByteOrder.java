package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link DataStreamByteOrder} is used to ensure proper endianness of streaming data sources
 * across various machine architectures.
 */
public class DataStreamByteOrder extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Selects Big Endian byte order.
     */
    public static final DataStreamByteOrder BIG_ENDIAN = new DataStreamByteOrder(0);
    
    /**
     * Selects Little Endian byte order.
     */
    public static final DataStreamByteOrder LITTLE_ENDIAN = new DataStreamByteOrder(1);
    
    /**
     * Selects endianness based on host machine's architecture.
     */
    public static final DataStreamByteOrder HOST_ENDIAN = new DataStreamByteOrder(2);
    
    public DataStreamByteOrder(int value) {
        super(value);
    }
}
