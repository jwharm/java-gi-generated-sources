package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TestConfig extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTestConfig";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("test_initialized"),
        Interop.valueLayout.C_INT.withName("test_quick"),
        Interop.valueLayout.C_INT.withName("test_perf"),
        Interop.valueLayout.C_INT.withName("test_verbose"),
        Interop.valueLayout.C_INT.withName("test_quiet"),
        Interop.valueLayout.C_INT.withName("test_undefined")
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
    
    /**
     * Allocate a new {@link TestConfig}
     * @return A new, uninitialized @{link TestConfig}
     */
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
    public boolean testInitialized$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_initialized"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code test_initialized}
     * @param testInitialized The new value of the field {@code test_initialized}
     */
    public void testInitialized$set(boolean testInitialized) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_initialized"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), testInitialized ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code test_quick}
     * @return The value of the field {@code test_quick}
     */
    public boolean testQuick$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_quick"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code test_quick}
     * @param testQuick The new value of the field {@code test_quick}
     */
    public void testQuick$set(boolean testQuick) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_quick"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), testQuick ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code test_perf}
     * @return The value of the field {@code test_perf}
     */
    public boolean testPerf$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_perf"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code test_perf}
     * @param testPerf The new value of the field {@code test_perf}
     */
    public void testPerf$set(boolean testPerf) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_perf"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), testPerf ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code test_verbose}
     * @return The value of the field {@code test_verbose}
     */
    public boolean testVerbose$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_verbose"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code test_verbose}
     * @param testVerbose The new value of the field {@code test_verbose}
     */
    public void testVerbose$set(boolean testVerbose) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_verbose"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), testVerbose ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code test_quiet}
     * @return The value of the field {@code test_quiet}
     */
    public boolean testQuiet$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_quiet"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code test_quiet}
     * @param testQuiet The new value of the field {@code test_quiet}
     */
    public void testQuiet$set(boolean testQuiet) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_quiet"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), testQuiet ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code test_undefined}
     * @return The value of the field {@code test_undefined}
     */
    public boolean testUndefined$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_undefined"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code test_undefined}
     * @param testUndefined The new value of the field {@code test_undefined}
     */
    public void testUndefined$set(boolean testUndefined) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_undefined"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), testUndefined ? 1 : 0);
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

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private TestConfig struct;
        
         /**
         * A {@link TestConfig.Build} object constructs a {@link TestConfig} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = TestConfig.allocate();
        }
        
         /**
         * Finish building the {@link TestConfig} struct.
         * @return A new instance of {@code TestConfig} with the fields 
         *         that were set in the Build object.
         */
        public TestConfig construct() {
            return struct;
        }
        
        public Build setTestInitialized(boolean testInitialized) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("test_initialized"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), testInitialized ? 1 : 0);
            return this;
        }
        
        public Build setTestQuick(boolean testQuick) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("test_quick"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), testQuick ? 1 : 0);
            return this;
        }
        
        public Build setTestPerf(boolean testPerf) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("test_perf"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), testPerf ? 1 : 0);
            return this;
        }
        
        public Build setTestVerbose(boolean testVerbose) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("test_verbose"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), testVerbose ? 1 : 0);
            return this;
        }
        
        public Build setTestQuiet(boolean testQuiet) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("test_quiet"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), testQuiet ? 1 : 0);
            return this;
        }
        
        public Build setTestUndefined(boolean testUndefined) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("test_undefined"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), testUndefined ? 1 : 0);
            return this;
        }
    }
}
