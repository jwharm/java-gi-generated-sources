// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1639 {

    static final FunctionDescriptor graphene_triangle_get_barycoords$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_triangle_get_barycoords$MH = RuntimeHelper.downcallHandle(
        "graphene_triangle_get_barycoords",
        constants$1639.graphene_triangle_get_barycoords$FUNC
    );
    static final FunctionDescriptor graphene_triangle_get_uv$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_triangle_get_uv$MH = RuntimeHelper.downcallHandle(
        "graphene_triangle_get_uv",
        constants$1639.graphene_triangle_get_uv$FUNC
    );
    static final FunctionDescriptor graphene_triangle_contains_point$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_triangle_contains_point$MH = RuntimeHelper.downcallHandle(
        "graphene_triangle_contains_point",
        constants$1639.graphene_triangle_contains_point$FUNC
    );
    static final FunctionDescriptor graphene_triangle_equal$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_triangle_equal$MH = RuntimeHelper.downcallHandle(
        "graphene_triangle_equal",
        constants$1639.graphene_triangle_equal$FUNC
    );
    static final FunctionDescriptor graphene_ray_alloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle graphene_ray_alloc$MH = RuntimeHelper.downcallHandle(
        "graphene_ray_alloc",
        constants$1639.graphene_ray_alloc$FUNC
    );
    static final FunctionDescriptor graphene_ray_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_ray_free$MH = RuntimeHelper.downcallHandle(
        "graphene_ray_free",
        constants$1639.graphene_ray_free$FUNC
    );
}


