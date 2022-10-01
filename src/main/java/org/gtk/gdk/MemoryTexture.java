package org.gtk.gdk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GdkTexture} representing image data in memory.
 */
public class MemoryTexture extends Texture implements Paintable, org.gtk.gio.Icon, org.gtk.gio.LoadableIcon {

    public MemoryTexture(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to MemoryTexture */
    public static MemoryTexture castFrom(org.gtk.gobject.Object gobject) {
        return new MemoryTexture(gobject.refcounted());
    }
    
    private static Refcounted constructNew(int width, int height, MemoryFormat format, org.gtk.glib.Bytes bytes, long stride) {
        Refcounted RESULT = Refcounted.get(gtk_h.gdk_memory_texture_new(width, height, format.getValue(), bytes.handle(), stride), true);
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
