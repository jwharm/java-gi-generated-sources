package org.gtk.gio;

/**
 * Indicates a hint from the file system whether files should be
 * previewed in a file manager. Returned as the value of the key
 * {@code G_FILE_ATTRIBUTE_FILESYSTEM_USE_PREVIEW}.
 */
public class FilesystemPreviewType {

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
    
    private int value;
    
    public FilesystemPreviewType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(FilesystemPreviewType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
