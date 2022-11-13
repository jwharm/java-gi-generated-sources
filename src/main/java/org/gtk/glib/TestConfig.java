package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TestConfig extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTestConfig";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("test_initialized"),
        ValueLayout.JAVA_INT.withName("test_quick"),
        ValueLayout.JAVA_INT.withName("test_perf"),
        ValueLayout.JAVA_INT.withName("test_verbose"),
        ValueLayout.JAVA_INT.withName("test_quiet"),
        ValueLayout.JAVA_INT.withName("test_undefined")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static TestConfig allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TestConfig newInstance = new TestConfig(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code test_initialized}
     * @return The value of the field {@code test_initialized}
     */
    public boolean test_initialized$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_initialized"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code test_initialized}
     * @param test_initialized The new value of the field {@code test_initialized}
     */
    public void test_initialized$set(boolean test_initialized) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_initialized"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), test_initialized ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code test_quick}
     * @return The value of the field {@code test_quick}
     */
    public boolean test_quick$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_quick"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code test_quick}
     * @param test_quick The new value of the field {@code test_quick}
     */
    public void test_quick$set(boolean test_quick) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_quick"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), test_quick ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code test_perf}
     * @return The value of the field {@code test_perf}
     */
    public boolean test_perf$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_perf"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code test_perf}
     * @param test_perf The new value of the field {@code test_perf}
     */
    public void test_perf$set(boolean test_perf) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_perf"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), test_perf ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code test_verbose}
     * @return The value of the field {@code test_verbose}
     */
    public boolean test_verbose$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_verbose"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code test_verbose}
     * @param test_verbose The new value of the field {@code test_verbose}
     */
    public void test_verbose$set(boolean test_verbose) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_verbose"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), test_verbose ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code test_quiet}
     * @return The value of the field {@code test_quiet}
     */
    public boolean test_quiet$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_quiet"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code test_quiet}
     * @param test_quiet The new value of the field {@code test_quiet}
     */
    public void test_quiet$set(boolean test_quiet) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_quiet"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), test_quiet ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code test_undefined}
     * @return The value of the field {@code test_undefined}
     */
    public boolean test_undefined$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_undefined"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code test_undefined}
     * @param test_undefined The new value of the field {@code test_undefined}
     */
    public void test_undefined$set(boolean test_undefined) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_undefined"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), test_undefined ? 1 : 0);
    }
    
    /**
     * Create a TestConfig proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TestConfig(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
