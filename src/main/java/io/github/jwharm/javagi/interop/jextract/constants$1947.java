// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1947 {

    static final FunctionDescriptor GtkEntryCompletionMatchFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkEntryCompletionMatchFunc$MH = RuntimeHelper.downcallHandle(
        constants$1947.GtkEntryCompletionMatchFunc$FUNC
    );
    static final FunctionDescriptor gtk_entry_completion_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_entry_completion_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_completion_get_type",
        constants$1947.gtk_entry_completion_get_type$FUNC
    );
    static final FunctionDescriptor gtk_entry_completion_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_entry_completion_new$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_completion_new",
        constants$1947.gtk_entry_completion_new$FUNC
    );
    static final FunctionDescriptor gtk_entry_completion_new_with_area$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_completion_new_with_area$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_completion_new_with_area",
        constants$1947.gtk_entry_completion_new_with_area$FUNC
    );
    static final FunctionDescriptor gtk_entry_completion_get_entry$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_completion_get_entry$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_completion_get_entry",
        constants$1947.gtk_entry_completion_get_entry$FUNC
    );
}


