// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1594 {

    static final FunctionDescriptor graphene_vec4_z_axis$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle graphene_vec4_z_axis$MH = RuntimeHelper.downcallHandle(
        "graphene_vec4_z_axis",
        constants$1594.graphene_vec4_z_axis$FUNC
    );
    static final FunctionDescriptor graphene_vec4_w_axis$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle graphene_vec4_w_axis$MH = RuntimeHelper.downcallHandle(
        "graphene_vec4_w_axis",
        constants$1594.graphene_vec4_w_axis$FUNC
    );
    static final FunctionDescriptor graphene_matrix_alloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle graphene_matrix_alloc$MH = RuntimeHelper.downcallHandle(
        "graphene_matrix_alloc",
        constants$1594.graphene_matrix_alloc$FUNC
    );
    static final FunctionDescriptor graphene_matrix_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_matrix_free$MH = RuntimeHelper.downcallHandle(
        "graphene_matrix_free",
        constants$1594.graphene_matrix_free$FUNC
    );
    static final FunctionDescriptor graphene_matrix_init_identity$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_matrix_init_identity$MH = RuntimeHelper.downcallHandle(
        "graphene_matrix_init_identity",
        constants$1594.graphene_matrix_init_identity$FUNC
    );
    static final FunctionDescriptor graphene_matrix_init_from_float$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_matrix_init_from_float$MH = RuntimeHelper.downcallHandle(
        "graphene_matrix_init_from_float",
        constants$1594.graphene_matrix_init_from_float$FUNC
    );
}


