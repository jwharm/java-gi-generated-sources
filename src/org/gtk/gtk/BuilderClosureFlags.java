package org.gtk.gtk;

/**
 * The list of flags that can be passed to gtk_builder_create_closure().
 * 
 * New values may be added in the future for new features, so external
 * implementations of {@link [iface@Gtk.BuilderScope] (ref=iface)} should test the flags
 * for unknown values and raise a {@link org.gtk.gtk.BuilderError<code>#INVALID_ATTRIBUTE</code>  error
 * when they encounter one.
 */
public class BuilderClosureFlags {

    /**
     * The closure should be created swapped. See
     *   g_cclosure_new_swap() for details.
     */
    public static final int SWAPPED = 1;
    
}
