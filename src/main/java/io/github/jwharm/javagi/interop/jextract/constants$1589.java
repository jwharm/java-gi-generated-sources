// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1589 {

    static final FunctionDescriptor graphene_vec4_init$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle graphene_vec4_init$MH = RuntimeHelper.downcallHandle(
        "graphene_vec4_init",
        constants$1589.graphene_vec4_init$FUNC
    );
    static final FunctionDescriptor graphene_vec4_init_from_vec4$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_vec4_init_from_vec4$MH = RuntimeHelper.downcallHandle(
        "graphene_vec4_init_from_vec4",
        constants$1589.graphene_vec4_init_from_vec4$FUNC
    );
    static final FunctionDescriptor graphene_vec4_init_from_vec3$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle graphene_vec4_init_from_vec3$MH = RuntimeHelper.downcallHandle(
        "graphene_vec4_init_from_vec3",
        constants$1589.graphene_vec4_init_from_vec3$FUNC
    );
    static final FunctionDescriptor graphene_vec4_init_from_vec2$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle graphene_vec4_init_from_vec2$MH = RuntimeHelper.downcallHandle(
        "graphene_vec4_init_from_vec2",
        constants$1589.graphene_vec4_init_from_vec2$FUNC
    );
    static final FunctionDescriptor graphene_vec4_init_from_float$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_vec4_init_from_float$MH = RuntimeHelper.downcallHandle(
        "graphene_vec4_init_from_float",
        constants$1589.graphene_vec4_init_from_float$FUNC
    );
    static final FunctionDescriptor graphene_vec4_to_float$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_vec4_to_float$MH = RuntimeHelper.downcallHandle(
        "graphene_vec4_to_float",
        constants$1589.graphene_vec4_to_float$FUNC
    );
}


