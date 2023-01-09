package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global Gsk namespace.
 */
public final class Gsk {
    
    static {
        registerTypes();
    }
    
    @ApiStatus.Internal public static void javagi$ensureInitialized() {}

public static org.gtk.glib.Quark serializationErrorQuark() {
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
public static boolean transformParse(java.lang.String string, Out<org.gtk.gsk.Transform> outTransform) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment outTransformPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_transform_parse.invokeExact(
                    Marshal.stringToAddress.marshal(string, SCOPE),
                    (Addressable) outTransformPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                outTransform.set(org.gtk.gsk.Transform.fromAddress.marshal(outTransformPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Retrieves the {@code GskRenderNode} stored inside the given {@code value}, and acquires
 * a reference to it.
 * @param value a {@code GObject.Value} initialized with type {@code GSK_TYPE_RENDER_NODE}
 * @return a {@code GskRenderNode}
 */
public static @Nullable org.gtk.gsk.RenderNode valueDupRenderNode(org.gtk.gobject.Value value) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gsk_value_dup_render_node.invokeExact(value.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = (org.gtk.gsk.RenderNode) Interop.register(RESULT, org.gtk.gsk.RenderNode.fromAddress).marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Retrieves the {@code GskRenderNode} stored inside the given {@code value}.
 * @param value a {@code GValue} initialized with type {@code GSK_TYPE_RENDER_NODE}
 * @return a {@code GskRenderNode}
 */
public static @Nullable org.gtk.gsk.RenderNode valueGetRenderNode(org.gtk.gobject.Value value) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gsk_value_get_render_node.invokeExact(value.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return (org.gtk.gsk.RenderNode) Interop.register(RESULT, org.gtk.gsk.RenderNode.fromAddress).marshal(RESULT, null);
}

/**
 * Stores the given {@code GskRenderNode} inside {@code value}.
 * <p>
 * The {@code GObject.Value} will acquire a reference to the {@code node}.
 * @param value a {@code GObject.Value} initialized with type {@code GSK_TYPE_RENDER_NODE}
 * @param node a {@code GskRenderNode}
 */
public static void valueSetRenderNode(org.gtk.gobject.Value value, org.gtk.gsk.RenderNode node) {
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
public static void valueTakeRenderNode(org.gtk.gobject.Value value, @Nullable org.gtk.gsk.RenderNode node) {
    try {
        DowncallHandles.gsk_value_take_render_node.invokeExact(
                value.handle(),
                (Addressable) (node == null ? MemoryAddress.NULL : node.handle()));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    node.yieldOwnership();
}
    
    private static class DowncallHandles {

private static final MethodHandle gsk_serialization_error_quark = Interop.downcallHandle(
        "gsk_serialization_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gsk_transform_parse = Interop.downcallHandle(
        "gsk_transform_parse",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gsk_value_dup_render_node = Interop.downcallHandle(
        "gsk_value_dup_render_node",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gsk_value_get_render_node = Interop.downcallHandle(
        "gsk_value_get_render_node",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gsk_value_set_render_node = Interop.downcallHandle(
        "gsk_value_set_render_node",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gsk_value_take_render_node = Interop.downcallHandle(
        "gsk_value_take_render_node",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);
    }
    
    @ApiStatus.Internal
    public static class Callbacks {
    }
    
    private static void registerTypes() {
        if (BlendNode.isAvailable()) Interop.register(BlendNode.getType(), BlendNode.fromAddress);
        if (BlurNode.isAvailable()) Interop.register(BlurNode.getType(), BlurNode.fromAddress);
        if (BorderNode.isAvailable()) Interop.register(BorderNode.getType(), BorderNode.fromAddress);
        if (BroadwayRenderer.isAvailable()) Interop.register(BroadwayRenderer.getType(), BroadwayRenderer.fromAddress);
        if (CairoNode.isAvailable()) Interop.register(CairoNode.getType(), CairoNode.fromAddress);
        if (CairoRenderer.isAvailable()) Interop.register(CairoRenderer.getType(), CairoRenderer.fromAddress);
        if (ClipNode.isAvailable()) Interop.register(ClipNode.getType(), ClipNode.fromAddress);
        if (ColorMatrixNode.isAvailable()) Interop.register(ColorMatrixNode.getType(), ColorMatrixNode.fromAddress);
        if (ColorNode.isAvailable()) Interop.register(ColorNode.getType(), ColorNode.fromAddress);
        if (ConicGradientNode.isAvailable()) Interop.register(ConicGradientNode.getType(), ConicGradientNode.fromAddress);
        if (ContainerNode.isAvailable()) Interop.register(ContainerNode.getType(), ContainerNode.fromAddress);
        if (CrossFadeNode.isAvailable()) Interop.register(CrossFadeNode.getType(), CrossFadeNode.fromAddress);
        if (DebugNode.isAvailable()) Interop.register(DebugNode.getType(), DebugNode.fromAddress);
        if (GLRenderer.isAvailable()) Interop.register(GLRenderer.getType(), GLRenderer.fromAddress);
        if (GLShader.isAvailable()) Interop.register(GLShader.getType(), GLShader.fromAddress);
        if (GLShaderNode.isAvailable()) Interop.register(GLShaderNode.getType(), GLShaderNode.fromAddress);
        if (InsetShadowNode.isAvailable()) Interop.register(InsetShadowNode.getType(), InsetShadowNode.fromAddress);
        if (LinearGradientNode.isAvailable()) Interop.register(LinearGradientNode.getType(), LinearGradientNode.fromAddress);
        if (NglRenderer.isAvailable()) Interop.register(NglRenderer.getType(), NglRenderer.fromAddress);
        if (OpacityNode.isAvailable()) Interop.register(OpacityNode.getType(), OpacityNode.fromAddress);
        if (OutsetShadowNode.isAvailable()) Interop.register(OutsetShadowNode.getType(), OutsetShadowNode.fromAddress);
        if (RadialGradientNode.isAvailable()) Interop.register(RadialGradientNode.getType(), RadialGradientNode.fromAddress);
        if (RenderNode.isAvailable()) Interop.register(RenderNode.getType(), RenderNode.fromAddress);
        if (Renderer.isAvailable()) Interop.register(Renderer.getType(), Renderer.fromAddress);
        if (RepeatNode.isAvailable()) Interop.register(RepeatNode.getType(), RepeatNode.fromAddress);
        if (RepeatingLinearGradientNode.isAvailable()) Interop.register(RepeatingLinearGradientNode.getType(), RepeatingLinearGradientNode.fromAddress);
        if (RepeatingRadialGradientNode.isAvailable()) Interop.register(RepeatingRadialGradientNode.getType(), RepeatingRadialGradientNode.fromAddress);
        if (RoundedClipNode.isAvailable()) Interop.register(RoundedClipNode.getType(), RoundedClipNode.fromAddress);
        if (ShadowNode.isAvailable()) Interop.register(ShadowNode.getType(), ShadowNode.fromAddress);
        if (TextNode.isAvailable()) Interop.register(TextNode.getType(), TextNode.fromAddress);
        if (TextureNode.isAvailable()) Interop.register(TextureNode.getType(), TextureNode.fromAddress);
        if (TransformNode.isAvailable()) Interop.register(TransformNode.getType(), TransformNode.fromAddress);
    }
}
