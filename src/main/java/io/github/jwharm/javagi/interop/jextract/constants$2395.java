// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2395 {

    static final FunctionDescriptor glib_queueautoptr_cleanup_GtkStringObjectClass$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_queueautoptr_cleanup_GtkStringObjectClass$MH = RuntimeHelper.downcallHandle(
        "glib_queueautoptr_cleanup_GtkStringObjectClass",
        constants$2395.glib_queueautoptr_cleanup_GtkStringObjectClass$FUNC
    );
    static final FunctionDescriptor GTK_STRING_OBJECT$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTK_STRING_OBJECT$MH = RuntimeHelper.downcallHandle(
        "GTK_STRING_OBJECT",
        constants$2395.GTK_STRING_OBJECT$FUNC
    );
    static final FunctionDescriptor GTK_IS_STRING_OBJECT$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTK_IS_STRING_OBJECT$MH = RuntimeHelper.downcallHandle(
        "GTK_IS_STRING_OBJECT",
        constants$2395.GTK_IS_STRING_OBJECT$FUNC
    );
    static final FunctionDescriptor gtk_string_object_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_string_object_new$MH = RuntimeHelper.downcallHandle(
        "gtk_string_object_new",
        constants$2395.gtk_string_object_new$FUNC
    );
    static final FunctionDescriptor gtk_string_object_get_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_string_object_get_string$MH = RuntimeHelper.downcallHandle(
        "gtk_string_object_get_string",
        constants$2395.gtk_string_object_get_string$FUNC
    );
    static final FunctionDescriptor gtk_string_list_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_string_list_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_string_list_get_type",
        constants$2395.gtk_string_list_get_type$FUNC
    );
}


