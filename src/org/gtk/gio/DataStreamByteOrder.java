package org.gtk.gio;

/**
 * {@link DataStreamByteOrder} is used to ensure proper endianness of streaming data sources
 * across various machine architectures.
 */
public class DataStreamByteOrder {

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
    
    private int value;
    
    public DataStreamByteOrder(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(DataStreamByteOrder[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
