// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1371 {

    static final FunctionDescriptor gdk_touchpad_event_get_pinch_angle_delta$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_touchpad_event_get_pinch_angle_delta$MH = RuntimeHelper.downcallHandle(
        "gdk_touchpad_event_get_pinch_angle_delta",
        constants$1371.gdk_touchpad_event_get_pinch_angle_delta$FUNC
    );
    static final FunctionDescriptor gdk_touchpad_event_get_pinch_scale$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_touchpad_event_get_pinch_scale$MH = RuntimeHelper.downcallHandle(
        "gdk_touchpad_event_get_pinch_scale",
        constants$1371.gdk_touchpad_event_get_pinch_scale$FUNC
    );
    static final FunctionDescriptor gdk_pad_event_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gdk_pad_event_get_type$MH = RuntimeHelper.downcallHandle(
        "gdk_pad_event_get_type",
        constants$1371.gdk_pad_event_get_type$FUNC
    );
    static final FunctionDescriptor gdk_pad_event_get_button$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pad_event_get_button$MH = RuntimeHelper.downcallHandle(
        "gdk_pad_event_get_button",
        constants$1371.gdk_pad_event_get_button$FUNC
    );
    static final FunctionDescriptor gdk_pad_event_get_axis_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pad_event_get_axis_value$MH = RuntimeHelper.downcallHandle(
        "gdk_pad_event_get_axis_value",
        constants$1371.gdk_pad_event_get_axis_value$FUNC
    );
    static final FunctionDescriptor gdk_pad_event_get_group_mode$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pad_event_get_group_mode$MH = RuntimeHelper.downcallHandle(
        "gdk_pad_event_get_group_mode",
        constants$1371.gdk_pad_event_get_group_mode$FUNC
    );
}


