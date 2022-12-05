package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node controlling the opacity of its single child node.
 */
public class OpacityNode extends org.gtk.gsk.RenderNode {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskOpacityNode";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a OpacityNode proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public OpacityNode(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to OpacityNode if its GType is a (or inherits from) "GskOpacityNode".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code OpacityNode} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GskOpacityNode", a ClassCastException will be thrown.
     */
    public static OpacityNode castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), OpacityNode.getType())) {
            return new OpacityNode(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GskOpacityNode");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gsk.RenderNode child, float opacity) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_opacity_node_new.invokeExact(
                    child.handle(),
                    opacity);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will drawn the {@code child} with reduced
     * {@code opacity}.
     * @param child The node to draw
     * @param opacity The opacity to apply
     */
    public OpacityNode(@NotNull org.gtk.gsk.RenderNode child, float opacity) {
        super(constructNew(child, opacity), Ownership.FULL);
    }
    
    /**
     * Gets the child node that is getting opacityed by the given {@code node}.
     * @return The child that is getting opacityed
     */
    public @NotNull org.gtk.gsk.RenderNode getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_opacity_node_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.RenderNode(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the transparency factor for an opacity node.
     * @return the opacity factor
     */
    public float getOpacity() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gsk_opacity_node_get_opacity.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_opacity_node_get_type.invokeExact();
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
         * A {@link OpacityNode.Build} object constructs a {@link OpacityNode} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link OpacityNode} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link OpacityNode} using {@link OpacityNode#castFrom}.
         * @return A new instance of {@code OpacityNode} with the properties 
         *         that were set in the Build object.
         */
        public OpacityNode construct() {
            return OpacityNode.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    OpacityNode.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_opacity_node_new = Interop.downcallHandle(
            "gsk_opacity_node_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle gsk_opacity_node_get_child = Interop.downcallHandle(
            "gsk_opacity_node_get_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_opacity_node_get_opacity = Interop.downcallHandle(
            "gsk_opacity_node_get_opacity",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_opacity_node_get_type = Interop.downcallHandle(
            "gsk_opacity_node_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
