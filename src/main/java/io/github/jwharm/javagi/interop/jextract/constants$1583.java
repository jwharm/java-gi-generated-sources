// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1583 {

    static final FunctionDescriptor graphene_vec3_alloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle graphene_vec3_alloc$MH = RuntimeHelper.downcallHandle(
        "graphene_vec3_alloc",
        constants$1583.graphene_vec3_alloc$FUNC
    );
    static final FunctionDescriptor graphene_vec3_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_vec3_free$MH = RuntimeHelper.downcallHandle(
        "graphene_vec3_free",
        constants$1583.graphene_vec3_free$FUNC
    );
    static final FunctionDescriptor graphene_vec3_init$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle graphene_vec3_init$MH = RuntimeHelper.downcallHandle(
        "graphene_vec3_init",
        constants$1583.graphene_vec3_init$FUNC
    );
    static final FunctionDescriptor graphene_vec3_init_from_vec3$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_vec3_init_from_vec3$MH = RuntimeHelper.downcallHandle(
        "graphene_vec3_init_from_vec3",
        constants$1583.graphene_vec3_init_from_vec3$FUNC
    );
    static final FunctionDescriptor graphene_vec3_init_from_float$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_vec3_init_from_float$MH = RuntimeHelper.downcallHandle(
        "graphene_vec3_init_from_float",
        constants$1583.graphene_vec3_init_from_float$FUNC
    );
    static final FunctionDescriptor graphene_vec3_to_float$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_vec3_to_float$MH = RuntimeHelper.downcallHandle(
        "graphene_vec3_to_float",
        constants$1583.graphene_vec3_to_float$FUNC
    );
}


