// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1795 {

    static final FunctionDescriptor gtk_assistant_commit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_assistant_commit$MH = RuntimeHelper.downcallHandle(
        "gtk_assistant_commit",
        constants$1795.gtk_assistant_commit$FUNC
    );
    static final FunctionDescriptor gtk_assistant_get_page$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_assistant_get_page$MH = RuntimeHelper.downcallHandle(
        "gtk_assistant_get_page",
        constants$1795.gtk_assistant_get_page$FUNC
    );
    static final FunctionDescriptor gtk_assistant_page_get_child$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_assistant_page_get_child$MH = RuntimeHelper.downcallHandle(
        "gtk_assistant_page_get_child",
        constants$1795.gtk_assistant_page_get_child$FUNC
    );
    static final FunctionDescriptor gtk_assistant_get_pages$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_assistant_get_pages$MH = RuntimeHelper.downcallHandle(
        "gtk_assistant_get_pages",
        constants$1795.gtk_assistant_get_pages$FUNC
    );
    static final FunctionDescriptor gtk_at_context_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_at_context_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_at_context_get_type",
        constants$1795.gtk_at_context_get_type$FUNC
    );
    static final FunctionDescriptor glib_autoptr_clear_GtkATContext$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_autoptr_clear_GtkATContext$MH = RuntimeHelper.downcallHandle(
        "glib_autoptr_clear_GtkATContext",
        constants$1795.glib_autoptr_clear_GtkATContext$FUNC
    );
}


