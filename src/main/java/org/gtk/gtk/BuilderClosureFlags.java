package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The list of flags that can be passed to gtk_builder_create_closure().
 * <p>
 * New values may be added in the future for new features, so external
 * implementations of {@code Gtk.BuilderScope} should test the flags
 * for unknown values and raise a {@link BuilderError#INVALID_ATTRIBUTE} error
 * when they encounter one.
 */
public class BuilderClosureFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GtkBuilderClosureFlags";
    
    /**
     * The closure should be created swapped. See
     *   g_cclosure_new_swap() for details.
     */
    public static final BuilderClosureFlags SWAPPED = new BuilderClosureFlags(1);
    
    public BuilderClosureFlags(int value) {
        super(value);
    }
}
