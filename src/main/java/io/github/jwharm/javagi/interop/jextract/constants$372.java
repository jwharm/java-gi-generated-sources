// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$372 {

    static final FunctionDescriptor g_static_rw_lock_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_rw_lock_init$MH = RuntimeHelper.downcallHandle(
        "g_static_rw_lock_init",
        constants$372.g_static_rw_lock_init$FUNC
    );
    static final FunctionDescriptor g_static_rw_lock_reader_lock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_rw_lock_reader_lock$MH = RuntimeHelper.downcallHandle(
        "g_static_rw_lock_reader_lock",
        constants$372.g_static_rw_lock_reader_lock$FUNC
    );
    static final FunctionDescriptor g_static_rw_lock_reader_trylock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_rw_lock_reader_trylock$MH = RuntimeHelper.downcallHandle(
        "g_static_rw_lock_reader_trylock",
        constants$372.g_static_rw_lock_reader_trylock$FUNC
    );
    static final FunctionDescriptor g_static_rw_lock_reader_unlock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_rw_lock_reader_unlock$MH = RuntimeHelper.downcallHandle(
        "g_static_rw_lock_reader_unlock",
        constants$372.g_static_rw_lock_reader_unlock$FUNC
    );
    static final FunctionDescriptor g_static_rw_lock_writer_lock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_rw_lock_writer_lock$MH = RuntimeHelper.downcallHandle(
        "g_static_rw_lock_writer_lock",
        constants$372.g_static_rw_lock_writer_lock$FUNC
    );
    static final FunctionDescriptor g_static_rw_lock_writer_trylock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_rw_lock_writer_trylock$MH = RuntimeHelper.downcallHandle(
        "g_static_rw_lock_writer_trylock",
        constants$372.g_static_rw_lock_writer_trylock$FUNC
    );
}


