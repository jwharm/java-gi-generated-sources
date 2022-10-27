package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A type for objects that have an initially floating reference.
 * <p>
 * All the fields in the {@code GInitiallyUnowned} structure are private to the
 * implementation and should never be accessed directly.
 */
public class InitiallyUnowned extends org.gtk.gobject.Object {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInstance.getMemoryLayout().withName("g_type_instance"),
        ValueLayout.JAVA_INT.withName("ref_count"),
        org.gtk.glib.Data.getMemoryLayout().withName("qdata")
    ).withName("GInitiallyUnowned");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public InitiallyUnowned(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to InitiallyUnowned */
    public static InitiallyUnowned castFrom(org.gtk.gobject.Object gobject) {
        return new InitiallyUnowned(gobject.refcounted());
    }
}
