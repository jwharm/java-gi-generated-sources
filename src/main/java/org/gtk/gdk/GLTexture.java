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
    protected GLTexture(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLTexture> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GLTexture(input, ownership);
    
    private static MemoryAddress constructNew(org.gtk.gdk.GLContext context, int id, int width, int height, org.gtk.glib.DestroyNotify destroy) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_gl_texture_new.invokeExact(
                    context.handle(),
                    id,
                    width,
                    height,
                    (Addressable) destroy.toCallback(),
                    (Addressable) MemoryAddress.NULL);
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
     */
    public GLTexture(org.gtk.gdk.GLContext context, int id, int width, int height, org.gtk.glib.DestroyNotify destroy) {
        super(constructNew(context, id, width, height, destroy), Ownership.FULL);
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_gl_texture_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link GLTexture.Builder} object constructs a {@link GLTexture} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link GLTexture.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gdk.Texture.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link GLTexture} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLTexture}.
         * @return A new instance of {@code GLTexture} with the properties 
         *         that were set in the Builder object.
         */
        public GLTexture build() {
            return (GLTexture) org.gtk.gobject.GObject.newWithProperties(
                GLTexture.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_gl_texture_new = Interop.downcallHandle(
            "gdk_gl_texture_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_gl_texture_release = Interop.downcallHandle(
            "gdk_gl_texture_release",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_gl_texture_get_type = Interop.downcallHandle(
            "gdk_gl_texture_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
