// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2404 {

    static final FunctionDescriptor gtk_style_context_add_class$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_context_add_class$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_add_class",
        constants$2404.gtk_style_context_add_class$FUNC
    );
    static final FunctionDescriptor gtk_style_context_remove_class$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_context_remove_class$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_remove_class",
        constants$2404.gtk_style_context_remove_class$FUNC
    );
    static final FunctionDescriptor gtk_style_context_has_class$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_context_has_class$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_has_class",
        constants$2404.gtk_style_context_has_class$FUNC
    );
    static final FunctionDescriptor gtk_style_context_set_display$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_context_set_display$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_set_display",
        constants$2404.gtk_style_context_set_display$FUNC
    );
    static final FunctionDescriptor gtk_style_context_get_display$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_context_get_display$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_get_display",
        constants$2404.gtk_style_context_get_display$FUNC
    );
    static final FunctionDescriptor gtk_style_context_lookup_color$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_context_lookup_color$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_lookup_color",
        constants$2404.gtk_style_context_lookup_color$FUNC
    );
}


