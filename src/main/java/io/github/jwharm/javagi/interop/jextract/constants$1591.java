// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1591 {

    static final FunctionDescriptor graphene_vec4_normalize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_vec4_normalize$MH = RuntimeHelper.downcallHandle(
        "graphene_vec4_normalize",
        constants$1591.graphene_vec4_normalize$FUNC
    );
    static final FunctionDescriptor graphene_vec4_scale$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_vec4_scale$MH = RuntimeHelper.downcallHandle(
        "graphene_vec4_scale",
        constants$1591.graphene_vec4_scale$FUNC
    );
    static final FunctionDescriptor graphene_vec4_negate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_vec4_negate$MH = RuntimeHelper.downcallHandle(
        "graphene_vec4_negate",
        constants$1591.graphene_vec4_negate$FUNC
    );
    static final FunctionDescriptor graphene_vec4_equal$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_vec4_equal$MH = RuntimeHelper.downcallHandle(
        "graphene_vec4_equal",
        constants$1591.graphene_vec4_equal$FUNC
    );
    static final FunctionDescriptor graphene_vec4_near$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle graphene_vec4_near$MH = RuntimeHelper.downcallHandle(
        "graphene_vec4_near",
        constants$1591.graphene_vec4_near$FUNC
    );
    static final FunctionDescriptor graphene_vec4_min$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_vec4_min$MH = RuntimeHelper.downcallHandle(
        "graphene_vec4_min",
        constants$1591.graphene_vec4_min$FUNC
    );
}


