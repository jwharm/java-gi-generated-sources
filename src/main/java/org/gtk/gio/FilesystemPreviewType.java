package org.gtk.gio;

/**
 * Indicates a hint from the file system whether files should be
 * previewed in a file manager. Returned as the value of the key
 * {@code G_FILE_ATTRIBUTE_FILESYSTEM_USE_PREVIEW}.
 */
public class FilesystemPreviewType extends io.github.jwharm.javagi.Enumeration {

    /**
     * Only preview files if user has explicitly requested it.
     */
    public static final FilesystemPreviewType IF_ALWAYS = new FilesystemPreviewType(0);
    
    /**
     * Preview files if user has requested preview of "local" files.
     */
    public static final FilesystemPreviewType IF_LOCAL = new FilesystemPreviewType(1);
    
    /**
     * Never preview files.
     */
    public static final FilesystemPreviewType NEVER = new FilesystemPreviewType(2);
    
    public FilesystemPreviewType(int value) {
        super(value);
    }
    
}