// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1635 {

    static final FunctionDescriptor graphene_box_get_max$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_box_get_max$MH = RuntimeHelper.downcallHandle(
        "graphene_box_get_max",
        constants$1635.graphene_box_get_max$FUNC
    );
    static final FunctionDescriptor graphene_box_get_vertices$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_box_get_vertices$MH = RuntimeHelper.downcallHandle(
        "graphene_box_get_vertices",
        constants$1635.graphene_box_get_vertices$FUNC
    );
    static final FunctionDescriptor graphene_box_get_bounding_sphere$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_box_get_bounding_sphere$MH = RuntimeHelper.downcallHandle(
        "graphene_box_get_bounding_sphere",
        constants$1635.graphene_box_get_bounding_sphere$FUNC
    );
    static final FunctionDescriptor graphene_box_contains_point$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_box_contains_point$MH = RuntimeHelper.downcallHandle(
        "graphene_box_contains_point",
        constants$1635.graphene_box_contains_point$FUNC
    );
    static final FunctionDescriptor graphene_box_contains_box$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_box_contains_box$MH = RuntimeHelper.downcallHandle(
        "graphene_box_contains_box",
        constants$1635.graphene_box_contains_box$FUNC
    );
    static final FunctionDescriptor graphene_box_equal$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_box_equal$MH = RuntimeHelper.downcallHandle(
        "graphene_box_equal",
        constants$1635.graphene_box_equal$FUNC
    );
}


