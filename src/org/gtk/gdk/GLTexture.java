package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A GdkTexture representing a GL texture object.
 */
public class GLTexture extends Texture implements Paintable, org.gtk.gio.Icon, org.gtk.gio.LoadableIcon {

    public GLTexture(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to GLTexture */
    public static GLTexture castFrom(org.gtk.gobject.Object gobject) {
        return new GLTexture(gobject.getProxy());
    }
    
    /**
     * Releases the GL resources held by a `GdkGLTexture`.
     * 
     * The texture contents are still available via the
     * [method@Gdk.Texture.download] function, after this
     * function has been called.
     */
    public void release() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_gl_texture_release(HANDLE());
    }
    
}
