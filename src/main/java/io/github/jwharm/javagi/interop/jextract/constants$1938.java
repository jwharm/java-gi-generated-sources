// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1938 {

    static final FunctionDescriptor gtk_entry_buffer_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_entry_buffer_new$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_buffer_new",
        constants$1938.gtk_entry_buffer_new$FUNC
    );
    static final FunctionDescriptor gtk_entry_buffer_get_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_buffer_get_bytes$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_buffer_get_bytes",
        constants$1938.gtk_entry_buffer_get_bytes$FUNC
    );
    static final FunctionDescriptor gtk_entry_buffer_get_length$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_buffer_get_length$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_buffer_get_length",
        constants$1938.gtk_entry_buffer_get_length$FUNC
    );
    static final FunctionDescriptor gtk_entry_buffer_get_text$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_buffer_get_text$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_buffer_get_text",
        constants$1938.gtk_entry_buffer_get_text$FUNC
    );
    static final FunctionDescriptor gtk_entry_buffer_set_text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_entry_buffer_set_text$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_buffer_set_text",
        constants$1938.gtk_entry_buffer_set_text$FUNC
    );
    static final FunctionDescriptor gtk_entry_buffer_set_max_length$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_entry_buffer_set_max_length$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_buffer_set_max_length",
        constants$1938.gtk_entry_buffer_set_max_length$FUNC
    );
}


