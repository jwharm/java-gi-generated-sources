package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GdkTexture` representing image data in memory.
 */
public class MemoryTexture extends Texture implements Paintable, org.gtk.gio.Icon, org.gtk.gio.LoadableIcon {

    public MemoryTexture(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to MemoryTexture */
    public static MemoryTexture castFrom(org.gtk.gobject.Object gobject) {
        return new MemoryTexture(gobject.getProxy());
    }
    
    /**
     * Creates a new texture for a blob of image data.
     * 
     * The `GBytes` must contain @stride × @height pixels
     * in the given format.
     */
    public MemoryTexture(int width, int height, MemoryFormat format, org.gtk.glib.Bytes bytes, long stride) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_memory_texture_new(width, height, format.getValue(), bytes.HANDLE(), stride), true));
    }
    
}
