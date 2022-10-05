package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A type for objects that have an initially floating reference.
 * <p>
 * All the fields in the {@code GInitiallyUnowned} structure are private to the
 * implementation and should never be accessed directly.
 */
public class InitiallyUnowned extends Object {

    public InitiallyUnowned(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to InitiallyUnowned */
    public static InitiallyUnowned castFrom(org.gtk.gobject.Object gobject) {
        return new InitiallyUnowned(gobject.refcounted());
    }
    
}
