package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GdkTexture} representing image data in memory.
 */
public class MemoryTexture extends Texture implements Paintable, org.gtk.gio.Icon, org.gtk.gio.LoadableIcon {

    public MemoryTexture(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to MemoryTexture */
    public static MemoryTexture castFrom(org.gtk.gobject.Object gobject) {
        return new MemoryTexture(gobject.getReference());
    }
    
    private static Reference constructNew(int width, int height, MemoryFormat format, org.gtk.glib.Bytes bytes, long stride) {
        Reference RESULT = References.get(gtk_h.gdk_memory_texture_new(width, height, format.getValue(), bytes.handle(), stride), true);
        return RESULT;
    }
    
    /**
     * Creates a new texture for a blob of image data.
     * <p>
     * The {@code GBytes} must contain {@code stride} × {@code height} pixels
     * in the given format.
     */
    public MemoryTexture(int width, int height, MemoryFormat format, org.gtk.glib.Bytes bytes, long stride) {
        super(constructNew(width, height, format, bytes, stride));
    }
    
}
