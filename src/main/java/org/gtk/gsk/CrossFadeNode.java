package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node cross fading between two child nodes.
 */
public class CrossFadeNode extends org.gtk.gsk.RenderNode {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskCrossFadeNode";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a CrossFadeNode proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public CrossFadeNode(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to CrossFadeNode if its GType is a (or inherits from) "GskCrossFadeNode".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code CrossFadeNode} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GskCrossFadeNode", a ClassCastException will be thrown.
     */
    public static CrossFadeNode castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), CrossFadeNode.getType())) {
            return new CrossFadeNode(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GskCrossFadeNode");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gsk.RenderNode start, @NotNull org.gtk.gsk.RenderNode end, float progress) {
        java.util.Objects.requireNonNull(start, "Parameter 'start' must not be null");
        java.util.Objects.requireNonNull(end, "Parameter 'end' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_cross_fade_node_new.invokeExact(
                    start.handle(),
                    end.handle(),
                    progress);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will do a cross-fade between {@code start} and {@code end}.
     * @param start The start node to be drawn
     * @param end The node to be cross_fadeed onto the {@code start} node
     * @param progress How far the fade has progressed from start to end. The value will
     *     be clamped to the range [0 ... 1]
     */
    public CrossFadeNode(@NotNull org.gtk.gsk.RenderNode start, @NotNull org.gtk.gsk.RenderNode end, float progress) {
        super(constructNew(start, end, progress), Ownership.FULL);
    }
    
    /**
     * Retrieves the child {@code GskRenderNode} at the end of the cross-fade.
     * @return a {@code GskRenderNode}
     */
    public @NotNull org.gtk.gsk.RenderNode getEndChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_cross_fade_node_get_end_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.RenderNode(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the progress value of the cross fade.
     * @return the progress value, between 0 and 1
     */
    public float getProgress() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gsk_cross_fade_node_get_progress.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the child {@code GskRenderNode} at the beginning of the cross-fade.
     * @return a {@code GskRenderNode}
     */
    public @NotNull org.gtk.gsk.RenderNode getStartChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_cross_fade_node_get_start_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.RenderNode(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_cross_fade_node_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gsk.RenderNode.Build {
        
         /**
         * A {@link CrossFadeNode.Build} object constructs a {@link CrossFadeNode} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link CrossFadeNode} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CrossFadeNode} using {@link CrossFadeNode#castFrom}.
         * @return A new instance of {@code CrossFadeNode} with the properties 
         *         that were set in the Build object.
         */
        public CrossFadeNode construct() {
            return CrossFadeNode.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    CrossFadeNode.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_cross_fade_node_new = Interop.downcallHandle(
            "gsk_cross_fade_node_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle gsk_cross_fade_node_get_end_child = Interop.downcallHandle(
            "gsk_cross_fade_node_get_end_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_cross_fade_node_get_progress = Interop.downcallHandle(
            "gsk_cross_fade_node_get_progress",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_cross_fade_node_get_start_child = Interop.downcallHandle(
            "gsk_cross_fade_node_get_start_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_cross_fade_node_get_type = Interop.downcallHandle(
            "gsk_cross_fade_node_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
