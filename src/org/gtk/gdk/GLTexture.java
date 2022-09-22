package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A GdkTexture representing a GL texture object.
 */
public class GLTexture extends Texture implements Paintable, org.gtk.gio.Icon, org.gtk.gio.LoadableIcon {

    public GLTexture(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to GLTexture */
    public static GLTexture castFrom(org.gtk.gobject.Object gobject) {
        return new GLTexture(gobject.getReference());
    }
    
    private static Reference constructNew(GLContext context, int id, int width, int height, org.gtk.glib.DestroyNotify destroy, java.lang.foreign.MemoryAddress data) {
        Reference RESULT = References.get(gtk_h.gdk_gl_texture_new(context.handle(), id, width, height, 
                    Interop.cbDestroyNotifySymbol(), data), true);
        return RESULT;
    }
    
    /**
     * Creates a new texture for an existing GL texture.
     * <p>
     * Note that the GL texture must not be modified until {@code destroy} is called,
     * which will happen when the GdkTexture object is finalized, or due to
     * an explicit call of {@link GLTexture#release}.
     */
    public GLTexture(GLContext context, int id, int width, int height, org.gtk.glib.DestroyNotify destroy, java.lang.foreign.MemoryAddress data) {
        super(constructNew(context, id, width, height, destroy, data));
    }
    
    /**
     * Releases the GL resources held by a {@code GdkGLTexture}.
     * <p>
     * The texture contents are still available via the
     * {@link Texture#download} function, after this
     * function has been called.
     */
    public void release() {
        gtk_h.gdk_gl_texture_release(handle());
    }
    
}
