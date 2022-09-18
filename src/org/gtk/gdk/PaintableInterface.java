package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The list of functions that can be implemented for the <code>GdkPaintable</code>
 * interface.
 * 
 * Note that apart from the {@link org.gtk.gdk.Paintable<code>#snapshot</code>  function,
 * no virtual function of this interface is mandatory to implement, though it
 * is a good idea to implement {@link org.gtk.gdk.Paintable<code>#getCurrentImage</code> 
 * for non-static paintables and {@link org.gtk.gdk.Paintable<code>#getFlags</code>  if the
 * image is not dynamic as the default implementation returns no flags and
 * that will make the implementation likely quite slow.
 */
public class PaintableInterface extends io.github.jwharm.javagi.ResourceBase {

    public PaintableInterface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
}
