package org.gtk.gio;

/**
 * Indicates a hint from the file system whether files should be
 * previewed in a file manager. Returned as the value of the key
 * %G_FILE_ATTRIBUTE_FILESYSTEM_USE_PREVIEW.
 */
public enum FilesystemPreviewType {

    /**
     * Only preview files if user has explicitly requested it.
     */
    IF_ALWAYS,
    
    /**
     * Preview files if user has requested preview of "local" files.
     */
    IF_LOCAL,
    
    /**
     * Never preview files.
     */
    NEVER;
    
    public static FilesystemPreviewType fromValue(int value) {
        return switch(value) {
            case 0 -> IF_ALWAYS;
            case 1 -> IF_LOCAL;
            case 2 -> NEVER;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case IF_ALWAYS -> 0;
            case IF_LOCAL -> 1;
            case NEVER -> 2;
        };
    }

}
