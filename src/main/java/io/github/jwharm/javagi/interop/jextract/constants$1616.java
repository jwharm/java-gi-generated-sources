// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1616 {

    static final FunctionDescriptor graphene_point3d_length$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_point3d_length$MH = RuntimeHelper.downcallHandle(
        "graphene_point3d_length",
        constants$1616.graphene_point3d_length$FUNC
    );
    static final FunctionDescriptor graphene_point3d_normalize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_point3d_normalize$MH = RuntimeHelper.downcallHandle(
        "graphene_point3d_normalize",
        constants$1616.graphene_point3d_normalize$FUNC
    );
    static final FunctionDescriptor graphene_point3d_distance$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_point3d_distance$MH = RuntimeHelper.downcallHandle(
        "graphene_point3d_distance",
        constants$1616.graphene_point3d_distance$FUNC
    );
    static final FunctionDescriptor graphene_point3d_interpolate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_point3d_interpolate$MH = RuntimeHelper.downcallHandle(
        "graphene_point3d_interpolate",
        constants$1616.graphene_point3d_interpolate$FUNC
    );
    static final FunctionDescriptor graphene_point3d_normalize_viewport$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_point3d_normalize_viewport$MH = RuntimeHelper.downcallHandle(
        "graphene_point3d_normalize_viewport",
        constants$1616.graphene_point3d_normalize_viewport$FUNC
    );
    static final FunctionDescriptor graphene_point3d_zero$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle graphene_point3d_zero$MH = RuntimeHelper.downcallHandle(
        "graphene_point3d_zero",
        constants$1616.graphene_point3d_zero$FUNC
    );
}


