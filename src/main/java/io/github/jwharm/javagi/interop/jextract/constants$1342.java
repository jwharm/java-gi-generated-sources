// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1342 {

    static final FunctionDescriptor gdk_clipboard_set$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle gdk_clipboard_set$MH = RuntimeHelper.downcallHandleVariadic(
        "gdk_clipboard_set",
        constants$1342.gdk_clipboard_set$FUNC
    );
    static final FunctionDescriptor gdk_clipboard_set_valist$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_clipboard_set_valist$MH = RuntimeHelper.downcallHandle(
        "gdk_clipboard_set_valist",
        constants$1342.gdk_clipboard_set_valist$FUNC
    );
    static final FunctionDescriptor gdk_clipboard_set_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_clipboard_set_value$MH = RuntimeHelper.downcallHandle(
        "gdk_clipboard_set_value",
        constants$1342.gdk_clipboard_set_value$FUNC
    );
    static final FunctionDescriptor gdk_clipboard_set_text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_clipboard_set_text$MH = RuntimeHelper.downcallHandle(
        "gdk_clipboard_set_text",
        constants$1342.gdk_clipboard_set_text$FUNC
    );
    static final FunctionDescriptor gdk_clipboard_set_texture$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_clipboard_set_texture$MH = RuntimeHelper.downcallHandle(
        "gdk_clipboard_set_texture",
        constants$1342.gdk_clipboard_set_texture$FUNC
    );
    static final FunctionDescriptor GdkContentDeserializeFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
}


