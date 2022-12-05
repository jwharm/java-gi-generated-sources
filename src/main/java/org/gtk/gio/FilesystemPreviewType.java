package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Indicates a hint from the file system whether files should be
 * previewed in a file manager. Returned as the value of the key
 * {@code G_FILE_ATTRIBUTE_FILESYSTEM_USE_PREVIEW}.
 */
public enum FilesystemPreviewType implements io.github.jwharm.javagi.Enumeration {
    /**
     * Only preview files if user has explicitly requested it.
     */
    IF_ALWAYS(0),
    /**
     * Preview files if user has requested preview of "local" files.
     */
    IF_LOCAL(1),
    /**
     * Never preview files.
     */
    NEVER(2);
    
    private static final java.lang.String C_TYPE_NAME = "GFilesystemPreviewType";
    
    private final int value;
    FilesystemPreviewType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static FilesystemPreviewType of(int value) {
        return switch (value) {
            case 0 -> IF_ALWAYS;
            case 1 -> IF_LOCAL;
            case 2 -> NEVER;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
