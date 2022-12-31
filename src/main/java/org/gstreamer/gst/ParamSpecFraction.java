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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ParamSpec.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.C_INT.withName("min_num"),
            Interop.valueLayout.C_INT.withName("min_den"),
            Interop.valueLayout.C_INT.withName("max_num"),
            Interop.valueLayout.C_INT.withName("max_den"),
            Interop.valueLayout.C_INT.withName("def_num"),
            Interop.valueLayout.C_INT.withName("def_den")
        ).withName(C_TYPE_NAME);
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
    public org.gtk.gobject.ParamSpec getParentInstance() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return (org.gtk.gobject.ParamSpec) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(((MemoryAddress) handle()).addOffset(OFFSET))), org.gtk.gobject.ParamSpec.fromAddress).marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_instance}
     * @param parentInstance The new value of the field {@code parent_instance}
     */
    public void setParentInstance(org.gtk.gobject.ParamSpec parentInstance) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_instance"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentInstance == null ? MemoryAddress.NULL : parentInstance.handle()));
    }
    
    /**
     * Get the value of the field {@code min_num}
     * @return The value of the field {@code min_num}
     */
    public int getMinNum() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("min_num"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code min_num}
     * @param minNum The new value of the field {@code min_num}
     */
    public void setMinNum(int minNum) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("min_num"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), minNum);
    }
    
    /**
     * Get the value of the field {@code min_den}
     * @return The value of the field {@code min_den}
     */
    public int getMinDen() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("min_den"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code min_den}
     * @param minDen The new value of the field {@code min_den}
     */
    public void setMinDen(int minDen) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("min_den"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), minDen);
    }
    
    /**
     * Get the value of the field {@code max_num}
     * @return The value of the field {@code max_num}
     */
    public int getMaxNum() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("max_num"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code max_num}
     * @param maxNum The new value of the field {@code max_num}
     */
    public void setMaxNum(int maxNum) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("max_num"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), maxNum);
    }
    
    /**
     * Get the value of the field {@code max_den}
     * @return The value of the field {@code max_den}
     */
    public int getMaxDen() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("max_den"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code max_den}
     * @param maxDen The new value of the field {@code max_den}
     */
    public void setMaxDen(int maxDen) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("max_den"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), maxDen);
    }
    
    /**
     * Get the value of the field {@code def_num}
     * @return The value of the field {@code def_num}
     */
    public int getDefNum() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("def_num"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code def_num}
     * @param defNum The new value of the field {@code def_num}
     */
    public void setDefNum(int defNum) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("def_num"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), defNum);
    }
    
    /**
     * Get the value of the field {@code def_den}
     * @return The value of the field {@code def_den}
     */
    public int getDefDen() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("def_den"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code def_den}
     * @param defDen The new value of the field {@code def_den}
     */
    public void setDefDen(int defDen) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("def_den"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), defDen);
    }
    
    /**
     * Create a ParamSpecFraction proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ParamSpecFraction(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ParamSpecFraction> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ParamSpecFraction(input, ownership);
    
    /**
     * A {@link ParamSpecFraction.Builder} object constructs a {@link ParamSpecFraction} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ParamSpecFraction.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ParamSpecFraction struct;
        
        private Builder() {
            struct = ParamSpecFraction.allocate();
        }
        
         /**
         * Finish building the {@link ParamSpecFraction} struct.
         * @return A new instance of {@code ParamSpecFraction} with the fields 
         *         that were set in the Builder object.
         */
        public ParamSpecFraction build() {
            return struct;
        }
        
        /**
         * super class
         * @param parentInstance The value for the {@code parentInstance} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentInstance(org.gtk.gobject.ParamSpec parentInstance) {
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
        public Builder setMinNum(int minNum) {
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
        public Builder setMinDen(int minDen) {
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
        public Builder setMaxNum(int maxNum) {
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
        public Builder setMaxDen(int maxDen) {
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
        public Builder setDefNum(int defNum) {
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
        public Builder setDefDen(int defDen) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("def_den"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), defDen);
            return this;
        }
    }
}
