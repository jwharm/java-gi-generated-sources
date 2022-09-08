package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The list of functions that can be implemented for the `GdkPaintable`
 * interface.
 * 
 * Note that apart from the [vfunc@Gdk.Paintable.snapshot] function,
 * no virtual function of this interface is mandatory to implement, though it
 * is a good idea to implement [vfunc@Gdk.Paintable.get_current_image]
 * for non-static paintables and [vfunc@Gdk.Paintable.get_flags] if the
 * image is not dynamic as the default implementation returns no flags and
 * that will make the implementation likely quite slow.
 */
public class PaintableInterface extends io.github.jwharm.javagi.interop.ResourceBase {

    public PaintableInterface(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
}
