// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1608 {

    static final FunctionDescriptor graphene_size_equal$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_size_equal$MH = RuntimeHelper.downcallHandle(
        "graphene_size_equal",
        constants$1608.graphene_size_equal$FUNC
    );
    static final FunctionDescriptor graphene_size_scale$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_size_scale$MH = RuntimeHelper.downcallHandle(
        "graphene_size_scale",
        constants$1608.graphene_size_scale$FUNC
    );
    static final FunctionDescriptor graphene_size_interpolate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_size_interpolate$MH = RuntimeHelper.downcallHandle(
        "graphene_size_interpolate",
        constants$1608.graphene_size_interpolate$FUNC
    );
    static final FunctionDescriptor graphene_size_zero$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle graphene_size_zero$MH = RuntimeHelper.downcallHandle(
        "graphene_size_zero",
        constants$1608.graphene_size_zero$FUNC
    );
    static final FunctionDescriptor graphene_rect_alloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle graphene_rect_alloc$MH = RuntimeHelper.downcallHandle(
        "graphene_rect_alloc",
        constants$1608.graphene_rect_alloc$FUNC
    );
    static final FunctionDescriptor graphene_rect_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_rect_free$MH = RuntimeHelper.downcallHandle(
        "graphene_rect_free",
        constants$1608.graphene_rect_free$FUNC
    );
}


