package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A GdkTexture representing a GL texture object.
 */
public class GLTexture extends org.gtk.gdk.Texture implements org.gtk.gdk.Paintable, org.gtk.gio.Icon, org.gtk.gio.LoadableIcon {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public GLTexture(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to GLTexture */
    public static GLTexture castFrom(org.gtk.gobject.Object gobject) {
        return new GLTexture(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gdk.GLContext context, int id, int width, int height, @NotNull org.gtk.glib.DestroyNotify destroy, @Nullable java.lang.foreign.MemoryAddress data) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gdk_gl_texture_new.invokeExact(context.handle(), id, width, height, 
                    Interop.cbDestroyNotifySymbol(), data), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new texture for an existing GL texture.
     * <p>
     * Note that the GL texture must not be modified until {@code destroy} is called,
     * which will happen when the GdkTexture object is finalized, or due to
     * an explicit call of {@link GLTexture#release}.
     * @param context a {@code GdkGLContext}
     * @param id the ID of a texture that was created with {@code context}
     * @param width the nominal width of the texture
     * @param height the nominal height of the texture
     * @param destroy a destroy notify that will be called when the GL resources
     *   are released
     * @param data data that gets passed to {@code destroy}
     */
    public GLTexture(@NotNull org.gtk.gdk.GLContext context, int id, int width, int height, @NotNull org.gtk.glib.DestroyNotify destroy, @Nullable java.lang.foreign.MemoryAddress data) {
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
        try {
            DowncallHandles.gdk_gl_texture_release.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_gl_texture_new = Interop.downcallHandle(
            "gdk_gl_texture_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_gl_texture_release = Interop.downcallHandle(
            "gdk_gl_texture_release",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
    }
}
