// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1395 {

    static final FunctionDescriptor gdk_display_manager_get$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gdk_display_manager_get$MH = RuntimeHelper.downcallHandle(
        "gdk_display_manager_get",
        constants$1395.gdk_display_manager_get$FUNC
    );
    static final FunctionDescriptor gdk_display_manager_get_default_display$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_manager_get_default_display$MH = RuntimeHelper.downcallHandle(
        "gdk_display_manager_get_default_display",
        constants$1395.gdk_display_manager_get_default_display$FUNC
    );
    static final FunctionDescriptor gdk_display_manager_set_default_display$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_manager_set_default_display$MH = RuntimeHelper.downcallHandle(
        "gdk_display_manager_set_default_display",
        constants$1395.gdk_display_manager_set_default_display$FUNC
    );
    static final FunctionDescriptor gdk_display_manager_list_displays$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_manager_list_displays$MH = RuntimeHelper.downcallHandle(
        "gdk_display_manager_list_displays",
        constants$1395.gdk_display_manager_list_displays$FUNC
    );
    static final FunctionDescriptor gdk_display_manager_open_display$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_manager_open_display$MH = RuntimeHelper.downcallHandle(
        "gdk_display_manager_open_display",
        constants$1395.gdk_display_manager_open_display$FUNC
    );
    static final FunctionDescriptor gdk_set_allowed_backends$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_set_allowed_backends$MH = RuntimeHelper.downcallHandle(
        "gdk_set_allowed_backends",
        constants$1395.gdk_set_allowed_backends$FUNC
    );
}


