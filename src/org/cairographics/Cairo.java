package org.cairographics;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

public final class Cairo {
    
    public static void imageSurfaceCreate() {
        gtk_h.cairo_image_surface_create();
    }
    
}