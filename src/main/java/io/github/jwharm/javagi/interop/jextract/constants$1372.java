// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1372 {

    static final FunctionDescriptor gdk_dnd_event_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gdk_dnd_event_get_type$MH = RuntimeHelper.downcallHandle(
        "gdk_dnd_event_get_type",
        constants$1372.gdk_dnd_event_get_type$FUNC
    );
    static final FunctionDescriptor gdk_dnd_event_get_drop$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_dnd_event_get_drop$MH = RuntimeHelper.downcallHandle(
        "gdk_dnd_event_get_drop",
        constants$1372.gdk_dnd_event_get_drop$FUNC
    );
    static final FunctionDescriptor gdk_grab_broken_event_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gdk_grab_broken_event_get_type$MH = RuntimeHelper.downcallHandle(
        "gdk_grab_broken_event_get_type",
        constants$1372.gdk_grab_broken_event_get_type$FUNC
    );
    static final FunctionDescriptor gdk_grab_broken_event_get_grab_surface$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_grab_broken_event_get_grab_surface$MH = RuntimeHelper.downcallHandle(
        "gdk_grab_broken_event_get_grab_surface",
        constants$1372.gdk_grab_broken_event_get_grab_surface$FUNC
    );
    static final FunctionDescriptor gdk_grab_broken_event_get_implicit$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_grab_broken_event_get_implicit$MH = RuntimeHelper.downcallHandle(
        "gdk_grab_broken_event_get_implicit",
        constants$1372.gdk_grab_broken_event_get_implicit$FUNC
    );
    static final FunctionDescriptor gdk_motion_event_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gdk_motion_event_get_type$MH = RuntimeHelper.downcallHandle(
        "gdk_motion_event_get_type",
        constants$1372.gdk_motion_event_get_type$FUNC
    );
}


