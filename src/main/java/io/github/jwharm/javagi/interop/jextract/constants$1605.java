// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1605 {

    static final FunctionDescriptor graphene_matrix_equal_fast$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_matrix_equal_fast$MH = RuntimeHelper.downcallHandle(
        "graphene_matrix_equal_fast",
        constants$1605.graphene_matrix_equal_fast$FUNC
    );
    static final FunctionDescriptor graphene_matrix_print$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_matrix_print$MH = RuntimeHelper.downcallHandle(
        "graphene_matrix_print",
        constants$1605.graphene_matrix_print$FUNC
    );
    static final FunctionDescriptor graphene_matrix_decompose$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_matrix_decompose$MH = RuntimeHelper.downcallHandle(
        "graphene_matrix_decompose",
        constants$1605.graphene_matrix_decompose$FUNC
    );
    static final FunctionDescriptor graphene_point_alloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle graphene_point_alloc$MH = RuntimeHelper.downcallHandle(
        "graphene_point_alloc",
        constants$1605.graphene_point_alloc$FUNC
    );
    static final FunctionDescriptor graphene_point_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_point_free$MH = RuntimeHelper.downcallHandle(
        "graphene_point_free",
        constants$1605.graphene_point_free$FUNC
    );
    static final FunctionDescriptor graphene_point_init$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle graphene_point_init$MH = RuntimeHelper.downcallHandle(
        "graphene_point_init",
        constants$1605.graphene_point_init$FUNC
    );
}


