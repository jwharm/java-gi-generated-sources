package org.gtk.gio;

/**
 * Flags specifying the behaviour of an attribute.
 */
public class FileAttributeInfoFlags {

    /**
     * no flags set.
     */
    public static final FileAttributeInfoFlags NONE = new FileAttributeInfoFlags(0);
    
    /**
     * copy the attribute values when the file is copied.
     */
    public static final FileAttributeInfoFlags COPY_WITH_FILE = new FileAttributeInfoFlags(1);
    
    /**
     * copy the attribute values when the file is moved.
     */
    public static final FileAttributeInfoFlags COPY_WHEN_MOVED = new FileAttributeInfoFlags(2);
    
    private int value;
    
    public FileAttributeInfoFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(FileAttributeInfoFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public FileAttributeInfoFlags combined(FileAttributeInfoFlags mask) {
        return new FileAttributeInfoFlags(this.getValue() | mask.getValue());
    }
    
    public static FileAttributeInfoFlags combined(FileAttributeInfoFlags mask, FileAttributeInfoFlags... masks) {
        int value = mask.getValue();
        for (FileAttributeInfoFlags arg : masks) {
            value |= arg.getValue();
        }
        return new FileAttributeInfoFlags(value);
    }
    
}
