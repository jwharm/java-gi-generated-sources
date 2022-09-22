package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class GLRenderer extends Renderer {

    public GLRenderer(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to GLRenderer */
    public static GLRenderer castFrom(org.gtk.gobject.Object gobject) {
        return new GLRenderer(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gsk_gl_renderer_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GskRenderer} using the new OpenGL renderer.
     */
    public GLRenderer() {
        super(constructNew());
    }
    
}
