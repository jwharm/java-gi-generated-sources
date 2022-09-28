package org.gtk.gio;

/**
 * Used by g_file_set_attributes_from_info() when setting file attributes.
 */
public class FileAttributeStatus extends io.github.jwharm.javagi.Enumeration {

    /**
     * Attribute value is unset (empty).
     */
    public static final FileAttributeStatus UNSET = new FileAttributeStatus(0);
    
    /**
     * Attribute value is set.
     */
    public static final FileAttributeStatus SET = new FileAttributeStatus(1);
    
    /**
     * Indicates an error in setting the value.
     */
    public static final FileAttributeStatus ERROR_SETTING = new FileAttributeStatus(2);
    
    public FileAttributeStatus(int value) {
        super(value);
    }
    
}
