package org.gtk.gio;

/**
 * Flags specifying the behaviour of an attribute.
 */
public class FileAttributeInfoFlags {

    /**
     * no flags set.
     */
    public static final int NONE = 0;
    
    /**
     * copy the attribute values when the file is copied.
     */
    public static final int COPY_WITH_FILE = 1;
    
    /**
     * copy the attribute values when the file is moved.
     */
    public static final int COPY_WHEN_MOVED = 2;
    
}
