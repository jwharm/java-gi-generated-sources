// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1207 {

    static final FunctionDescriptor pango_matrix_scale$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle pango_matrix_scale$MH = RuntimeHelper.downcallHandle(
        "pango_matrix_scale",
        constants$1207.pango_matrix_scale$FUNC
    );
    static final FunctionDescriptor pango_matrix_rotate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle pango_matrix_rotate$MH = RuntimeHelper.downcallHandle(
        "pango_matrix_rotate",
        constants$1207.pango_matrix_rotate$FUNC
    );
    static final FunctionDescriptor pango_matrix_concat$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_matrix_concat$MH = RuntimeHelper.downcallHandle(
        "pango_matrix_concat",
        constants$1207.pango_matrix_concat$FUNC
    );
    static final FunctionDescriptor pango_matrix_transform_point$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_matrix_transform_point$MH = RuntimeHelper.downcallHandle(
        "pango_matrix_transform_point",
        constants$1207.pango_matrix_transform_point$FUNC
    );
    static final FunctionDescriptor pango_matrix_transform_distance$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_matrix_transform_distance$MH = RuntimeHelper.downcallHandle(
        "pango_matrix_transform_distance",
        constants$1207.pango_matrix_transform_distance$FUNC
    );
    static final FunctionDescriptor pango_matrix_transform_rectangle$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_matrix_transform_rectangle$MH = RuntimeHelper.downcallHandle(
        "pango_matrix_transform_rectangle",
        constants$1207.pango_matrix_transform_rectangle$FUNC
    );
}


