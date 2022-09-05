package org.gtk.gtk;

/**
 * The list of flags that can be passed to gtk_builder_create_closure().
 * 
 * New values may be added in the future for new features, so external
 * implementations of [iface@Gtk.BuilderScope] should test the flags
 * for unknown values and raise a %GTK_BUILDER_ERROR_INVALID_ATTRIBUTE error
 * when they encounter one.
 */
public class BuilderClosureFlags {

    /**
     * The closure should be created swapped. See
     *   g_cclosure_new_swap() for details.
     */
    public static final int SWAPPED = 1;
    
}