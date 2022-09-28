package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GtkGLAreaClass} structure contains only private data.
 */
public class GLAreaClass extends io.github.jwharm.javagi.ResourceBase {

    public GLAreaClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public GLAreaClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkGLAreaClass.allocate(Interop.getAllocator()).address()));
    }
    
}
