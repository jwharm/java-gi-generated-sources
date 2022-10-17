package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node for a {@code GdkTexture}.
 */
public class TextureNode extends RenderNode {

    public TextureNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TextureNode */
    public static TextureNode castFrom(org.gtk.gobject.Object gobject) {
        return new TextureNode(gobject.refcounted());
    }
    
    private static final MethodHandle gsk_texture_node_new = Interop.downcallHandle(
        "gsk_texture_node_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull org.gtk.gdk.Texture texture, @NotNull org.gtk.graphene.Rect bounds) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gsk_texture_node_new.invokeExact(texture.handle(), bounds.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GskRenderNode} that will render the given
     * {@code texture} into the area given by {@code bounds}.
     */
    public TextureNode(@NotNull org.gtk.gdk.Texture texture, @NotNull org.gtk.graphene.Rect bounds) {
        super(constructNew(texture, bounds));
    }
    
    private static final MethodHandle gsk_texture_node_get_texture = Interop.downcallHandle(
        "gsk_texture_node_get_texture",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the {@code GdkTexture} used when creating this {@code GskRenderNode}.
     */
    public @NotNull org.gtk.gdk.Texture getTexture() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_texture_node_get_texture.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Texture(Refcounted.get(RESULT, false));
    }
    
}
