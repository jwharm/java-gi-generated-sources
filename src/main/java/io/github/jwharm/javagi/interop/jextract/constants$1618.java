// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1618 {

    static final FunctionDescriptor graphene_quad_bounds$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_quad_bounds$MH = RuntimeHelper.downcallHandle(
        "graphene_quad_bounds",
        constants$1618.graphene_quad_bounds$FUNC
    );
    static final FunctionDescriptor graphene_quad_get_point$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle graphene_quad_get_point$MH = RuntimeHelper.downcallHandle(
        "graphene_quad_get_point",
        constants$1618.graphene_quad_get_point$FUNC
    );
    static final FunctionDescriptor graphene_quaternion_alloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle graphene_quaternion_alloc$MH = RuntimeHelper.downcallHandle(
        "graphene_quaternion_alloc",
        constants$1618.graphene_quaternion_alloc$FUNC
    );
    static final FunctionDescriptor graphene_quaternion_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_quaternion_free$MH = RuntimeHelper.downcallHandle(
        "graphene_quaternion_free",
        constants$1618.graphene_quaternion_free$FUNC
    );
    static final FunctionDescriptor graphene_quaternion_init$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle graphene_quaternion_init$MH = RuntimeHelper.downcallHandle(
        "graphene_quaternion_init",
        constants$1618.graphene_quaternion_init$FUNC
    );
    static final FunctionDescriptor graphene_quaternion_init_identity$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_quaternion_init_identity$MH = RuntimeHelper.downcallHandle(
        "graphene_quaternion_init_identity",
        constants$1618.graphene_quaternion_init_identity$FUNC
    );
}


