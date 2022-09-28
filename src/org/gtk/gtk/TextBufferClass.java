package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The class structure for {@code GtkTextBuffer}.
 */
public class TextBufferClass extends io.github.jwharm.javagi.ResourceBase {

    public TextBufferClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public TextBufferClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkTextBufferClass.allocate(Interop.getAllocator()).address()));
    }
    
}
