package org.gtk.gdk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The list of functions that can be implemented for the {@code GdkPaintable}
 * interface.
 * <p>
 * Note that apart from the {@link Paintable#snapshot} function,
 * no virtual function of this interface is mandatory to implement, though it
 * is a good idea to implement {@link Paintable#getCurrentImage}
 * for non-static paintables and {@link Paintable#getFlags} if the
 * image is not dynamic as the default implementation returns no flags and
 * that will make the implementation likely quite slow.
 */
public class PaintableInterface extends io.github.jwharm.javagi.ResourceBase {

    public PaintableInterface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public PaintableInterface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GdkPaintableInterface.allocate(Interop.getAllocator()).address()));
    }
    
}
