package org.gtk.gio;

/**
 * {@link DataStreamByteOrder} is used to ensure proper endianness of streaming data sources
 * across various machine architectures.
 */
public class DataStreamByteOrder extends io.github.jwharm.javagi.Enumeration {

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
