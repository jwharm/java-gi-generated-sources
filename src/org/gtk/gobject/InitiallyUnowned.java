package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
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

    public InitiallyUnowned(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to InitiallyUnowned */
    public static InitiallyUnowned castFrom(org.gtk.gobject.Object gobject) {
        return new InitiallyUnowned(gobject.getReference());
    }
    
}
