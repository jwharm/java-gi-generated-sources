package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The class for {@link TlsInteraction}. Derived classes implement the various
 * virtual interaction methods to handle TLS interactions.
 * <p>
 * Derived classes can choose to implement whichever interactions methods they'd
 * like to support by overriding those virtual methods in their class
 * initialization function. If a derived class implements an async method,
 * it must also implement the corresponding finish method.
 * <p>
 * The synchronous interaction methods should implement to display modal dialogs,
 * and the asynchronous methods to display modeless dialogs.
 * <p>
 * If the user cancels an interaction, then the result should be
 * {@link TlsInteractionResult#FAILED} and the error should be set with a domain of
 * {@code G_IO_ERROR} and code of {@link IOErrorEnum#CANCELLED}.
 * @version 2.30
 */
public class TlsInteractionClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTlsInteractionClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("ask_password"),
        Interop.valueLayout.ADDRESS.withName("ask_password_async"),
        Interop.valueLayout.ADDRESS.withName("ask_password_finish"),
        Interop.valueLayout.ADDRESS.withName("request_certificate"),
        Interop.valueLayout.ADDRESS.withName("request_certificate_async"),
        Interop.valueLayout.ADDRESS.withName("request_certificate_finish"),
        MemoryLayout.paddingLayout(896),
        MemoryLayout.sequenceLayout(21, ValueLayout.ADDRESS).withName("padding")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static TlsInteractionClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TlsInteractionClass newInstance = new TlsInteractionClass(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public TlsInteractionClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
