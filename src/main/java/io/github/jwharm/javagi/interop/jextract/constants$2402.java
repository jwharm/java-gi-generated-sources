// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2402 {

    static final FunctionDescriptor gtk_style_provider_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_style_provider_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_style_provider_get_type",
        constants$2402.gtk_style_provider_get_type$FUNC
    );
    static final FunctionDescriptor gtk_style_context_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_style_context_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_get_type",
        constants$2402.gtk_style_context_get_type$FUNC
    );
    static final FunctionDescriptor gtk_style_context_add_provider_for_display$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_style_context_add_provider_for_display$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_add_provider_for_display",
        constants$2402.gtk_style_context_add_provider_for_display$FUNC
    );
    static final FunctionDescriptor gtk_style_context_remove_provider_for_display$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_context_remove_provider_for_display$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_remove_provider_for_display",
        constants$2402.gtk_style_context_remove_provider_for_display$FUNC
    );
    static final FunctionDescriptor gtk_style_context_add_provider$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_style_context_add_provider$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_add_provider",
        constants$2402.gtk_style_context_add_provider$FUNC
    );
    static final FunctionDescriptor gtk_style_context_remove_provider$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_context_remove_provider$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_remove_provider",
        constants$2402.gtk_style_context_remove_provider$FUNC
    );
}


