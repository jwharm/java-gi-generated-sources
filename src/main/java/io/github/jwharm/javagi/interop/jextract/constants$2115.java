// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2115 {

    static final FunctionDescriptor gtk_gesture_stylus_get_axis$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_gesture_stylus_get_axis$MH = RuntimeHelper.downcallHandle(
        "gtk_gesture_stylus_get_axis",
        constants$2115.gtk_gesture_stylus_get_axis$FUNC
    );
    static final FunctionDescriptor gtk_gesture_stylus_get_axes$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_gesture_stylus_get_axes$MH = RuntimeHelper.downcallHandle(
        "gtk_gesture_stylus_get_axes",
        constants$2115.gtk_gesture_stylus_get_axes$FUNC
    );
    static final FunctionDescriptor gtk_gesture_stylus_get_backlog$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_gesture_stylus_get_backlog$MH = RuntimeHelper.downcallHandle(
        "gtk_gesture_stylus_get_backlog",
        constants$2115.gtk_gesture_stylus_get_backlog$FUNC
    );
    static final FunctionDescriptor gtk_gesture_stylus_get_device_tool$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_gesture_stylus_get_device_tool$MH = RuntimeHelper.downcallHandle(
        "gtk_gesture_stylus_get_device_tool",
        constants$2115.gtk_gesture_stylus_get_device_tool$FUNC
    );
    static final FunctionDescriptor gtk_gesture_swipe_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_gesture_swipe_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_gesture_swipe_get_type",
        constants$2115.gtk_gesture_swipe_get_type$FUNC
    );
    static final FunctionDescriptor gtk_gesture_swipe_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_gesture_swipe_new$MH = RuntimeHelper.downcallHandle(
        "gtk_gesture_swipe_new",
        constants$2115.gtk_gesture_swipe_new$FUNC
    );
}


