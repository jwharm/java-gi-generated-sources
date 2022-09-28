package org.gtk.gio;

/**
 * GResourceFlags give information about a particular file inside a resource
 * bundle.
 */
public class ResourceFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * No flags set.
     */
    public static final ResourceFlags NONE = new ResourceFlags(0);
    
    /**
     * The file is compressed.
     */
    public static final ResourceFlags COMPRESSED = new ResourceFlags(1);
    
    public ResourceFlags(int value) {
        super(value);
    }
    
}
