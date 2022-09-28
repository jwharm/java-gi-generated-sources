package org.gtk.gio;

/**
 * The data types for file attributes.
 */
public class FileAttributeType {

    /**
     * indicates an invalid or uninitialized type.
     */
    public static final FileAttributeType INVALID = new FileAttributeType(0);
    
    /**
     * a null terminated UTF8 string.
     */
    public static final FileAttributeType STRING = new FileAttributeType(1);
    
    /**
     * a zero terminated string of non-zero bytes.
     */
    public static final FileAttributeType BYTE_STRING = new FileAttributeType(2);
    
    /**
     * a boolean value.
     */
    public static final FileAttributeType BOOLEAN = new FileAttributeType(3);
    
    /**
     * an unsigned 4-byte/32-bit integer.
     */
    public static final FileAttributeType UINT32 = new FileAttributeType(4);
    
    /**
     * a signed 4-byte/32-bit integer.
     */
    public static final FileAttributeType INT32 = new FileAttributeType(5);
    
    /**
     * an unsigned 8-byte/64-bit integer.
     */
    public static final FileAttributeType UINT64 = new FileAttributeType(6);
    
    /**
     * a signed 8-byte/64-bit integer.
     */
    public static final FileAttributeType INT64 = new FileAttributeType(7);
    
    /**
     * a {@link org.gtk.gobject.Object}.
     */
    public static final FileAttributeType OBJECT = new FileAttributeType(8);
    
    /**
     * a {@code null} terminated char **. Since 2.22
     */
    public static final FileAttributeType STRINGV = new FileAttributeType(9);
    
    private int value;
    
    public FileAttributeType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(FileAttributeType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
