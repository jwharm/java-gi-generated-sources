// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1625 {

    static final FunctionDescriptor graphene_euler_get_gamma$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_euler_get_gamma$MH = RuntimeHelper.downcallHandle(
        "graphene_euler_get_gamma",
        constants$1625.graphene_euler_get_gamma$FUNC
    );
    static final FunctionDescriptor graphene_euler_to_vec3$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_euler_to_vec3$MH = RuntimeHelper.downcallHandle(
        "graphene_euler_to_vec3",
        constants$1625.graphene_euler_to_vec3$FUNC
    );
    static final FunctionDescriptor graphene_euler_to_matrix$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_euler_to_matrix$MH = RuntimeHelper.downcallHandle(
        "graphene_euler_to_matrix",
        constants$1625.graphene_euler_to_matrix$FUNC
    );
    static final FunctionDescriptor graphene_euler_to_quaternion$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_euler_to_quaternion$MH = RuntimeHelper.downcallHandle(
        "graphene_euler_to_quaternion",
        constants$1625.graphene_euler_to_quaternion$FUNC
    );
    static final FunctionDescriptor graphene_euler_reorder$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_euler_reorder$MH = RuntimeHelper.downcallHandle(
        "graphene_euler_reorder",
        constants$1625.graphene_euler_reorder$FUNC
    );
    static final FunctionDescriptor graphene_plane_alloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle graphene_plane_alloc$MH = RuntimeHelper.downcallHandle(
        "graphene_plane_alloc",
        constants$1625.graphene_plane_alloc$FUNC
    );
}


