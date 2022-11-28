package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A GParamSpec derived structure that contains the meta data for fractional
 * properties.
 */
public class ParamSpecFraction extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstParamSpecFraction";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ParamSpec.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.C_INT.withName("min_num"),
        Interop.valueLayout.C_INT.withName("min_den"),
        Interop.valueLayout.C_INT.withName("max_num"),
        Interop.valueLayout.C_INT.withName("max_den"),
        Interop.valueLayout.C_INT.withName("def_num"),
        Interop.valueLayout.C_INT.withName("def_den")
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
     * Allocate a new {@link ParamSpecFraction}
     * @return A new, uninitialized @{link ParamSpecFraction}
     */
    public static ParamSpecFraction allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ParamSpecFraction newInstance = new ParamSpecFraction(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.ParamSpec parentInstance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.ParamSpec(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code min_num}
     * @return The value of the field {@code min_num}
     */
    public int minNum$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("min_num"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code min_num}
     * @param minNum The new value of the field {@code min_num}
     */
    public void minNum$set(int minNum) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("min_num"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), minNum);
    }
    
    /**
     * Get the value of the field {@code min_den}
     * @return The value of the field {@code min_den}
     */
    public int minDen$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("min_den"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code min_den}
     * @param minDen The new value of the field {@code min_den}
     */
    public void minDen$set(int minDen) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("min_den"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), minDen);
    }
    
    /**
     * Get the value of the field {@code max_num}
     * @return The value of the field {@code max_num}
     */
    public int maxNum$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("max_num"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code max_num}
     * @param maxNum The new value of the field {@code max_num}
     */
    public void maxNum$set(int maxNum) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("max_num"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), maxNum);
    }
    
    /**
     * Get the value of the field {@code max_den}
     * @return The value of the field {@code max_den}
     */
    public int maxDen$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("max_den"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code max_den}
     * @param maxDen The new value of the field {@code max_den}
     */
    public void maxDen$set(int maxDen) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("max_den"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), maxDen);
    }
    
    /**
     * Get the value of the field {@code def_num}
     * @return The value of the field {@code def_num}
     */
    public int defNum$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("def_num"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code def_num}
     * @param defNum The new value of the field {@code def_num}
     */
    public void defNum$set(int defNum) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("def_num"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), defNum);
    }
    
    /**
     * Get the value of the field {@code def_den}
     * @return The value of the field {@code def_den}
     */
    public int defDen$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("def_den"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code def_den}
     * @param defDen The new value of the field {@code def_den}
     */
    public void defDen$set(int defDen) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("def_den"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), defDen);
    }
    
    /**
     * Create a ParamSpecFraction proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ParamSpecFraction(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ParamSpecFraction struct;
        
         /**
         * A {@link ParamSpecFraction.Build} object constructs a {@link ParamSpecFraction} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ParamSpecFraction.allocate();
        }
        
         /**
         * Finish building the {@link ParamSpecFraction} struct.
         * @return A new instance of {@code ParamSpecFraction} with the fields 
         *         that were set in the Build object.
         */
        public ParamSpecFraction construct() {
            return struct;
        }
        
        /**
         * super class
         * @param parentInstance The value for the {@code parentInstance} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentInstance(org.gtk.gobject.ParamSpec parentInstance) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_instance"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentInstance == null ? MemoryAddress.NULL : parentInstance.handle()));
            return this;
        }
        
        /**
         * minimal numerator
         * @param minNum The value for the {@code minNum} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMinNum(int minNum) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("min_num"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), minNum);
            return this;
        }
        
        /**
         * minimal denominator
         * @param minDen The value for the {@code minDen} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMinDen(int minDen) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("min_den"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), minDen);
            return this;
        }
        
        /**
         * maximal numerator
         * @param maxNum The value for the {@code maxNum} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMaxNum(int maxNum) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("max_num"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), maxNum);
            return this;
        }
        
        /**
         * maximal denominator
         * @param maxDen The value for the {@code maxDen} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMaxDen(int maxDen) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("max_den"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), maxDen);
            return this;
        }
        
        /**
         * default numerator
         * @param defNum The value for the {@code defNum} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDefNum(int defNum) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("def_num"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), defNum);
            return this;
        }
        
        /**
         * default denominator
         * @param defDen The value for the {@code defDen} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDefDen(int defDen) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("def_den"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), defDen);
            return this;
        }
    }
}
