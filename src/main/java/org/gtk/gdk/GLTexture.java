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
    
    private static final java.lang.String C_TYPE_NAME = "GdkGLTexture";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a GLTexture proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLTexture(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to GLTexture if its GType is a (or inherits from) "GdkGLTexture".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "GLTexture" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkGLTexture", a ClassCastException will be thrown.
     */
    public static GLTexture castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GdkGLTexture"))) {
            return new GLTexture(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkGLTexture");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gdk.GLContext context, int id, int width, int height, @NotNull org.gtk.glib.DestroyNotify destroy, @Nullable java.lang.foreign.MemoryAddress data) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_gl_texture_new.invokeExact(
                    context.handle(),
                    id,
                    width,
                    height,
                    Interop.cbDestroyNotifySymbol(),
                    data);
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
        super(constructNew(context, id, width, height, destroy, data), Ownership.FULL);
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
            DowncallHandles.gdk_gl_texture_release.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_gl_texture_new = Interop.downcallHandle(
            "gdk_gl_texture_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_gl_texture_release = Interop.downcallHandle(
            "gdk_gl_texture_release",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
    }
}
