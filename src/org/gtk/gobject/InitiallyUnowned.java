package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A type for objects that have an initially floating reference.
 * 
 * All the fields in the `GInitiallyUnowned` structure are private to the
 * implementation and should never be accessed directly.
 */
public class InitiallyUnowned extends Object {

    public InitiallyUnowned(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to InitiallyUnowned */
    public static InitiallyUnowned castFrom(org.gtk.gobject.Object gobject) {
        return new InitiallyUnowned(gobject.getProxy());
    }
    
}
