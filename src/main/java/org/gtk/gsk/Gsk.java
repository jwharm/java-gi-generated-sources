package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global Gsk namespace.
 */
public final class Gsk {
    
    @ApiStatus.Internal static void javagi$ensureInitialized() {}
    
    public static @NotNull org.gtk.glib.Quark serializationErrorQuark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_serialization_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Parses the given {@code string} into a transform and puts it in
     * {@code out_transform}.
     * <p>
     * Strings printed via {@link Transform#toString}
     * can be read in again successfully using this function.
     * <p>
     * If {@code string} does not describe a valid transform, {@code false} is
     * returned and {@code null} is put in {@code out_transform}.
     * @param string the string to parse
     * @param outTransform The location to put the transform in
     * @return {@code true} if {@code string} described a valid transform.
     */
    public static boolean transformParse(@NotNull java.lang.String string, @NotNull PointerProxy<org.gtk.gsk.Transform> outTransform) {
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        java.util.Objects.requireNonNull(outTransform, "Parameter 'outTransform' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_transform_parse.invokeExact(
                    Interop.allocateNativeString(string),
                    outTransform.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Retrieves the {@code GskRenderNode} stored inside the given {@code value}, and acquires
     * a reference to it.
     * @param value a {@code GObject.Value} initialized with type {@code GSK_TYPE_RENDER_NODE}
     * @return a {@code GskRenderNode}
     */
    public static @Nullable org.gtk.gsk.RenderNode valueDupRenderNode(@NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_value_dup_render_node.invokeExact(
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.RenderNode(RESULT, Ownership.FULL);
    }
    
    /**
     * Retrieves the {@code GskRenderNode} stored inside the given {@code value}.
     * @param value a {@code GValue} initialized with type {@code GSK_TYPE_RENDER_NODE}
     * @return a {@code GskRenderNode}
     */
    public static @Nullable org.gtk.gsk.RenderNode valueGetRenderNode(@NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_value_get_render_node.invokeExact(
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.RenderNode(RESULT, Ownership.NONE);
    }
    
    /**
     * Stores the given {@code GskRenderNode} inside {@code value}.
     * <p>
     * The {@code GObject.Value} will acquire a reference to the {@code node}.
     * @param value a {@code GObject.Value} initialized with type {@code GSK_TYPE_RENDER_NODE}
     * @param node a {@code GskRenderNode}
     */
    public static void valueSetRenderNode(@NotNull org.gtk.gobject.Value value, @NotNull org.gtk.gsk.RenderNode node) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        java.util.Objects.requireNonNull(node, "Parameter 'node' must not be null");
        try {
            DowncallHandles.gsk_value_set_render_node.invokeExact(
                    value.handle(),
                    node.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Stores the given {@code GskRenderNode} inside {@code value}.
     * <p>
     * This function transfers the ownership of the {@code node} to the {@code GValue}.
     * @param value a {@code GObject.Value} initialized with type {@code GSK_TYPE_RENDER_NODE}
     * @param node a {@code GskRenderNode}
     */
    public static void valueTakeRenderNode(@NotNull org.gtk.gobject.Value value, @Nullable org.gtk.gsk.RenderNode node) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gsk_value_take_render_node.invokeExact(
                    value.handle(),
                    (Addressable) (node == null ? MemoryAddress.NULL : node.refcounted().unowned().handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_serialization_error_quark = Interop.downcallHandle(
            "gsk_serialization_error_quark",
            FunctionDescriptor.of(ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gsk_transform_parse = Interop.downcallHandle(
            "gsk_transform_parse",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_value_dup_render_node = Interop.downcallHandle(
            "gsk_value_dup_render_node",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_value_get_render_node = Interop.downcallHandle(
            "gsk_value_get_render_node",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_value_set_render_node = Interop.downcallHandle(
            "gsk_value_set_render_node",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_value_take_render_node = Interop.downcallHandle(
            "gsk_value_take_render_node",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
    
    @ApiStatus.Internal
    public static class Callbacks {
        
        public static void cbParseErrorFunc(MemoryAddress start, MemoryAddress end, MemoryAddress error, MemoryAddress userData) {
            int HASH = userData.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (ParseErrorFunc) Interop.signalRegistry.get(HASH);
            HANDLER.onParseErrorFunc(new org.gtk.gsk.ParseLocation(start, Ownership.NONE), new org.gtk.gsk.ParseLocation(end, Ownership.NONE), new org.gtk.glib.Error(error, Ownership.NONE));
        }
    }
}
