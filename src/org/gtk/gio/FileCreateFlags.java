package org.gtk.gio;

/**
 * Flags used when an operation may create a file.
 */
public class FileCreateFlags {

    /**
     * No flags set.
     */
    public static final int NONE = 0;
    
    /**
     * Create a file that can only be
     *    accessed by the current user.
     */
    public static final int PRIVATE = 1;
    
    /**
     * Replace the destination
     *    as if it didn't exist before. Don't try to keep any old
     *    permissions, replace instead of following links. This
     *    is generally useful if you're doing a "copy over"
     *    rather than a "save new version of" replace operation.
     *    You can think of it as "unlink destination" before
     *    writing to it, although the implementation may not
     *    be exactly like that. This flag can only be used with
     *    g_file_replace() and its variants, including g_file_replace_contents().
     *    Since 2.20
     */
    public static final int REPLACE_DESTINATION = 2;
    
}
