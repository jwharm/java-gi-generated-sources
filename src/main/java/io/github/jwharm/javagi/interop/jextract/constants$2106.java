// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2106 {

    static final FunctionDescriptor gtk_frame_set_label$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_frame_set_label$MH = RuntimeHelper.downcallHandle(
        "gtk_frame_set_label",
        constants$2106.gtk_frame_set_label$FUNC
    );
    static final FunctionDescriptor gtk_frame_get_label$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_frame_get_label$MH = RuntimeHelper.downcallHandle(
        "gtk_frame_get_label",
        constants$2106.gtk_frame_get_label$FUNC
    );
    static final FunctionDescriptor gtk_frame_set_label_widget$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_frame_set_label_widget$MH = RuntimeHelper.downcallHandle(
        "gtk_frame_set_label_widget",
        constants$2106.gtk_frame_set_label_widget$FUNC
    );
    static final FunctionDescriptor gtk_frame_get_label_widget$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_frame_get_label_widget$MH = RuntimeHelper.downcallHandle(
        "gtk_frame_get_label_widget",
        constants$2106.gtk_frame_get_label_widget$FUNC
    );
    static final FunctionDescriptor gtk_frame_set_label_align$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle gtk_frame_set_label_align$MH = RuntimeHelper.downcallHandle(
        "gtk_frame_set_label_align",
        constants$2106.gtk_frame_set_label_align$FUNC
    );
    static final FunctionDescriptor gtk_frame_get_label_align$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_frame_get_label_align$MH = RuntimeHelper.downcallHandle(
        "gtk_frame_get_label_align",
        constants$2106.gtk_frame_get_label_align$FUNC
    );
}


