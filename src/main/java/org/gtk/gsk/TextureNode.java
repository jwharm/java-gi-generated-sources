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
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a TextureNode proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TextureNode(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TextureNode> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TextureNode(input);
    
    private static MemoryAddress constructNew(org.gtk.gdk.Texture texture, org.gtk.graphene.Rect bounds) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_texture_node_new.invokeExact(
                    texture.handle(),
                    bounds.handle());
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
    public TextureNode(org.gtk.gdk.Texture texture, org.gtk.graphene.Rect bounds) {
        super(constructNew(texture, bounds));
        this.takeOwnership();
    }
    
    /**
     * Retrieves the {@code GdkTexture} used when creating this {@code GskRenderNode}.
     * @return the {@code GdkTexture}
     */
    public org.gtk.gdk.Texture getTexture() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_texture_node_get_texture.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Texture) Interop.register(RESULT, org.gtk.gdk.Texture.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_texture_node_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_texture_node_new = Interop.downcallHandle(
                "gsk_texture_node_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_texture_node_get_texture = Interop.downcallHandle(
                "gsk_texture_node_get_texture",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_texture_node_get_type = Interop.downcallHandle(
                "gsk_texture_node_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gsk_texture_node_get_type != null;
    }
}
