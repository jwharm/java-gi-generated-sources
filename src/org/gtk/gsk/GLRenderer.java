package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

public class GLRenderer extends Renderer {

    public GLRenderer(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to GLRenderer */
    public static GLRenderer castFrom(org.gtk.gobject.Object gobject) {
        return new GLRenderer(gobject.getReference());
    }
    
    /**
     * Creates a new `GskRenderer` using the new OpenGL renderer.
     */
    public GLRenderer() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_gl_renderer_new(), true));
    }
    
}
