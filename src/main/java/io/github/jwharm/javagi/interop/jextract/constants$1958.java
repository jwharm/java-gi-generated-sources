// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1958 {

    static final FunctionDescriptor gtk_entry_get_text_length$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_get_text_length$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_get_text_length",
        constants$1958.gtk_entry_get_text_length$FUNC
    );
    static final FunctionDescriptor gtk_entry_set_activates_default$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_entry_set_activates_default$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_set_activates_default",
        constants$1958.gtk_entry_set_activates_default$FUNC
    );
    static final FunctionDescriptor gtk_entry_get_activates_default$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_get_activates_default$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_get_activates_default",
        constants$1958.gtk_entry_get_activates_default$FUNC
    );
    static final FunctionDescriptor gtk_entry_set_alignment$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle gtk_entry_set_alignment$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_set_alignment",
        constants$1958.gtk_entry_set_alignment$FUNC
    );
    static final FunctionDescriptor gtk_entry_get_alignment$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_get_alignment$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_get_alignment",
        constants$1958.gtk_entry_get_alignment$FUNC
    );
    static final FunctionDescriptor gtk_entry_set_completion$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_set_completion$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_set_completion",
        constants$1958.gtk_entry_set_completion$FUNC
    );
}


