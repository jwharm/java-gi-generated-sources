// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1632 {

    static final FunctionDescriptor graphene_box_alloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle graphene_box_alloc$MH = RuntimeHelper.downcallHandle(
        "graphene_box_alloc",
        constants$1632.graphene_box_alloc$FUNC
    );
    static final FunctionDescriptor graphene_box_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_box_free$MH = RuntimeHelper.downcallHandle(
        "graphene_box_free",
        constants$1632.graphene_box_free$FUNC
    );
    static final FunctionDescriptor graphene_box_init$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_box_init$MH = RuntimeHelper.downcallHandle(
        "graphene_box_init",
        constants$1632.graphene_box_init$FUNC
    );
    static final FunctionDescriptor graphene_box_init_from_points$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_box_init_from_points$MH = RuntimeHelper.downcallHandle(
        "graphene_box_init_from_points",
        constants$1632.graphene_box_init_from_points$FUNC
    );
    static final FunctionDescriptor graphene_box_init_from_vectors$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_box_init_from_vectors$MH = RuntimeHelper.downcallHandle(
        "graphene_box_init_from_vectors",
        constants$1632.graphene_box_init_from_vectors$FUNC
    );
    static final FunctionDescriptor graphene_box_init_from_box$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_box_init_from_box$MH = RuntimeHelper.downcallHandle(
        "graphene_box_init_from_box",
        constants$1632.graphene_box_init_from_box$FUNC
    );
}


