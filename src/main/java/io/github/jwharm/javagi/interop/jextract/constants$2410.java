// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2410 {

    static final FunctionDescriptor gtk_text_unset_invisible_char$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_unset_invisible_char$MH = RuntimeHelper.downcallHandle(
        "gtk_text_unset_invisible_char",
        constants$2410.gtk_text_unset_invisible_char$FUNC
    );
    static final FunctionDescriptor gtk_text_set_overwrite_mode$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_set_overwrite_mode$MH = RuntimeHelper.downcallHandle(
        "gtk_text_set_overwrite_mode",
        constants$2410.gtk_text_set_overwrite_mode$FUNC
    );
    static final FunctionDescriptor gtk_text_get_overwrite_mode$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_get_overwrite_mode$MH = RuntimeHelper.downcallHandle(
        "gtk_text_get_overwrite_mode",
        constants$2410.gtk_text_get_overwrite_mode$FUNC
    );
    static final FunctionDescriptor gtk_text_set_max_length$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_set_max_length$MH = RuntimeHelper.downcallHandle(
        "gtk_text_set_max_length",
        constants$2410.gtk_text_set_max_length$FUNC
    );
    static final FunctionDescriptor gtk_text_get_max_length$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_get_max_length$MH = RuntimeHelper.downcallHandle(
        "gtk_text_get_max_length",
        constants$2410.gtk_text_get_max_length$FUNC
    );
    static final FunctionDescriptor gtk_text_get_text_length$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_get_text_length$MH = RuntimeHelper.downcallHandle(
        "gtk_text_get_text_length",
        constants$2410.gtk_text_get_text_length$FUNC
    );
}


