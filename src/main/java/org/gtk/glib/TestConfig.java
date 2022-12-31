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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("test_initialized"),
            Interop.valueLayout.C_INT.withName("test_quick"),
            Interop.valueLayout.C_INT.withName("test_perf"),
            Interop.valueLayout.C_INT.withName("test_verbose"),
            Interop.valueLayout.C_INT.withName("test_quiet"),
            Interop.valueLayout.C_INT.withName("test_undefined")
        ).withName(C_TYPE_NAME);
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
    public boolean getTestInitialized() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_initialized"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code test_initialized}
     * @param testInitialized The new value of the field {@code test_initialized}
     */
    public void setTestInitialized(boolean testInitialized) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_initialized"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(testInitialized, null).intValue());
    }
    
    /**
     * Get the value of the field {@code test_quick}
     * @return The value of the field {@code test_quick}
     */
    public boolean getTestQuick() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_quick"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code test_quick}
     * @param testQuick The new value of the field {@code test_quick}
     */
    public void setTestQuick(boolean testQuick) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_quick"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(testQuick, null).intValue());
    }
    
    /**
     * Get the value of the field {@code test_perf}
     * @return The value of the field {@code test_perf}
     */
    public boolean getTestPerf() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_perf"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code test_perf}
     * @param testPerf The new value of the field {@code test_perf}
     */
    public void setTestPerf(boolean testPerf) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_perf"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(testPerf, null).intValue());
    }
    
    /**
     * Get the value of the field {@code test_verbose}
     * @return The value of the field {@code test_verbose}
     */
    public boolean getTestVerbose() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_verbose"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code test_verbose}
     * @param testVerbose The new value of the field {@code test_verbose}
     */
    public void setTestVerbose(boolean testVerbose) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_verbose"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(testVerbose, null).intValue());
    }
    
    /**
     * Get the value of the field {@code test_quiet}
     * @return The value of the field {@code test_quiet}
     */
    public boolean getTestQuiet() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_quiet"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code test_quiet}
     * @param testQuiet The new value of the field {@code test_quiet}
     */
    public void setTestQuiet(boolean testQuiet) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_quiet"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(testQuiet, null).intValue());
    }
    
    /**
     * Get the value of the field {@code test_undefined}
     * @return The value of the field {@code test_undefined}
     */
    public boolean getTestUndefined() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_undefined"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code test_undefined}
     * @param testUndefined The new value of the field {@code test_undefined}
     */
    public void setTestUndefined(boolean testUndefined) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("test_undefined"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(testUndefined, null).intValue());
    }
    
    /**
     * Create a TestConfig proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TestConfig(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TestConfig> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TestConfig(input, ownership);
    
    /**
     * A {@link TestConfig.Builder} object constructs a {@link TestConfig} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TestConfig.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TestConfig struct;
        
        private Builder() {
            struct = TestConfig.allocate();
        }
        
         /**
         * Finish building the {@link TestConfig} struct.
         * @return A new instance of {@code TestConfig} with the fields 
         *         that were set in the Builder object.
         */
        public TestConfig build() {
            return struct;
        }
        
        public Builder setTestInitialized(boolean testInitialized) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("test_initialized"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(testInitialized, null).intValue());
            return this;
        }
        
        public Builder setTestQuick(boolean testQuick) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("test_quick"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(testQuick, null).intValue());
            return this;
        }
        
        public Builder setTestPerf(boolean testPerf) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("test_perf"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(testPerf, null).intValue());
            return this;
        }
        
        public Builder setTestVerbose(boolean testVerbose) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("test_verbose"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(testVerbose, null).intValue());
            return this;
        }
        
        public Builder setTestQuiet(boolean testQuiet) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("test_quiet"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(testQuiet, null).intValue());
            return this;
        }
        
        public Builder setTestUndefined(boolean testUndefined) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("test_undefined"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(testUndefined, null).intValue());
            return this;
        }
    }
}
