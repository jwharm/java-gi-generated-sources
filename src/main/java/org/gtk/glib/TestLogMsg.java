package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TestLogMsg extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTestLogMsg";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("log_type"),
        ValueLayout.JAVA_INT.withName("n_strings"),
        Interop.valueLayout.ADDRESS.withName("strings"),
        ValueLayout.JAVA_INT.withName("n_nums"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("nums")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static TestLogMsg allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TestLogMsg newInstance = new TestLogMsg(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code log_type}
     * @return The value of the field {@code log_type}
     */
    public org.gtk.glib.TestLogType log_type$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("log_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.TestLogType(RESULT);
    }
    
    /**
     * Change the value of the field {@code log_type}
     * @param log_type The new value of the field {@code log_type}
     */
    public void log_type$set(org.gtk.glib.TestLogType log_type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("log_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), log_type.getValue());
    }
    
    /**
     * Get the value of the field {@code n_strings}
     * @return The value of the field {@code n_strings}
     */
    public int n_strings$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_strings"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code n_strings}
     * @param n_strings The new value of the field {@code n_strings}
     */
    public void n_strings$set(int n_strings) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_strings"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), n_strings);
    }
    
    /**
     * Get the value of the field {@code strings}
     * @return The value of the field {@code strings}
     */
    public PointerString strings$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("strings"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerString(RESULT);
    }
    
    /**
     * Change the value of the field {@code strings}
     * @param strings The new value of the field {@code strings}
     */
    public void strings$set(PointerString strings) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("strings"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), strings.handle());
    }
    
    /**
     * Get the value of the field {@code n_nums}
     * @return The value of the field {@code n_nums}
     */
    public int n_nums$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_nums"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code n_nums}
     * @param n_nums The new value of the field {@code n_nums}
     */
    public void n_nums$set(int n_nums) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_nums"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), n_nums);
    }
    
    /**
     * Get the value of the field {@code nums}
     * @return The value of the field {@code nums}
     */
    public PointerDouble nums$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("nums"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerDouble(RESULT);
    }
    
    /**
     * Change the value of the field {@code nums}
     * @param nums The new value of the field {@code nums}
     */
    public void nums$set(PointerDouble nums) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("nums"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), nums.handle());
    }
    
    @ApiStatus.Internal
    public TestLogMsg(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Internal function for gtester to free test log messages, no ABI guarantees provided.
     */
    public void free() {
        try {
            DowncallHandles.g_test_log_msg_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_test_log_msg_free = Interop.downcallHandle(
            "g_test_log_msg_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
    }
}
