// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1370 {

    static final FunctionDescriptor gdk_crossing_event_get_detail$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_crossing_event_get_detail$MH = RuntimeHelper.downcallHandle(
        "gdk_crossing_event_get_detail",
        constants$1370.gdk_crossing_event_get_detail$FUNC
    );
    static final FunctionDescriptor gdk_crossing_event_get_focus$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_crossing_event_get_focus$MH = RuntimeHelper.downcallHandle(
        "gdk_crossing_event_get_focus",
        constants$1370.gdk_crossing_event_get_focus$FUNC
    );
    static final FunctionDescriptor gdk_touchpad_event_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gdk_touchpad_event_get_type$MH = RuntimeHelper.downcallHandle(
        "gdk_touchpad_event_get_type",
        constants$1370.gdk_touchpad_event_get_type$FUNC
    );
    static final FunctionDescriptor gdk_touchpad_event_get_gesture_phase$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_touchpad_event_get_gesture_phase$MH = RuntimeHelper.downcallHandle(
        "gdk_touchpad_event_get_gesture_phase",
        constants$1370.gdk_touchpad_event_get_gesture_phase$FUNC
    );
    static final FunctionDescriptor gdk_touchpad_event_get_n_fingers$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_touchpad_event_get_n_fingers$MH = RuntimeHelper.downcallHandle(
        "gdk_touchpad_event_get_n_fingers",
        constants$1370.gdk_touchpad_event_get_n_fingers$FUNC
    );
    static final FunctionDescriptor gdk_touchpad_event_get_deltas$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_touchpad_event_get_deltas$MH = RuntimeHelper.downcallHandle(
        "gdk_touchpad_event_get_deltas",
        constants$1370.gdk_touchpad_event_get_deltas$FUNC
    );
}


