// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1369 {

    static final FunctionDescriptor gdk_focus_event_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gdk_focus_event_get_type$MH = RuntimeHelper.downcallHandle(
        "gdk_focus_event_get_type",
        constants$1369.gdk_focus_event_get_type$FUNC
    );
    static final FunctionDescriptor gdk_focus_event_get_in$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_focus_event_get_in$MH = RuntimeHelper.downcallHandle(
        "gdk_focus_event_get_in",
        constants$1369.gdk_focus_event_get_in$FUNC
    );
    static final FunctionDescriptor gdk_touch_event_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gdk_touch_event_get_type$MH = RuntimeHelper.downcallHandle(
        "gdk_touch_event_get_type",
        constants$1369.gdk_touch_event_get_type$FUNC
    );
    static final FunctionDescriptor gdk_touch_event_get_emulating_pointer$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_touch_event_get_emulating_pointer$MH = RuntimeHelper.downcallHandle(
        "gdk_touch_event_get_emulating_pointer",
        constants$1369.gdk_touch_event_get_emulating_pointer$FUNC
    );
    static final FunctionDescriptor gdk_crossing_event_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gdk_crossing_event_get_type$MH = RuntimeHelper.downcallHandle(
        "gdk_crossing_event_get_type",
        constants$1369.gdk_crossing_event_get_type$FUNC
    );
    static final FunctionDescriptor gdk_crossing_event_get_mode$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_crossing_event_get_mode$MH = RuntimeHelper.downcallHandle(
        "gdk_crossing_event_get_mode",
        constants$1369.gdk_crossing_event_get_mode$FUNC
    );
}


