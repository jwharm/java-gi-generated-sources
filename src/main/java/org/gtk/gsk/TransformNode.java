package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node applying a {@code GskTransform} to its single child node.
 */
public class TransformNode extends org.gtk.gsk.RenderNode {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskTransformNode";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a TransformNode proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TransformNode(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to TransformNode if its GType is a (or inherits from) "GskTransformNode".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code TransformNode} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GskTransformNode", a ClassCastException will be thrown.
     */
    public static TransformNode castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), TransformNode.getType())) {
            return new TransformNode(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GskTransformNode");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gsk.RenderNode child, @NotNull org.gtk.gsk.Transform transform) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        java.util.Objects.requireNonNull(transform, "Parameter 'transform' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_transform_node_new.invokeExact(
                    child.handle(),
                    transform.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will transform the given {@code child}
     * with the given {@code transform}.
     * @param child The node to transform
     * @param transform The transform to apply
     */
    public TransformNode(@NotNull org.gtk.gsk.RenderNode child, @NotNull org.gtk.gsk.Transform transform) {
        super(constructNew(child, transform), Ownership.FULL);
    }
    
    /**
     * Gets the child node that is getting transformed by the given {@code node}.
     * @return The child that is getting transformed
     */
    public @NotNull org.gtk.gsk.RenderNode getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_transform_node_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.RenderNode(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the {@code GskTransform} used by the {@code node}.
     * @return a {@code GskTransform}
     */
    public @NotNull org.gtk.gsk.Transform getTransform() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_transform_node_get_transform.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.Transform(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_transform_node_get_type.invokeExact();
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
         * A {@link TransformNode.Build} object constructs a {@link TransformNode} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link TransformNode} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TransformNode} using {@link TransformNode#castFrom}.
         * @return A new instance of {@code TransformNode} with the properties 
         *         that were set in the Build object.
         */
        public TransformNode construct() {
            return TransformNode.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    TransformNode.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_transform_node_new = Interop.downcallHandle(
            "gsk_transform_node_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_transform_node_get_child = Interop.downcallHandle(
            "gsk_transform_node_get_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_transform_node_get_transform = Interop.downcallHandle(
            "gsk_transform_node_get_transform",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_transform_node_get_type = Interop.downcallHandle(
            "gsk_transform_node_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
