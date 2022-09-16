package org.gtk.gdkpixbuf;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

public final class GdkPixbuf {
    
    public static final int PIXBUF_MAJOR = 2;

    public static final int PIXBUF_MICRO = 9;

    public static final int PIXBUF_MINOR = 42;

    public static final java.lang.String PIXBUF_VERSION = "2.42.9";

    public static org.gtk.glib.Quark pixbufErrorQuark() {
        var RESULT = gtk_h.gdk_pixbuf_error_quark();
        return new org.gtk.glib.Quark(RESULT);
    }
    
}
