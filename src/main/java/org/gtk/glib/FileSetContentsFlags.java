package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags to pass to g_file_set_contents_full() to affect its safety and
 * performance.
 * @version 2.66
 */
public class FileSetContentsFlags extends io.github.jwharm.javagi.Bitfield {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * No guarantees about file consistency or durability.
     *   The most dangerous setting, which is slightly faster than other settings.
     */
    public static final FileSetContentsFlags NONE = new FileSetContentsFlags(0);
    
    /**
     * Guarantee file consistency: after a crash,
     *   either the old version of the file or the new version of the file will be
     *   available, but not a mixture. On Unix systems this equates to an {@code fsync()}
     *   on the file and use of an atomic {@code rename()} of the new version of the file
     *   over the old.
     */
    public static final FileSetContentsFlags CONSISTENT = new FileSetContentsFlags(1);
    
    /**
     * Guarantee file durability: after a crash, the
     *   new version of the file will be available. On Unix systems this equates to
     *   an {@code fsync()} on the file (if {@link FileSetContentsFlags#CONSISTENT} is unset), or
     *   the effects of {@link FileSetContentsFlags#CONSISTENT} plus an {@code fsync()} on the
     *   directory containing the file after calling {@code rename()}.
     */
    public static final FileSetContentsFlags DURABLE = new FileSetContentsFlags(2);
    
    /**
     * Only apply consistency and durability
     *   guarantees if the file already exists. This may speed up file operations
     *   if the file doesn’t currently exist, but may result in a corrupted version
     *   of the new file if the system crashes while writing it.
     */
    public static final FileSetContentsFlags ONLY_EXISTING = new FileSetContentsFlags(4);
    
    public FileSetContentsFlags(int value) {
        super(value);
    }
}
