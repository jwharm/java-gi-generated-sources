package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Stores probabilities updates. This is from the spec
 * and can be used as a binary.
 * @version 1.20
 */
public class Vp9DeltaProbabilities extends Struct {
    
    static {
        GstCodecs.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVp9DeltaProbabilities";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(2, Interop.valueLayout.C_BYTE).withName("tx_probs_8x8"),
        MemoryLayout.paddingLayout(16),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_BYTE).withName("tx_probs_16x16"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.sequenceLayout(6, Interop.valueLayout.C_BYTE).withName("tx_probs_32x32"),
        MemoryLayout.paddingLayout(13680),
        MemoryLayout.sequenceLayout(1728, Interop.valueLayout.C_BYTE).withName("coef"),
        MemoryLayout.sequenceLayout(3, Interop.valueLayout.C_BYTE).withName("skip"),
        MemoryLayout.paddingLayout(48),
        MemoryLayout.sequenceLayout(21, Interop.valueLayout.C_BYTE).withName("inter_mode"),
        MemoryLayout.paddingLayout(16),
        MemoryLayout.sequenceLayout(8, Interop.valueLayout.C_BYTE).withName("interp_filter"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_BYTE).withName("is_inter"),
        MemoryLayout.sequenceLayout(5, Interop.valueLayout.C_BYTE).withName("comp_mode"),
        MemoryLayout.paddingLayout(40),
        MemoryLayout.sequenceLayout(10, Interop.valueLayout.C_BYTE).withName("single_ref"),
        MemoryLayout.sequenceLayout(5, Interop.valueLayout.C_BYTE).withName("comp_ref"),
        MemoryLayout.paddingLayout(24),
        MemoryLayout.sequenceLayout(36, Interop.valueLayout.C_BYTE).withName("y_mode"),
        MemoryLayout.paddingLayout(288),
        MemoryLayout.sequenceLayout(48, Interop.valueLayout.C_BYTE).withName("partition"),
        org.gstreamer.codecs.Vp9MvDeltaProbs.getMemoryLayout().withName("mv")
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
     * Allocate a new {@link Vp9DeltaProbabilities}
     * @return A new, uninitialized @{link Vp9DeltaProbabilities}
     */
    public static Vp9DeltaProbabilities allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Vp9DeltaProbabilities newInstance = new Vp9DeltaProbabilities(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Vp9DeltaProbabilities proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Vp9DeltaProbabilities(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private Vp9DeltaProbabilities struct;
        
         /**
         * A {@link Vp9DeltaProbabilities.Build} object constructs a {@link Vp9DeltaProbabilities} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = Vp9DeltaProbabilities.allocate();
        }
        
         /**
         * Finish building the {@link Vp9DeltaProbabilities} struct.
         * @return A new instance of {@code Vp9DeltaProbabilities} with the fields 
         *         that were set in the Build object.
         */
        public Vp9DeltaProbabilities construct() {
            return struct;
        }
        
        public Build setTxProbs8x8(byte[] txProbs8x8) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tx_probs_8x8"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (txProbs8x8 == null ? MemoryAddress.NULL : Interop.allocateNativeArray(txProbs8x8, false)));
            return this;
        }
        
        public Build setTxProbs16x16(byte[] txProbs16x16) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tx_probs_16x16"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (txProbs16x16 == null ? MemoryAddress.NULL : Interop.allocateNativeArray(txProbs16x16, false)));
            return this;
        }
        
        public Build setTxProbs32x32(byte[] txProbs32x32) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tx_probs_32x32"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (txProbs32x32 == null ? MemoryAddress.NULL : Interop.allocateNativeArray(txProbs32x32, false)));
            return this;
        }
        
        public Build setCoef(byte[] coef) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("coef"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (coef == null ? MemoryAddress.NULL : Interop.allocateNativeArray(coef, false)));
            return this;
        }
        
        public Build setSkip(byte[] skip) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("skip"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (skip == null ? MemoryAddress.NULL : Interop.allocateNativeArray(skip, false)));
            return this;
        }
        
        public Build setInterMode(byte[] interMode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("inter_mode"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (interMode == null ? MemoryAddress.NULL : Interop.allocateNativeArray(interMode, false)));
            return this;
        }
        
        public Build setInterpFilter(byte[] interpFilter) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("interp_filter"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (interpFilter == null ? MemoryAddress.NULL : Interop.allocateNativeArray(interpFilter, false)));
            return this;
        }
        
        public Build setIsInter(byte[] isInter) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_inter"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (isInter == null ? MemoryAddress.NULL : Interop.allocateNativeArray(isInter, false)));
            return this;
        }
        
        public Build setCompMode(byte[] compMode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("comp_mode"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (compMode == null ? MemoryAddress.NULL : Interop.allocateNativeArray(compMode, false)));
            return this;
        }
        
        public Build setSingleRef(byte[] singleRef) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("single_ref"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (singleRef == null ? MemoryAddress.NULL : Interop.allocateNativeArray(singleRef, false)));
            return this;
        }
        
        public Build setCompRef(byte[] compRef) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("comp_ref"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (compRef == null ? MemoryAddress.NULL : Interop.allocateNativeArray(compRef, false)));
            return this;
        }
        
        public Build setYMode(byte[] yMode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("y_mode"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (yMode == null ? MemoryAddress.NULL : Interop.allocateNativeArray(yMode, false)));
            return this;
        }
        
        public Build setPartition(byte[] partition) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("partition"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (partition == null ? MemoryAddress.NULL : Interop.allocateNativeArray(partition, false)));
            return this;
        }
        
        public Build setMv(org.gstreamer.codecs.Vp9MvDeltaProbs mv) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mv"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mv == null ? MemoryAddress.NULL : mv.handle()));
            return this;
        }
    }
}
