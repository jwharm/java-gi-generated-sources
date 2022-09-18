package org.gtk.glib;

/**
 * Flags to pass to g_file_set_contents_full() to affect its safety and
 * performance.
 */
public class FileSetContentsFlags {

    /**
     * No guarantees about file consistency or durability.
     *   The most dangerous setting, which is slightly faster than other settings.
     */
    public static final int NONE = 0;
    
    /**
     * Guarantee file consistency: after a crash,
     *   either the old version of the file or the new version of the file will be
     *   available, but not a mixture. On Unix systems this equates to an <code>fsync()</code>
     *   on the file and use of an atomic <code>rename()</code> of the new version of the file
     *   over the old.
     */
    public static final int CONSISTENT = 1;
    
    /**
     * Guarantee file durability: after a crash, the
     *   new version of the file will be available. On Unix systems this equates to
     *   an <code>fsync()</code> on the file (if {@link org.gtk.glib.FileSetContentsFlags<code>#CONSISTENT</code>  is unset), or
     *   the effects of {@link org.gtk.glib.FileSetContentsFlags<code>#CONSISTENT</code>  plus an <code>fsync()</code> on the
     *   directory containing the file after calling <code>rename()</code>.
     */
    public static final int DURABLE = 2;
    
    /**
     * Only apply consistency and durability
     *   guarantees if the file already exists. This may speed up file operations
     *   if the file doesn&<code>#8217</code> t currently exist, but may result in a corrupted version
     *   of the new file if the system crashes while writing it.
     */
    public static final int ONLY_EXISTING = 4;
    
}
