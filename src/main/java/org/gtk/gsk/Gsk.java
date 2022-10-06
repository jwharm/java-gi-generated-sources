package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public final class Gsk {
    
    static final MethodHandle gsk_serialization_error_quark = Interop.downcallHandle(
        "gsk_serialization_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    public static org.gtk.glib.Quark serializationErrorQuark() {
        try {
            var RESULT = (int) gsk_serialization_error_quark.invokeExact();
            return new org.gtk.glib.Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_transform_parse = Interop.downcallHandle(
        "gsk_transform_parse",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Parses the given {@code string} into a transform and puts it in
     * {@code out_transform}.
     * <p>
     * Strings printed via {@link Transform#toString}
     * can be read in again successfully using this function.
     * <p>
     * If {@code string} does not describe a valid transform, {@code false} is
     * returned and {@code null} is put in {@code out_transform}.
     */
    public static boolean transformParse(java.lang.String string, PointerProxy<Transform> outTransform) {
        try {
            var RESULT = (int) gsk_transform_parse.invokeExact(Interop.allocateNativeString(string).handle(), outTransform.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_value_dup_render_node = Interop.downcallHandle(
        "gsk_value_dup_render_node",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the {@code GskRenderNode} stored inside the given {@code value}, and acquires
     * a reference to it.
     */
    public static RenderNode valueDupRenderNode(org.gtk.gobject.Value value) {
        try {
            var RESULT = (MemoryAddress) gsk_value_dup_render_node.invokeExact(value.handle());
            return new RenderNode(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_value_get_render_node = Interop.downcallHandle(
        "gsk_value_get_render_node",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the {@code GskRenderNode} stored inside the given {@code value}.
     */
    public static RenderNode valueGetRenderNode(org.gtk.gobject.Value value) {
        try {
            var RESULT = (MemoryAddress) gsk_value_get_render_node.invokeExact(value.handle());
            return new RenderNode(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_value_set_render_node = Interop.downcallHandle(
        "gsk_value_set_render_node",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Stores the given {@code GskRenderNode} inside {@code value}.
     * <p>
     * The {@code GObject.Value} will acquire a reference to the {@code node}.
     */
    public static void valueSetRenderNode(org.gtk.gobject.Value value, RenderNode node) {
        try {
            gsk_value_set_render_node.invokeExact(value.handle(), node.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_value_take_render_node = Interop.downcallHandle(
        "gsk_value_take_render_node",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Stores the given {@code GskRenderNode} inside {@code value}.
     * <p>
     * This function transfers the ownership of the {@code node} to the {@code GValue}.
     */
    public static void valueTakeRenderNode(org.gtk.gobject.Value value, RenderNode node) {
        try {
            gsk_value_take_render_node.invokeExact(value.handle(), node.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static void __cbParseErrorFunc(MemoryAddress start, MemoryAddress end, MemoryAddress error, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (ParseErrorFunc) Interop.signalRegistry.get(hash);
        handler.onParseErrorFunc(new ParseLocation(Refcounted.get(start, false)), new ParseLocation(Refcounted.get(end, false)), new org.gtk.glib.Error(Refcounted.get(error, false)));
    }
    
}
