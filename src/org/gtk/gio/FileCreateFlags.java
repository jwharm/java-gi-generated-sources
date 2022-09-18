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
     *    as if it didn&<code>#39</code> t exist before. Don&<code>#39</code> t try to keep any old
     *    permissions, replace instead of following links. This
     *    is generally useful if you&<code>#39</code> re doing a &<code>#34</code> copy over&<code>#34</code> 
     *    rather than a &<code>#34</code> save new version of&<code>#34</code>  replace operation.
     *    You can think of it as &<code>#34</code> unlink destination&<code>#34</code>  before
     *    writing to it, although the implementation may not
     *    be exactly like that. This flag can only be used with
     *    g_file_replace() and its variants, including g_file_replace_contents().
     *    Since 2.20
     */
    public static final int REPLACE_DESTINATION = 2;
    
}
