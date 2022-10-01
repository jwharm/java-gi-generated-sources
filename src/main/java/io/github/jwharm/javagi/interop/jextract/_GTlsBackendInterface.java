// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GTlsBackendInterface {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("g_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("supports_tls"),
        Constants$root.C_POINTER$LAYOUT.withName("get_certificate_type"),
        Constants$root.C_POINTER$LAYOUT.withName("get_client_connection_type"),
        Constants$root.C_POINTER$LAYOUT.withName("get_server_connection_type"),
        Constants$root.C_POINTER$LAYOUT.withName("get_file_database_type"),
        Constants$root.C_POINTER$LAYOUT.withName("get_default_database"),
        Constants$root.C_POINTER$LAYOUT.withName("supports_dtls"),
        Constants$root.C_POINTER$LAYOUT.withName("get_dtls_client_connection_type"),
        Constants$root.C_POINTER$LAYOUT.withName("get_dtls_server_connection_type")
    ).withName("_GTlsBackendInterface");
    public static MemoryLayout $LAYOUT() {
        return _GTlsBackendInterface.$struct$LAYOUT;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor supports_tls$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle supports_tls$MH = RuntimeHelper.downcallHandle(
        _GTlsBackendInterface.supports_tls$FUNC
    );
    public interface supports_tls {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(supports_tls fi, MemorySession session) {
            return RuntimeHelper.upcallStub(supports_tls.class, fi, _GTlsBackendInterface.supports_tls$FUNC, session);
        }
        static supports_tls ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)_GTlsBackendInterface.supports_tls$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle supports_tls$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("supports_tls"));
    public static VarHandle supports_tls$VH() {
        return _GTlsBackendInterface.supports_tls$VH;
    }
    public static MemoryAddress supports_tls$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GTlsBackendInterface.supports_tls$VH.get(seg);
    }
    public static void supports_tls$set( MemorySegment seg, MemoryAddress x) {
        _GTlsBackendInterface.supports_tls$VH.set(seg, x);
    }
    public static MemoryAddress supports_tls$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GTlsBackendInterface.supports_tls$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void supports_tls$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTlsBackendInterface.supports_tls$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static supports_tls supports_tls (MemorySegment segment, MemorySession session) {
        return supports_tls.ofAddress(supports_tls$get(segment), session);
    }
    static final FunctionDescriptor get_certificate_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle get_certificate_type$MH = RuntimeHelper.downcallHandle(
        _GTlsBackendInterface.get_certificate_type$FUNC
    );
    public interface get_certificate_type {

        long apply();
        static MemorySegment allocate(get_certificate_type fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_certificate_type.class, fi, _GTlsBackendInterface.get_certificate_type$FUNC, session);
        }
        static get_certificate_type ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    return (long)_GTlsBackendInterface.get_certificate_type$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_certificate_type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_certificate_type"));
    public static VarHandle get_certificate_type$VH() {
        return _GTlsBackendInterface.get_certificate_type$VH;
    }
    public static MemoryAddress get_certificate_type$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GTlsBackendInterface.get_certificate_type$VH.get(seg);
    }
    public static void get_certificate_type$set( MemorySegment seg, MemoryAddress x) {
        _GTlsBackendInterface.get_certificate_type$VH.set(seg, x);
    }
    public static MemoryAddress get_certificate_type$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GTlsBackendInterface.get_certificate_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_certificate_type$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTlsBackendInterface.get_certificate_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_certificate_type get_certificate_type (MemorySegment segment, MemorySession session) {
        return get_certificate_type.ofAddress(get_certificate_type$get(segment), session);
    }
    static final FunctionDescriptor get_client_connection_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle get_client_connection_type$MH = RuntimeHelper.downcallHandle(
        _GTlsBackendInterface.get_client_connection_type$FUNC
    );
    public interface get_client_connection_type {

        long apply();
        static MemorySegment allocate(get_client_connection_type fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_client_connection_type.class, fi, _GTlsBackendInterface.get_client_connection_type$FUNC, session);
        }
        static get_client_connection_type ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    return (long)_GTlsBackendInterface.get_client_connection_type$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_client_connection_type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_client_connection_type"));
    public static VarHandle get_client_connection_type$VH() {
        return _GTlsBackendInterface.get_client_connection_type$VH;
    }
    public static MemoryAddress get_client_connection_type$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GTlsBackendInterface.get_client_connection_type$VH.get(seg);
    }
    public static void get_client_connection_type$set( MemorySegment seg, MemoryAddress x) {
        _GTlsBackendInterface.get_client_connection_type$VH.set(seg, x);
    }
    public static MemoryAddress get_client_connection_type$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GTlsBackendInterface.get_client_connection_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_client_connection_type$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTlsBackendInterface.get_client_connection_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_client_connection_type get_client_connection_type (MemorySegment segment, MemorySession session) {
        return get_client_connection_type.ofAddress(get_client_connection_type$get(segment), session);
    }
    static final FunctionDescriptor get_server_connection_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle get_server_connection_type$MH = RuntimeHelper.downcallHandle(
        _GTlsBackendInterface.get_server_connection_type$FUNC
    );
    public interface get_server_connection_type {

        long apply();
        static MemorySegment allocate(get_server_connection_type fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_server_connection_type.class, fi, _GTlsBackendInterface.get_server_connection_type$FUNC, session);
        }
        static get_server_connection_type ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    return (long)_GTlsBackendInterface.get_server_connection_type$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_server_connection_type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_server_connection_type"));
    public static VarHandle get_server_connection_type$VH() {
        return _GTlsBackendInterface.get_server_connection_type$VH;
    }
    public static MemoryAddress get_server_connection_type$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GTlsBackendInterface.get_server_connection_type$VH.get(seg);
    }
    public static void get_server_connection_type$set( MemorySegment seg, MemoryAddress x) {
        _GTlsBackendInterface.get_server_connection_type$VH.set(seg, x);
    }
    public static MemoryAddress get_server_connection_type$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GTlsBackendInterface.get_server_connection_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_server_connection_type$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTlsBackendInterface.get_server_connection_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_server_connection_type get_server_connection_type (MemorySegment segment, MemorySession session) {
        return get_server_connection_type.ofAddress(get_server_connection_type$get(segment), session);
    }
    static final FunctionDescriptor get_file_database_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle get_file_database_type$MH = RuntimeHelper.downcallHandle(
        _GTlsBackendInterface.get_file_database_type$FUNC
    );
    public interface get_file_database_type {

        long apply();
        static MemorySegment allocate(get_file_database_type fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_file_database_type.class, fi, _GTlsBackendInterface.get_file_database_type$FUNC, session);
        }
        static get_file_database_type ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    return (long)_GTlsBackendInterface.get_file_database_type$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_file_database_type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_file_database_type"));
    public static VarHandle get_file_database_type$VH() {
        return _GTlsBackendInterface.get_file_database_type$VH;
    }
    public static MemoryAddress get_file_database_type$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GTlsBackendInterface.get_file_database_type$VH.get(seg);
    }
    public static void get_file_database_type$set( MemorySegment seg, MemoryAddress x) {
        _GTlsBackendInterface.get_file_database_type$VH.set(seg, x);
    }
    public static MemoryAddress get_file_database_type$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GTlsBackendInterface.get_file_database_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_file_database_type$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTlsBackendInterface.get_file_database_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_file_database_type get_file_database_type (MemorySegment segment, MemorySession session) {
        return get_file_database_type.ofAddress(get_file_database_type$get(segment), session);
    }
    static final FunctionDescriptor get_default_database$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_default_database$MH = RuntimeHelper.downcallHandle(
        _GTlsBackendInterface.get_default_database$FUNC
    );
    public interface get_default_database {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(get_default_database fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_default_database.class, fi, _GTlsBackendInterface.get_default_database$FUNC, session);
        }
        static get_default_database ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_GTlsBackendInterface.get_default_database$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_default_database$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_default_database"));
    public static VarHandle get_default_database$VH() {
        return _GTlsBackendInterface.get_default_database$VH;
    }
    public static MemoryAddress get_default_database$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GTlsBackendInterface.get_default_database$VH.get(seg);
    }
    public static void get_default_database$set( MemorySegment seg, MemoryAddress x) {
        _GTlsBackendInterface.get_default_database$VH.set(seg, x);
    }
    public static MemoryAddress get_default_database$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GTlsBackendInterface.get_default_database$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_default_database$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTlsBackendInterface.get_default_database$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_default_database get_default_database (MemorySegment segment, MemorySession session) {
        return get_default_database.ofAddress(get_default_database$get(segment), session);
    }
    static final FunctionDescriptor supports_dtls$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle supports_dtls$MH = RuntimeHelper.downcallHandle(
        _GTlsBackendInterface.supports_dtls$FUNC
    );
    public interface supports_dtls {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(supports_dtls fi, MemorySession session) {
            return RuntimeHelper.upcallStub(supports_dtls.class, fi, _GTlsBackendInterface.supports_dtls$FUNC, session);
        }
        static supports_dtls ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)_GTlsBackendInterface.supports_dtls$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle supports_dtls$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("supports_dtls"));
    public static VarHandle supports_dtls$VH() {
        return _GTlsBackendInterface.supports_dtls$VH;
    }
    public static MemoryAddress supports_dtls$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GTlsBackendInterface.supports_dtls$VH.get(seg);
    }
    public static void supports_dtls$set( MemorySegment seg, MemoryAddress x) {
        _GTlsBackendInterface.supports_dtls$VH.set(seg, x);
    }
    public static MemoryAddress supports_dtls$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GTlsBackendInterface.supports_dtls$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void supports_dtls$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTlsBackendInterface.supports_dtls$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static supports_dtls supports_dtls (MemorySegment segment, MemorySession session) {
        return supports_dtls.ofAddress(supports_dtls$get(segment), session);
    }
    static final FunctionDescriptor get_dtls_client_connection_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle get_dtls_client_connection_type$MH = RuntimeHelper.downcallHandle(
        _GTlsBackendInterface.get_dtls_client_connection_type$FUNC
    );
    public interface get_dtls_client_connection_type {

        long apply();
        static MemorySegment allocate(get_dtls_client_connection_type fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_dtls_client_connection_type.class, fi, _GTlsBackendInterface.get_dtls_client_connection_type$FUNC, session);
        }
        static get_dtls_client_connection_type ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    return (long)_GTlsBackendInterface.get_dtls_client_connection_type$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_dtls_client_connection_type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_dtls_client_connection_type"));
    public static VarHandle get_dtls_client_connection_type$VH() {
        return _GTlsBackendInterface.get_dtls_client_connection_type$VH;
    }
    public static MemoryAddress get_dtls_client_connection_type$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GTlsBackendInterface.get_dtls_client_connection_type$VH.get(seg);
    }
    public static void get_dtls_client_connection_type$set( MemorySegment seg, MemoryAddress x) {
        _GTlsBackendInterface.get_dtls_client_connection_type$VH.set(seg, x);
    }
    public static MemoryAddress get_dtls_client_connection_type$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GTlsBackendInterface.get_dtls_client_connection_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_dtls_client_connection_type$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTlsBackendInterface.get_dtls_client_connection_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_dtls_client_connection_type get_dtls_client_connection_type (MemorySegment segment, MemorySession session) {
        return get_dtls_client_connection_type.ofAddress(get_dtls_client_connection_type$get(segment), session);
    }
    static final FunctionDescriptor get_dtls_server_connection_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle get_dtls_server_connection_type$MH = RuntimeHelper.downcallHandle(
        _GTlsBackendInterface.get_dtls_server_connection_type$FUNC
    );
    public interface get_dtls_server_connection_type {

        long apply();
        static MemorySegment allocate(get_dtls_server_connection_type fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_dtls_server_connection_type.class, fi, _GTlsBackendInterface.get_dtls_server_connection_type$FUNC, session);
        }
        static get_dtls_server_connection_type ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    return (long)_GTlsBackendInterface.get_dtls_server_connection_type$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_dtls_server_connection_type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_dtls_server_connection_type"));
    public static VarHandle get_dtls_server_connection_type$VH() {
        return _GTlsBackendInterface.get_dtls_server_connection_type$VH;
    }
    public static MemoryAddress get_dtls_server_connection_type$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GTlsBackendInterface.get_dtls_server_connection_type$VH.get(seg);
    }
    public static void get_dtls_server_connection_type$set( MemorySegment seg, MemoryAddress x) {
        _GTlsBackendInterface.get_dtls_server_connection_type$VH.set(seg, x);
    }
    public static MemoryAddress get_dtls_server_connection_type$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GTlsBackendInterface.get_dtls_server_connection_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_dtls_server_connection_type$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTlsBackendInterface.get_dtls_server_connection_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_dtls_server_connection_type get_dtls_server_connection_type (MemorySegment segment, MemorySession session) {
        return get_dtls_server_connection_type.ofAddress(get_dtls_server_connection_type$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


