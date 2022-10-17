package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A GdkTexture representing a GL texture object.
 */
public class GLTexture extends Texture implements Paintable, org.gtk.gio.Icon, org.gtk.gio.LoadableIcon {

    public GLTexture(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to GLTexture */
    public static GLTexture castFrom(org.gtk.gobject.Object gobject) {
        return new GLTexture(gobject.refcounted());
    }
    
    private static final MethodHandle gdk_gl_texture_new = Interop.downcallHandle(
        "gdk_gl_texture_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull GLContext context, @NotNull int id, @NotNull int width, @NotNull int height, @NotNull org.gtk.glib.DestroyNotify destroy, @Nullable java.lang.foreign.MemoryAddress data) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gdk_gl_texture_new.invokeExact(context.handle(), id, width, height, 
                    Interop.cbDestroyNotifySymbol(), data), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new texture for an existing GL texture.
     * <p>
     * Note that the GL texture must not be modified until {@code destroy} is called,
     * which will happen when the GdkTexture object is finalized, or due to
     * an explicit call of {@link GLTexture#release}.
     */
    public GLTexture(@NotNull GLContext context, @NotNull int id, @NotNull int width, @NotNull int height, @NotNull org.gtk.glib.DestroyNotify destroy, @Nullable java.lang.foreign.MemoryAddress data) {
        super(constructNew(context, id, width, height, destroy, data));
    }
    
    private static final MethodHandle gdk_gl_texture_release = Interop.downcallHandle(
        "gdk_gl_texture_release",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Releases the GL resources held by a {@code GdkGLTexture}.
     * <p>
     * The texture contents are still available via the
     * {@link Texture#download} function, after this
     * function has been called.
     */
    public @NotNull void release() {
        try {
            gdk_gl_texture_release.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
