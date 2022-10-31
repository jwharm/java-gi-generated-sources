package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node for a {@code GdkTexture}.
 */
public class TextureNode extends org.gtk.gsk.RenderNode {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskTextureNode";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public TextureNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to TextureNode if its GType is a (or inherits from) "GskTextureNode".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "TextureNode" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GskTextureNode", a ClassCastException will be thrown.
     */
    public static TextureNode castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GskTextureNode"))) {
            return new TextureNode(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GskTextureNode");
        }
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gdk.Texture texture, @NotNull org.gtk.graphene.Rect bounds) {
        java.util.Objects.requireNonNull(texture, "Parameter 'texture' must not be null");
        java.util.Objects.requireNonNull(bounds, "Parameter 'bounds' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gsk_texture_node_new.invokeExact(
                    texture.handle(),
                    bounds.handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will render the given
     * {@code texture} into the area given by {@code bounds}.
     * @param texture the {@code GdkTexture}
     * @param bounds the rectangle to render the texture into
     */
    public TextureNode(@NotNull org.gtk.gdk.Texture texture, @NotNull org.gtk.graphene.Rect bounds) {
        super(constructNew(texture, bounds));
    }
    
    /**
     * Retrieves the {@code GdkTexture} used when creating this {@code GskRenderNode}.
     * @return the {@code GdkTexture}
     */
    public @NotNull org.gtk.gdk.Texture getTexture() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_texture_node_get_texture.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Texture(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_texture_node_new = Interop.downcallHandle(
            "gsk_texture_node_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_texture_node_get_texture = Interop.downcallHandle(
            "gsk_texture_node_get_texture",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
