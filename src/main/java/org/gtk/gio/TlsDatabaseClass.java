package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The class for {@link TlsDatabase}. Derived classes should implement the various
 * virtual methods. _async and _finish methods have a default
 * implementation that runs the corresponding sync method in a thread.
 * @version 2.30
 */
public class TlsDatabaseClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("verify_chain"),
        Interop.valueLayout.ADDRESS.withName("verify_chain_async"),
        Interop.valueLayout.ADDRESS.withName("verify_chain_finish"),
        Interop.valueLayout.ADDRESS.withName("create_certificate_handle"),
        Interop.valueLayout.ADDRESS.withName("lookup_certificate_for_handle"),
        Interop.valueLayout.ADDRESS.withName("lookup_certificate_for_handle_async"),
        Interop.valueLayout.ADDRESS.withName("lookup_certificate_for_handle_finish"),
        Interop.valueLayout.ADDRESS.withName("lookup_certificate_issuer"),
        Interop.valueLayout.ADDRESS.withName("lookup_certificate_issuer_async"),
        Interop.valueLayout.ADDRESS.withName("lookup_certificate_issuer_finish"),
        Interop.valueLayout.ADDRESS.withName("lookup_certificates_issued_by"),
        Interop.valueLayout.ADDRESS.withName("lookup_certificates_issued_by_async"),
        Interop.valueLayout.ADDRESS.withName("lookup_certificates_issued_by_finish"),
        MemoryLayout.sequenceLayout(16, ValueLayout.ADDRESS).withName("padding")
    ).withName("GTlsDatabaseClass");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public TlsDatabaseClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
