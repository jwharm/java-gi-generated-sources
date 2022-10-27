package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class NglRenderer extends org.gtk.gsk.Renderer {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public NglRenderer(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to NglRenderer */
    public static NglRenderer castFrom(org.gtk.gobject.Object gobject) {
        return new NglRenderer(gobject.refcounted());
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_ngl_renderer_new = Interop.downcallHandle(
            "gsk_ngl_renderer_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
    }
}
