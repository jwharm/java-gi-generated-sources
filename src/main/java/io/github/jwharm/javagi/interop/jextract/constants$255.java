// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$255 {

    static final FunctionDescriptor g_option_context_parse_strv$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_context_parse_strv$MH = RuntimeHelper.downcallHandle(
        "g_option_context_parse_strv",
        constants$255.g_option_context_parse_strv$FUNC
    );
    static final FunctionDescriptor g_option_context_set_translate_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_context_set_translate_func$MH = RuntimeHelper.downcallHandle(
        "g_option_context_set_translate_func",
        constants$255.g_option_context_set_translate_func$FUNC
    );
    static final FunctionDescriptor g_option_context_set_translation_domain$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_context_set_translation_domain$MH = RuntimeHelper.downcallHandle(
        "g_option_context_set_translation_domain",
        constants$255.g_option_context_set_translation_domain$FUNC
    );
    static final FunctionDescriptor g_option_context_add_group$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_context_add_group$MH = RuntimeHelper.downcallHandle(
        "g_option_context_add_group",
        constants$255.g_option_context_add_group$FUNC
    );
    static final FunctionDescriptor g_option_context_set_main_group$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_context_set_main_group$MH = RuntimeHelper.downcallHandle(
        "g_option_context_set_main_group",
        constants$255.g_option_context_set_main_group$FUNC
    );
    static final FunctionDescriptor g_option_context_get_main_group$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_context_get_main_group$MH = RuntimeHelper.downcallHandle(
        "g_option_context_get_main_group",
        constants$255.g_option_context_get_main_group$FUNC
    );
}


