// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2034 {

    static final FunctionDescriptor gtk_directory_list_is_loading$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_directory_list_is_loading$MH = RuntimeHelper.downcallHandle(
        "gtk_directory_list_is_loading",
        constants$2034.gtk_directory_list_is_loading$FUNC
    );
    static final FunctionDescriptor gtk_directory_list_get_error$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_directory_list_get_error$MH = RuntimeHelper.downcallHandle(
        "gtk_directory_list_get_error",
        constants$2034.gtk_directory_list_get_error$FUNC
    );
    static final FunctionDescriptor gtk_directory_list_set_monitored$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_directory_list_set_monitored$MH = RuntimeHelper.downcallHandle(
        "gtk_directory_list_set_monitored",
        constants$2034.gtk_directory_list_set_monitored$FUNC
    );
    static final FunctionDescriptor gtk_directory_list_get_monitored$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_directory_list_get_monitored$MH = RuntimeHelper.downcallHandle(
        "gtk_directory_list_get_monitored",
        constants$2034.gtk_directory_list_get_monitored$FUNC
    );
    static final FunctionDescriptor gtk_drag_icon_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_drag_icon_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_icon_get_type",
        constants$2034.gtk_drag_icon_get_type$FUNC
    );
    static final FunctionDescriptor glib_autoptr_clear_GtkDragIcon$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_autoptr_clear_GtkDragIcon$MH = RuntimeHelper.downcallHandle(
        "glib_autoptr_clear_GtkDragIcon",
        constants$2034.glib_autoptr_clear_GtkDragIcon$FUNC
    );
}


